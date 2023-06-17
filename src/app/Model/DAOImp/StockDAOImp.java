package app.Model.DAOImp;

import app.Model.DAOInter.StockDAO;
import app.Model.Entities.Product;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.*;

import static app.Model.Stock.generalStock;

/**
 * @author Caio Bruno Oliveira
 */
public class StockDAOImp implements StockDAO {
    /**
     * Adicionando peça ou serviço nos seus repestivos arquivos
     * @param product peça ou serviço
     * @param
     * @see Product
     */
    public void addProduct(Product product){

        Gson gson = new Gson();
        FileReader reader = null;

        try {
            File file = new File("Produtos.json");

            if (!file.exists()) {
                file.createNewFile();
            }

            reader = new FileReader(file);

            JsonElement jsonElement = gson.fromJson(reader, JsonElement.class);

            if (jsonElement != null) {

                JsonObject newProduct = new JsonObject();

                newProduct.addProperty("code", product.getCode());
                newProduct.addProperty("nameProduct", product.getNameProduct());
                newProduct.addProperty("price", product.getPrice());
                newProduct.addProperty("quantity", product.getQuantity());

                jsonElement.getAsJsonObject().getAsJsonArray("productsList").add(newProduct);

                FileWriter writer = new FileWriter("Produtos.json");
                gson.toJson(jsonElement, writer);

                writer.flush();
                writer.close();

            } else {

                JsonArray producutsList = new JsonArray();

                System.out.println("Arquivo criado, você pode começar a guardar os produtos agora");
                JsonObject products = new JsonObject();
                products.add("productsList", producutsList);


                FileWriter writer = new FileWriter("Produtos.json", true);

                gson.toJson(products, writer);
                writer.close();

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void addService(Product service){
        Gson gson = new Gson();
        FileReader reader = null;

        try {
            File file = new File("Serviços.json");

            if (!file.exists()) {
                file.createNewFile();
            }

            reader = new FileReader(file);

            JsonElement jsonElement = gson.fromJson(reader, JsonElement.class);

            if (jsonElement != null) {

                JsonObject newService = new JsonObject();

                newService.addProperty("nameProduct", service.getNameProduct());
                newService.addProperty("price", service.getPrice());

                jsonElement.getAsJsonObject().getAsJsonArray("servicesList").add(newService);

                FileWriter writer = new FileWriter("Serviços.json");
                gson.toJson(jsonElement, writer);

                writer.flush();
                writer.close();

            } else {

                JsonArray servicesList = new JsonArray();

                System.out.println("Arquivo criado, você pode começar a guardar os serviços agora");
                JsonObject services = new JsonObject();
                services.add("servicesList", servicesList);


                FileWriter writer = new FileWriter("Serviços.json", true);

                gson.toJson(services, writer);
                writer.close();

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    /**
     * Remove peça da lista
     * @param product peça
     */
    public void removerProduct(Product product){
        for(Product productL : generalStock){
            if(product.equals(productL)){
                productL.setQuantity(-1);
            }
        }
    }


}