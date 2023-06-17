package app.Model;

import java.util.ArrayList;
import java.util.Date;

public class Invoice {
    private String idInvoice;
    private String nameCompany;
    private String cnpj;
    private String idClient;
    private String nameClient;
    private ArrayList Lparts;
    private Date date;
    private String validity;
    private double value;
    private boolean pay;

    public static ArrayList<Invoice> invoiceList = new ArrayList<Invoice>();

    /**
     * Cria uma nova fatura
     * @param idInvoice id da fatura
     * @param nameCompany nome da empresa
     * @param cnpj cnpj da empresa
     * @param idClient CPF do cliente
     * @param nameClient nome do cliente
     * @param date data
     * @param validity tempo de validade da fatura
     * @param value preço
     */
    public Invoice(String idInvoice, String nameCompany, String cnpj, String idClient, String nameClient, Date date, String validity, double value) {
        this.idInvoice = idInvoice;
        this.nameCompany = nameCompany;
        this.cnpj = cnpj;
        this.idClient = idClient;
        this.nameClient = nameClient;
        this.date = date;
        this.validity = validity;
        this.value = value;
        this.pay = false;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "idInvoice: " + idInvoice + '\n' +
                "Name company: " + nameCompany + '\n' +
                "cnpj: " + cnpj + '\n' +
                "Client CPF: " + idClient + '\n' +
                "Client name: " + nameClient + '\n' +
                "Date of issue: " + date + '\n' +
                "Validity: " + validity + '\n' +
                "Value: " + value + '\n' +
                "Pay? " + pay +
                '}';
    }

    public boolean getPay() {
        return pay;
    }

    public void setPay(boolean pay) {
        this.pay = pay;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(String idInvoice) {
        this.idInvoice = idInvoice;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date dissue) {
        this.date = dissue;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }
}
