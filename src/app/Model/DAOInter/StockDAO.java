package app.Model.DAOInter;

import app.Model.Entities.Product;

public interface StockDAO {
    public void addProduct(Product product);
    public void addService(Product service);
    public void removerProduct(Product product);
}
