package app.Model.DAOInter;

import app.Model.ENUM.Status;
import app.Model.Entities.OS;

import java.util.ArrayList;
import java.util.Date;

public interface OSDAO {
    public void createOS(String description, Date startTime, Status status,  String clientID, ArrayList codigo);
    public void deleteOS(String clientID);
    public void viewOS(String clientID);
    public void viewAllOS();
    public void changeStatus();
    public double finishAndValue(String CPF);
    public void WriteJsonOS(OS os, ArrayList usedparts);

}