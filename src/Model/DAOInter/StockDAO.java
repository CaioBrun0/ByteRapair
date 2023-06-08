package Model.DAOInter;

import Model.Entities.Product;

public interface StockDAO {
    public void addProduct(Product product);
    public void addService(Product service);
    public void removerProduct(Product product);
}
