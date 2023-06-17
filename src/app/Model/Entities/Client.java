package app.Model.Entities;

import java.io.Serializable;
import java.util.ArrayList;
public class Client extends Person implements Serializable {
    public static ArrayList<OS> listOS = new ArrayList<>();
    private static final long serialVersionUID = 1L;


    /**
     *
     * @param CPF
     * @param name
     * @param nPhone
     * @param email
     * @param address
     */
    public Client(String CPF, String name, String nPhone, String email, String address) {
        if (CPF.matches("\\d+")){
            this.setCPF(CPF);
        }else{
            throw new IllegalArgumentException("CPF invalido");
        }
        this.setName(name);
        if (nPhone.matches("\\d+")){
            this.setnPhone(nPhone);
        }else{
            throw new IllegalArgumentException("Telefone invalido");
        }
        this.setEmail(email);
        this.setAddress(address);
    }

    @Override
    public String getCPF() {
        return super.getCPF();
    }

    @Override
    public void setCPF(String CPF) {
        super.setCPF(CPF);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getnPhone() {
        return super.getnPhone();
    }

    @Override
    public void setnPhone(String nPhone) {
        super.setnPhone(nPhone);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    public String toString() {
        return "Name: " + getName() + "\nCPF: " + getCPF() + "\nPhone Number: " + getnPhone() + "\nEmail: " + getEmail() + "\nAddress: " + getAddress();
    }
}