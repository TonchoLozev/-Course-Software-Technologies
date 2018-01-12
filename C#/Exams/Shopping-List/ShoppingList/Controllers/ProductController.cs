using System.Linq;
using System.Web.Mvc;
using ShoppingList.Models;

namespace ShoppingList.Controllers
{
    [ValidateInput(false)]
    public class ProductController : Controller
    {

        private ShoppingListDbContext database = new ShoppingListDbContext();

        [HttpGet]
        [Route("")]
        public ActionResult Index()
        {
            var products = database.Products.ToList();
            return View(products);
        }

        [HttpGet]
        [Route("create")]
        public ActionResult Create()
        {
            return View(new Product());
        }

        [HttpPost]
        [Route("create")]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Product product)
        {

            if (this.ModelState.IsValid)
            {
                database.Products.Add(product);
                database.SaveChanges();
                return Redirect("/");
            }

            return View(product);
        }

        [HttpGet]
        [Route("edit/{id}")]
        public ActionResult Edit(int? id)
        {

            var product = database.Products.Find(id);
            if (product == null)
            {
                return HttpNotFound();
            }

            return View(product);
        }

        [HttpPost]
        [Route("edit/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult EditConfirm(int? id, Product productModel)
        {

            var productFromDb = database.Products.Find(id);
            if (productFromDb == null)
            {
                return HttpNotFound();
            }

            if (this.ModelState.IsValid)
            {
                productFromDb.Name = productModel.Name;
                productFromDb.Priority = productModel.Priority;
                productFromDb.Quantity = productModel.Quantity;
                productFromDb.Status = productModel.Status;

                database.SaveChanges();

                return Redirect("/");
            }

            return View("Edit", productModel);
        }
    }
}
