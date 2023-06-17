package app.Model.DAOInter;

import java.util.ArrayList;

public interface AttendantDAO {
    //CHAMAR CLIENTE
    public void callCClient(String CPF,String name, String nPhone, String email, String address);
    public void callUClient(String id, String Atribute, String newValue);
    public void callDClient(String id);
    public void callRClient(String id);

    //CHAMAR OS
    public void callCOS(String description, String CPF, ArrayList<String> parts);
    public void callUOS(String osID);
    public void callDOS(String osID);
    public void callROS(String osID);
    public void viewOS(String clientID);
    public void rPayment(String CPF, int type);
}