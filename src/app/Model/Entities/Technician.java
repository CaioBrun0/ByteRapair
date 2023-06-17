package app.Model.Entities;

import java.util.ArrayList;

public class Technician {
    private String CPFclient;
    public ArrayList<String> CPFClientsList = new ArrayList<>();

    public String getCPFclient() {
        return CPFclient;
    }

    public void setCPFclient(String CPFclient) {
        this.CPFclient = CPFclient;
    }
}