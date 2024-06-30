package Modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeradorDeArquivo {
    public void geraJson(List<Moedas> conversoes, String s) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter("conversoes.json");
        escrita.write(gson.toJson(conversoes));
        escrita.close();

    }
}

