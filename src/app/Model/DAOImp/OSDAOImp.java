package app.Model.DAOImp;

import app.Model.DAOInter.OSDAO;
import app.Model.ENUM.Status;
import app.Model.Entities.OS;
import app.Model.Entities.Technician;
import com.google.gson.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Caio Bruno Oliveira
 */
public class OSDAOImp implements OSDAO {
    Technician technician = new Technician();
    public void createOS(String description, Date startTime, Status status, String clientID, ArrayList parts){
        OS os1 = new OS(description, startTime, status, clientID, parts);
        OSDAOImp os = new OSDAOImp();
        os.WriteJsonOS(os1, parts);


    }

    public void updateOS(String clientID){
        /*
        for(OS os : listOS){
            if(os.getClientID().equals(clientID)){
                os.setDescription("Nova descrição");
            }
        }

         */
    }

    public void deleteOS(String CPF){

        try {
            FileReader reader = new FileReader("OS.json");

            Gson gson = new Gson();
            JsonObject jsonElement = gson.fromJson(reader, JsonObject.class);

            JsonArray OSList = jsonElement.getAsJsonObject().getAsJsonArray("OSList");

            for (int i = 0; i < OSList.size(); i++) {
                JsonObject OS = OSList.get(i).getAsJsonObject();
                if (OS.get("CPF").getAsString().equals(CPF)) {
                    OS.addProperty("status", "CANCEL");
                    break;
                }
            }

            FileWriter writer = new FileWriter("OS.json");
            gson.toJson(jsonElement, writer);
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void viewOS(String CPF){
        try {
            FileReader reader = new FileReader("OS.json");

            Gson gson = new Gson();
            JsonObject jsonElement = gson.fromJson(reader, JsonObject.class);

            JsonArray OSList = jsonElement.getAsJsonObject().getAsJsonArray("OSList");

            for (int i = 0; i < OSList.size(); i++) {
                JsonObject OS = OSList.get(i).getAsJsonObject();

                if (OS.get("CPF").getAsString().equals(CPF)) {
                    System.out.println(OS);
                    break;
                }
            }

            FileWriter writer = new FileWriter("OS.json");
            gson.toJson(jsonElement, writer);
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewAllOS(){
        try {
            FileReader reader = new FileReader("OS.json");

            Gson gson = new Gson();
            JsonObject jsonElement = gson.fromJson(reader, JsonObject.class);

            JsonArray OSList = jsonElement.getAsJsonObject().getAsJsonArray("OSList");

            for (int i = 0; i < OSList.size(); i++) {
                JsonObject OS = OSList.get(i).getAsJsonObject();
                System.out.println(OS);
            }

            FileWriter writer = new FileWriter("OS.json");
            gson.toJson(jsonElement, writer);
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void WriteJsonOS(OS os, ArrayList usedParts){
        Gson gson = new Gson();
        FileReader reader = null;

        try {
            File file = new File("OS.json");

            if (!file.exists()) {
                file.createNewFile();
            }

            reader = new FileReader(file);

            JsonElement jsonElement = gson.fromJson(reader, JsonElement.class);

            if (jsonElement != null) {

                JsonObject newOS = new JsonObject();

                newOS.addProperty("description", os.getDescription());
                newOS.addProperty("CPF", os.getClientID());
                newOS.addProperty("OSId", os.getOsID());
                newOS.addProperty("startTime", os.getStarTime());
                newOS.addProperty("status", String.valueOf(os.getStatus()));
                JsonArray parts = new JsonArray();
                System.out.println("entrou aqui 0");
                for(int i = 0; i < usedParts.size(); i++) {
                    System.out.println(usedParts.get(i));
                }

                for(int i = 0; i < usedParts.size(); i++){
                    parts.add(String.valueOf(usedParts.get(i)));
                    System.out.println("Entrou aqui");
                }
                newOS.addProperty("parts", String.valueOf(parts));
                System.out.println("Entrou aqui 2");



                jsonElement.getAsJsonObject().getAsJsonArray("OSList").add(newOS);

                FileWriter writer = new FileWriter("OS.json");
                gson.toJson(jsonElement, writer);

                writer.flush();
                writer.close();

            } else {

                JsonArray OSList = new JsonArray();

                System.out.println("Arquivo criado, você pode começar a guardar os produtos agora");
                JsonObject OS = new JsonObject();
                OS.add("OSList", OSList);


                FileWriter writer = new FileWriter("OS.json", true);

                gson.toJson(OS, writer);
                writer.close();

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void changeStatus() {

        try {
            FileReader reader = new FileReader("OS.json");

            Gson gson = new Gson();
            JsonObject jsonElement = gson.fromJson(reader, JsonObject.class);

            JsonArray OSList = jsonElement.getAsJsonObject().getAsJsonArray("OSList");

            for (int i = 0; i < OSList.size(); i++) {
                JsonObject OS = OSList.get(i).getAsJsonObject();

                if (OS.get("status").getAsString().equals("WAITING")) {
                    // Removendo o objeto JSON do array
                    OS.addProperty("status", "PROGRESS");
                    technician.setCPFclient(String.valueOf(OS.get("CPF")));
                    technician.CPFClientsList.add(technician.getCPFclient());
                    System.out.println(technician.getCPFclient());
                    break;
                }
            }

            FileWriter writer = new FileWriter("OS.json");
            gson.toJson(jsonElement, writer);
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public double finishAndValue(String CPF){
        double total = 0;
        try {
            // Criando um FileReader para ler o arquivo JSON
            FileReader readerP = new FileReader("Produtos.json");
            FileReader readerS = new FileReader("Serviços.json");

            // Criando um Gson para converter o FileReader em um objeto JSON
            Gson gson = new Gson();
            Gson gsonP = new Gson();
            Gson gsonS = new Gson();

            JsonObject jsonElementP = gsonP.fromJson(readerP, JsonObject.class);
            JsonObject jsonElementS = gsonS.fromJson(readerS, JsonObject.class);

            // Obtendo o array JSON que representa a lista de clientes
            //JsonArray OSList = jsonElement.getAsJsonObject().getAsJsonArray("OSList");
            JsonArray ProductsList = jsonElementP.getAsJsonObject().getAsJsonArray("productsList");
            JsonArray ServicesList = jsonElementS.getAsJsonObject().getAsJsonArray("servicesList");


            JsonParser parser = new JsonParser();
            JsonObject obj = parser.parse(new FileReader("OS.json")).getAsJsonObject();
            JsonArray osList = obj.getAsJsonArray("OSList");

            for (int i = 0; i < osList.size(); i++) {
                JsonObject os = osList.get(i).getAsJsonObject();

                // Verificando se o CPF do cliente é igual ao CPF informado
                if (os.get("CPF").getAsString().equals(CPF)) {
                    if(os.get("status").getAsString().equals("PROGRESS")) {
                        os.addProperty("status", "FINISH");

                        String partsString = os.get("parts").getAsString();
                        JsonArray partsArray = parser.parse(partsString).getAsJsonArray();

                        for (int j = 0; j < partsArray.size(); j++) {
                            String part = partsArray.get(j).getAsString();
                            JsonObject Product = ProductsList.get(j).getAsJsonObject();
                            JsonObject Service = ServicesList.get(j).getAsJsonObject();

                            if (Product.get("nameProduct").getAsString().equals(part)) {
                                double value = Product.get("price").getAsDouble();
                                total += value;

                            }

                            if (Service.get("nameProduct").getAsString().equals(part)) {
                                double value = Service.get("price").getAsDouble();
                                total += value;
                            }

                        }
                        break;
                    }
                }

            }

            FileWriter writer = new FileWriter("OS.json");

            gson.toJson(obj, writer);
            readerP.close();
            readerS.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;

    }



}
