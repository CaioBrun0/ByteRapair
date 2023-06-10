package Model.DAOImp;

import Model.DAOInter.InvoiceDAO;
import Model.Invoice;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.*;
import java.util.Date;

import static Model.Invoice.invoiceList;

/**
 * @author Caio Bruno Oliveira
 */
public class InvoiceDAOImp implements InvoiceDAO {

    public void createInvoice(String invoiceID, String nameCompany, String cnpj, String CPF, String nameClient, Date date, String validity, double value){
        Invoice i1 = new Invoice(String.valueOf(invoiceID), nameCompany, cnpj, CPF, nameClient, date, validity, value);
        InvoiceDAOImp invoice = new InvoiceDAOImp();
        invoice.WriteJsonInvoice(i1);
    }

    public void updateInvoice(String clientID){
        for (Invoice invoice : invoiceList){
            if(invoice.getIdClient().equals(clientID)){
                invoice.setPay(true);
            }
        }
    }

    public void viewInvoid(){
        for (Invoice invoice : invoiceList){
            System.out.printf(String.valueOf(invoice));
        }
    }

    public void WriteJsonInvoice(Invoice i1){
        Gson gson = new Gson();
        FileReader reader = null;

        try {
            File file = new File("Invoice.json");

            if (!file.exists()) {
                file.createNewFile();
            }

            reader = new FileReader(file);

            JsonElement jsonElement = gson.fromJson(reader, JsonElement.class);

            if (jsonElement != null) {

                JsonObject newInvoice = new JsonObject();

                newInvoice.addProperty("idInvoice", i1.getIdInvoice());
                newInvoice.addProperty("nameCompany", i1.getNameCompany());
                newInvoice.addProperty("cnpj", i1.getCnpj());
                newInvoice.addProperty("idClient", i1.getIdClient());
                newInvoice.addProperty("nameClient", i1.getNameClient());
                newInvoice.addProperty("date", String.valueOf(i1.getDate()));
                newInvoice.addProperty("validity", i1.getValidity());
                newInvoice.addProperty("value", i1.getValue());
                newInvoice.addProperty("typePay", "Não definido");
                newInvoice.addProperty("pay", i1.getPay());


                jsonElement.getAsJsonObject().getAsJsonArray("InvoiceList").add(newInvoice);

                FileWriter writer = new FileWriter("Invoice.json");
                gson.toJson(jsonElement, writer);

                writer.flush();
                writer.close();

            } else {

                JsonArray invoiceList = new JsonArray();

                System.out.println("Arquivo criado, você pode começar a guardar os produtos agora");
                JsonObject Invoice = new JsonObject();
                Invoice.add("InvoiceList", invoiceList);

                FileWriter writer = new FileWriter("Invoice.json", true);

                gson.toJson(Invoice, writer);
                writer.close();

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
