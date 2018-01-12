using System.Linq;
using System.Web.Mvc;
using AnimeList.Models;

namespace AnimeList.Controllers
{
    [ValidateInput(false)]
    public class AnimeController : Controller
    {

        private AnimeListDbContext database = new AnimeListDbContext();

        [HttpGet]
        [Route("")]
        public ActionResult Index()
        {
            //TODO: Implement me ...
            var animes = database.Animes.ToList();
            return View(animes);
        }

        [HttpGet]
        [Route("create")]
        public ActionResult Create()
        {
            //TODO: Implement me ...
            return View(new Anime());
        }

        [HttpPost]
        [Route("create")]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Anime anime)
        {
            //TODO: Implement me ...
            if (this.ModelState.IsValid)
            {
                database.Animes.Add(anime);
                database.SaveChanges();
                return Redirect("/");
            }

            return View(anime);
        }

        [HttpGet]
        [Route("delete/{id}")]
        public ActionResult Delete(int? id)
        {
            //TODO: Implement me ...
            var anime = database.Animes.Find(id);
            if (anime == null)
            {

                return HttpNotFound();
            }

            return View(anime);
        }

        [HttpPost]
        [Route("delete/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirm(int? id, Anime animeModel)
        {
            //TODO: Implement me ...
            var animeFromDb = database.Animes.Find(id);
            if (animeFromDb == null)
            {
                return HttpNotFound();
            }

            database.Animes.Remove(animeFromDb);
            database.SaveChanges();

            return Redirect("/");
        }
    }
}