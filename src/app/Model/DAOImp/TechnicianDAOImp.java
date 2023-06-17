package app.Model.DAOImp;

import app.Model.DAOInter.TechnicianDAO;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;

/**
 * @author Caio Bruno Oliveira
 */


public class TechnicianDAOImp implements TechnicianDAO {
    int invoiceID = 0;
    app.Model.DAOImp.OSDAOImp os1 = new app.Model.DAOImp.OSDAOImp();

    public void takeService(){os1.changeStatus();}

    public void finishService(String CPF, String name) {
        invoiceID++;
        app.Model.DAOImp.OSDAOImp os2 = new app.Model.DAOImp.OSDAOImp();
        double value = 0;
        value = os2.finishAndValue(CPF);

        //GERANDO FATURA
        Date date = new Date();
        app.Model.DAOImp.InvoiceDAOImp invoice = new app.Model.DAOImp.InvoiceDAOImp();
        if (value > 0) {
            try {
                FileReader reader = new FileReader("OS.json");

                Gson gson = new Gson();
                JsonObject jsonElement = gson.fromJson(reader, JsonObject.class);

                invoice.createInvoice((String.valueOf(invoiceID)), "ByteRepair", "42.375.088/0001-76", CPF, name, date,"15 dias", value);

                FileWriter writer = new FileWriter("OS.json");
                gson.toJson(jsonElement, writer);
                writer.flush();
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (value == 0 || value < 0) {
            System.out.println("OS não encontrada!");
        }
    }


}
