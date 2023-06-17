package app.Model.DAOImp;

import app.Main;
import app.Model.DAOInter.AttendantDAO;
import app.Model.ENUM.Payments;
import app.Model.ENUM.Status;
import app.Model.Entities.OS;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

import static app.Model.Entities.Client.listOS;

/**
 * @author Caio Bruno Oliveira
 */

public class AttendantDAOImp implements AttendantDAO {
    app.Model.DAOImp.ClientDAOImp c1 = new app.Model.DAOImp.ClientDAOImp();
    app.Model.DAOImp.OSDAOImp os1 = new app.Model.DAOImp.OSDAOImp();
    Status status = Status.WAITING;
    int osID = 0;


    public void callCClient(String CPF,String name, String nPhone, String email, String address){
        c1.createClient(CPF, name, nPhone, email, address);

    }

    public void callUClient(String CPF, String atribute, String newValue){
        c1.updateClient(CPF, atribute, newValue);
    }

    public void callDClient(String CPF){
        c1.deleteClient(CPF);

    }

    public void callRClient(String CPF){
        c1.viewClient(CPF);
    }

    //OS

    public void callCOS(String description, String CPF, ArrayList<String> parts){
        Date data = new Date();
        os1.createOS(description, data, status, CPF, parts);
    }


    public void callUOS(String clientID){
        os1.updateOS("11206768517");
    }

    public void callDOS(String clientID){
        os1.deleteOS("11206768517");
    }

    public void callROS(String clientID){
        os1.viewOS("11206768517");
    }
    public void viewAllOs(){
        os1.viewAllOS();
    }
    public void viewOS(String clientID){
        os1.viewOS("11206768517");}

    public void rPayment(String CPF, int type){
        Gson gson = new Gson();
        FileReader reader = null;

        try {
            File file = new File("Invoice.json");
            reader = new FileReader(file);

            JsonElement jsonElement = gson.fromJson(reader, JsonElement.class);

            if (jsonElement != null) {
                JsonArray invoiceList = jsonElement.getAsJsonObject().getAsJsonArray("InvoiceList");

                for (int i = 0; i < invoiceList.size(); i++) {
                    JsonObject invo = invoiceList.get(i).getAsJsonObject();

                    if (invo.get("idClient").getAsString().equals(CPF)) {
                        switch (type) {
                            case 1:
                                invo.addProperty("typePay", "Cartão de credito");
                                invo.addProperty("pay", true);

                                break;

                            case 2:
                                invo.addProperty("typePay", "Cartão de debito");
                                invo.addProperty("pay", true);
                                break;

                            case 3:
                                invo.addProperty("typePay", "PIX");
                                invo.addProperty("pay", true);
                                break;
                            case 4:
                                invo.addProperty("typePay", "Cash");
                                invo.addProperty("pay", true);

                                break;
                            case 0:
                                System.out.println("Voltando... \n");
                                break;

                        }
                    }


                }

            }
            FileWriter writer = new FileWriter("Invoice.json");
            gson.toJson(jsonElement, writer);

            writer.flush();
            writer.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        switch (type) {
            case 1:
                for (OS os : listOS) {
                    if (os.getClientID().equals("11206768517"))
                        os.setTypePay(Payments.CREDIT);
                    app.Model.DAOImp.InvoiceDAOImp invo = new app.Model.DAOImp.InvoiceDAOImp();
                    invo.updateInvoice("11206768517");
                }
                break;

            case 2:
                for (OS os : listOS) {
                    if (os.getClientID().equals("11206768517"))
                        os.setTypePay(Payments.DEBIT);
                }
                break;

            case 3:
                for (OS os : listOS) {
                    if (os.getClientID().equals("11206768517"))
                        os.setTypePay(Payments.PIX);
                }
                break;
            case 4:
                for (OS os : listOS) {
                    if (os.getClientID().equals("11206768517"))
                        os.setTypePay(Payments.CASH);
                }
                break;
            case 0:
                System.out.println("Voltando... \n");
                break;

        }
    }
}
