package app.Model.DAOImp;

import app.Model.DAOInter.ManagerDAO;
import app.Model.Entities.Product;
import app.Model.Invoice;

import static app.Model.Invoice.invoiceList;

/**
 * @author Caio Bruno Oliveira
 */

public class ManagerDAOImp implements ManagerDAO {
    app.Model.DAOImp.StockDAOImp p1 = new app.Model.DAOImp.StockDAOImp();

    @Override
    public void manageStockProdut(String code, String nameProduct, double price, int quantity) {
        Product product = new Product(code, nameProduct, price, quantity);
        app.Model.DAOImp.StockDAOImp newProduct = new app.Model.DAOImp.StockDAOImp();
        newProduct.addProduct(product);

        Product product1 = new Product(code, nameProduct, price, quantity);
        app.Model.DAOImp.StockDAOImp newProduct1 = new app.Model.DAOImp.StockDAOImp();
        newProduct1.addProduct(product1);

    }

    public void manageStockService(String nameProduct, double price){
        Product service = new Product(nameProduct, price);
        app.Model.DAOImp.StockDAOImp newService = new app.Model.DAOImp.StockDAOImp();
        newService.addService(service);


    }

    public void viewReports(){
        for (Invoice invoice : invoiceList){
            System.out.println(invoice);
        }
    }

    public void viewCLients() {
        app.Model.DAOImp.ClientDAOImp c = new app.Model.DAOImp.ClientDAOImp();
        c.jsonRead("Clientes.json");

    }
}
