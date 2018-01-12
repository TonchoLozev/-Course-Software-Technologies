using System.Linq;
using System.Net;
using System.Web.Mvc;
using IMDB.Models;

namespace IMDB.Controllers
{
    [ValidateInput(false)]
    public class FilmController : Controller
    {
        [HttpGet]
        [Route("")]
        public ActionResult Index()
        {
            var database = new IMDBDbContext();
            var films = database.Films.ToList();
            return View(films);
        }

        [HttpGet]
        [Route("create")]
        public ActionResult Create()
        {
            return View("Create");
        }

        [HttpPost]
        [Route("create")]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Film film)
        {
            //TODO: Implement me ...
            if (ModelState.IsValid)
            {
                using (var database = new IMDBDbContext())
                {
                    database.Films.Add(film);
                    database.SaveChanges();

                    return RedirectToAction("Index");
                }
            }
            return View();
        }

        [HttpGet]
        [Route("edit/{id}")]
        public ActionResult Edit(int? id)
        {
            using (var databse = new IMDBDbContext())
            {
                var film = databse.Films.Find(id);
                if (film != null)
                {
                    return View(film);
                }
            }
            return HttpNotFound();
        }

        [HttpPost]
        [Route("edit/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult EditConfirm(int? id, Film filmModel)
        {
            //TODO: Implement me ...
            var database = new IMDBDbContext();
            var filmgFromDb = database.Films.Find(id);

            if (filmgFromDb == null)
            {
                return HttpNotFound();
            }

            if (this.ModelState.IsValid)
            {
                filmgFromDb.Name = filmModel.Name;
                filmgFromDb.Genre = filmModel.Genre;
                filmgFromDb.Director = filmModel.Director;
                filmgFromDb.Year = filmModel.Year;

                database.SaveChanges();

                return RedirectToAction("Index");
            }
            return View("Edit", filmModel);
        }

        [HttpGet]
        [Route("delete/{id}")]
        public ActionResult Delete(int? id)
        {
            using (var databse = new IMDBDbContext())
            {
                var film = databse.Films.Find(id);
                if (film != null)
                {
                    return View(film);
                }
            }
            return HttpNotFound();
        }

        [HttpPost]
        [Route("delete/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirm(int? id, Film filmModel)
        {
            using (var database = new IMDBDbContext())
            {
                var film = database.Films.Find(id);
                if (film != null)
                {
                    database.Films.Remove(film);
                    database.SaveChanges();

                    return RedirectToAction("Index");
                }
                return HttpNotFound();
            }
        }
    }
}