package app.Model.DAOInter;

import app.Model.Invoice;

import java.util.Date;

public interface InvoiceDAO {
    public void createInvoice(String idInvoice, String nameCompany, String cnpj, String idClient, String nameClient, Date dissue, String validity, double valor);
    public void updateInvoice(String idInvoice);
    public void viewInvoid();
    public void WriteJsonInvoice(Invoice i1);
}
