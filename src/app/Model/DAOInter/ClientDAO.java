package app.Model.DAOInter;

import app.Model.Entities.Client;

public interface ClientDAO {
    public void createClient(String CPF, String name, String nPhone, String email, String address);
    public void updateClient(String CPF, String attribute, String newValue);
    public void deleteClient(String CPF);
    public void viewClient(String CPF);
    public void jsonWrite(Client client);
    public void jsonRead(String fileName);





}