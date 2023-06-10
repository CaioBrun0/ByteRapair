package Model.DAOImp;

import Model.DAOInter.ManagerDAO;
import Model.Entities.Product;
import Model.Invoice;

import static Model.Invoice.invoiceList;

/**
 * @author Caio Bruno Oliveira
 */

public class ManagerDAOImp implements ManagerDAO {
    Model.DAOImp.StockDAOImp p1 = new Model.DAOImp.StockDAOImp();

    @Override
    public void manageStockProdut(String code, String nameProduct, double price, int quantity) {
        Product product = new Product(code, nameProduct, price, quantity);
        Model.DAOImp.StockDAOImp newProduct = new Model.DAOImp.StockDAOImp();
        newProduct.addProduct(product);

        Product product1 = new Product(code, nameProduct, price, quantity);
        Model.DAOImp.StockDAOImp newProduct1 = new Model.DAOImp.StockDAOImp();
        newProduct1.addProduct(product1);

    }

    public void manageStockService(String nameProduct, double price){
        Product service = new Product(nameProduct, price);
        Model.DAOImp.StockDAOImp newService = new Model.DAOImp.StockDAOImp();
        newService.addService(service);


    }

    public void viewReports(){
        for (Invoice invoice : invoiceList){
            System.out.println(invoice);
        }
    }

    public void viewCLients() {
        Model.DAOImp.ClientDAOImp c = new Model.DAOImp.ClientDAOImp();
        c.jsonRead("Clientes.json");

    }
}
