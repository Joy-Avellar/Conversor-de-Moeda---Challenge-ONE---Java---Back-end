package Modelos;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.PrivateKey;

public class Conversor {

    private final String myKey = "EDITE COM A SUA API KEY";
    private Double valor;


    public Moedas ConvertendoMoedas(String moedaBase, String moedaFinal, Double valor) {


       URI conversor = URI.create("https://v6.exchangerate-api.com/v6/" + myKey
               + "/pair/" + moedaBase + "/" + moedaFinal + "/" + valor);

       HttpRequest request = HttpRequest.newBuilder()
                       .uri(conversor)
                       .build();
       try {
           HttpResponse<String> response = HttpClient
                   .newHttpClient()
                   .send(request, HttpResponse.BodyHandlers.ofString());
           return new Gson().fromJson(response.body(), Moedas.class);
       } catch (Exception e) {
           throw new RuntimeException("Não consegui obter a conversão. Verifique os valores digitados.");
       }

   }
}
