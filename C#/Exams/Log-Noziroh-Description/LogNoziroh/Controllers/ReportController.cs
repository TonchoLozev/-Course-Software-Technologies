namespace LogNoziroh.Controllers
{
    using System.Collections.Generic;
    using System.Linq;
    using System.Web.Mvc;
    using Models;

    [ValidateInput(false)]
    public class ReportController : Controller
    {

        private LogNozirohDbContext db = new LogNozirohDbContext();

        [HttpGet]
        [Route("")]
        public ActionResult Index()
        {
            //TODO: Implement me ...

            var reports = db.Reports.ToList();
            return View(reports);
        }

        [HttpGet]
        [Route("details/{id}")]
        public ActionResult Details(int id)
        {
            //TODO: Implement me ...

            var report = db.Reports.Find(id);
            if (report == null)
            {
                return HttpNotFound();
            }

            return View(report);
        }

        [HttpGet]
        [Route("create")]
        public ActionResult Create()
        {
            //TODO: Implement me ...

            return View(new Report());
        }

        [HttpPost]
        [Route("create")]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Report report)
        {
            //TODO: Implement me ...

            if (this.ModelState.IsValid)
            {
                db.Reports.Add(report);
                db.SaveChanges();
                return Redirect("/");
            }

            return View(report);
        }

        [HttpGet]
        [Route("delete/{id}")]
        public ActionResult Delete(int id)
        {
            //TODO: Implement me ...

            var report = db.Reports.Find(id);
            if (report == null)
            {
                return HttpNotFound();
            }

            return View(report);
        }

        [HttpPost]
        [Route("delete/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirm(int id, Report reportModel)
        {
            //TODO: Implement me ...

            var reportFromDb = db.Reports.Find(id);
            if (reportFromDb == null)
            {
                return HttpNotFound();
            }

            db.Reports.Remove(reportFromDb);
            db.SaveChanges();

            return Redirect("/");
        }
    }
}