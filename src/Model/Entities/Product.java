package Model.Entities;

public class Product {
    private String code;
    private String nameProduct;
    private double price;
    private int quantity;

    /**
     * Cadastra uma nova peça
     * @param code codigo do produto
     * @param nameProduct nome do produto
     * @param price preço
     * @param quantity quantidade de peças adicionadas do no estoque
     */
    public Product(String code, String nameProduct, double price, int quantity) {
        this.code = code;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Cadastra um novo serviço
     * @param nameProduct nome do serviço
     * @param price preço
     */
    public Product(String nameProduct, double price){
        this.nameProduct = nameProduct;
        this.price = price;
    }
    public String toStringProduct() {
        return "Product{" + "\n" +
                "code='" + code + "\n" +
                "nameProduct='" + nameProduct + "\n" +
                "price=" + price + "\n" +
                "quantity=" + quantity + "\n" +
                '}';
    }
    public String toStringService() {
        return "Service{" + " \n " + nameProduct +
                " price = " + price + " \n" +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
