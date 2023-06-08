package Model.DAOInter;

public interface ManagerDAO {
    public void manageStockProdut(String code, String nameProduct, double price, int quantity);
    public void manageStockService(String nameProduct, double price);
    public void viewReports();
}