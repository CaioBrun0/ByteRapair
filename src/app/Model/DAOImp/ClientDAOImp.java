package app.Model.DAOImp;

import app.Model.DAOInter.ClientDAO;
import app.Model.Entities.Client;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.*;
import java.util.ArrayList;


/**
 *
 * @author Caio Bruno Oliveira
 *
 */
public class ClientDAOImp implements ClientDAO{
    public static ArrayList<Client> listCLient = new ArrayList<>();

    /**
     * Cria um novo cliente e adiciona na lista
     * @param CPF
     * @param name
     * @param nPhone
     * @param email
     * @param address
     */
    public void createClient(String CPF, String name, String nPhone, String email, String address) {
        try {
            Client c1 = new Client(CPF, name, nPhone, email, address);
            ClientDAOImp clientDAO = new ClientDAOImp();
            clientDAO.jsonWrite(c1);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }


    public void updateClient(String CPF, String attribute, String newValue) {


        try {
            // Criando um FileReader para ler o arquivo JSON
            FileReader reader = new FileReader("Clientes.json");

            // Criando um Gson para converter o FileReader em um objeto JSON
            Gson gson = new Gson();
            JsonObject jsonElement = gson.fromJson(reader, JsonObject.class);

            // Obtendo o array JSON que representa a lista de clientes
            JsonArray clientsList = jsonElement.getAsJsonObject().getAsJsonArray("clientsList");

            // Iterando sobre o array de clientes
            for (int i = 0; i < clientsList.size(); i++) {
                // Obtendo o objeto JSON que representa o cliente atual
                JsonObject client = clientsList.get(i).getAsJsonObject();

                // Verificando se o CPF do cliente é igual ao CPF informado
                if (client.get("CPF").getAsString().equals(CPF)) {
                    // Atualizando o atributo do cliente com o novo valor informado
                    client.addProperty(attribute, newValue);
                    break;
                }
            }

            // Escrevendo o JSON modificado no arquivo
            FileWriter writer = new FileWriter("Clientes.json");
            gson.toJson(jsonElement, writer);
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Dados atualizado com sucesso!");


    }

    public void deleteClient(String CPF){
        try {
            // Criando um FileReader para ler o arquivo JSON
            FileReader reader = new FileReader("Clientes.json");

            // Criando um Gson para converter o FileReader em um objeto JSON
            Gson gson = new Gson();
            JsonObject jsonElement = gson.fromJson(reader, JsonObject.class);

            // Obtendo o array JSON que representa a lista de clientes
            JsonArray clientsList = jsonElement.getAsJsonObject().getAsJsonArray("clientsList");

            // Iterando sobre o array de clientes
            for (int i = 0; i < clientsList.size(); i++) {
                // Obtendo o objeto JSON que representa o cliente atual
                JsonObject client = clientsList.get(i).getAsJsonObject();

                // Verificando se o CPF do cliente é igual ao CPF informado
                if (client.get("CPF").getAsString().equals(CPF)) {
                    // Removendo o objeto JSON do array
                    clientsList.remove(i);
                    break; // interrompendo o laço após encontrar o cliente
                }
            }

            // Escrevendo o JSON modificado no arquivo
            FileWriter writer = new FileWriter("Clientes.json");
            gson.toJson(jsonElement, writer);
            writer.flush();
            writer.close();
        } catch (Exception e) {
            // Imprimindo a pilha de rastreamento da exceção
            e.printStackTrace();
        }
        System.out.println("Cliente excluido com sucesso!");
    }

    public void viewClient(String CPF){
        try {
            // Criando um FileReader para ler o arquivo JSON
            FileReader reader = new FileReader("Clientes.json");

            // Criando um Gson para converter o FileReader em um objeto JSON
            Gson gson = new Gson();
            JsonObject jsonElement = gson.fromJson(reader, JsonObject.class);

            // Obtendo o array JSON que representa a lista de clientes
            JsonArray clientsList = jsonElement.getAsJsonObject().getAsJsonArray("clientsList");

            // Iterando sobre o array de clientes
            for (int i = 0; i < clientsList.size(); i++) {
                // Obtendo o objeto JSON que representa o cliente atual
                JsonObject client = clientsList.get(i).getAsJsonObject();

                // Verificando se o CPF do cliente é igual ao CPF informado
                if (client.get("CPF").getAsString().equals(CPF)) {
                    // Removendo o objeto JSON do array
                    System.out.println(client);
                    break; // interrompendo o laço após encontrar o cliente
                }
            }

            // Escrevendo o JSON modificado no arquivo
            FileWriter writer = new FileWriter("Clientes.json");
            gson.toJson(jsonElement, writer);
            writer.flush();
            writer.close();
        } catch (Exception e) {
            // Imprimindo a pilha de rastreamento da exceção
            e.printStackTrace();
        }
    }

    public void jsonWrite(Client client){

        Gson gson = new Gson();
        FileReader reader = null;
        try {
            File file = new File("Clientes.json");

            if (!file.exists()) {
                file.createNewFile();
            }

            reader = new FileReader(file);

            JsonElement jsonElement = gson.fromJson(reader, JsonElement.class);

            if (jsonElement != null) {
                // Adicionando um novo objeto aleatório ao array de membros
                JsonObject newClient = new JsonObject();

                newClient.addProperty("name", client.getName());
                newClient.addProperty("CPF", client.getCPF());
                newClient.addProperty("nPhone", client.getnPhone());
                newClient.addProperty("email", client.getEmail());
                newClient.addProperty("address", client.getAddress());


                jsonElement.getAsJsonObject().getAsJsonArray("clientsList").add(newClient);

                // Escrevendo o JSON modificado no arquivo
                FileWriter writer = new FileWriter("Clientes.json");
                gson.toJson(jsonElement, writer);
                writer.flush();
                writer.close();

            }else {

                // Tratando o caso em que o JsonElement é nulo
                JsonArray clientsList = new JsonArray();

                JsonObject clients = new JsonObject();
                clients.add("clientsList", clientsList);

                FileWriter writer = new FileWriter("Clientes.json", true);

                gson.toJson(clients, writer);
                writer.close();

            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Novo cliente criado!");

    }

    public void jsonRead(String fileName){

        Gson gson = new Gson();

        FileReader reader = null;
        try {
            reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        JsonElement jsonElement = gson.fromJson(reader, JsonElement.class);


        System.out.println(jsonElement);

    }



}

