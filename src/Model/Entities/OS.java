package Model.Entities;

import Model.ENUM.Payments;
import Model.ENUM.Status;

import java.util.ArrayList;
import java.util.Date;


public class OS {
    private int osID = 0;
    private String description;
    private Date starTime;
    private double totalValue;
    private Status status;
    private Payments typePay;
    private int installments;
    private String technicianID;
    private String clientID;
    public ArrayList<String> usedParts = new ArrayList();

    /**
     *
     * @param description
     * @param starTime
     * @param status
     * @param clientID
     * @param parts
     */
    public OS(String description, Date starTime, Status status, String clientID, ArrayList parts) {

        for(int i = 0; i < parts.size(); i++){
            usedParts.add(String.valueOf(parts.get(i)));
        }
        this.description = description;
        this.starTime = starTime;
        this.status = status;
        this.clientID = clientID;
        this.osID++;
    }

    @Override
    public String toString() {
        return '\n' +
                "OS{" +
                "Parts" + usedParts + '\n' +
                "osID: " + osID + '\n' +
                "description: " + description + '\n' +
                "starTime: " + starTime + '\n' +
                "status: " + status + '\n' +
                "clientID: " + clientID + '\n' +
                '}';
    }

    public int getOsID() {
        return osID;
    }

    public int setOsID(int osID) {
        this.osID++;
        return osID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStarTime() {
        return new String(String.valueOf(starTime));
    }

    public void setStarTime(Date starTime) {
        this.starTime = starTime;
    }
    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue += totalValue;
    }
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Payments getTypePay() {
        return typePay;
    }

    public void setTypePay(Payments typePay) {
        this.typePay = typePay;
    }

    public int getInstallments() {
        return installments;
    }

    public void setInstallments(int installments) {
        this.installments = installments;
    }

    public String getTechnicianID() {
        return technicianID;
    }

    public void setTechnicianID(String technicianID) {
        this.technicianID = technicianID;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }
}
