import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Coversor {
   Conversion conversion(String moneda1, String moneda2, double monto ) {
       HttpClient client = HttpClient.newHttpClient();
       HttpRequest request = HttpRequest.newBuilder()
               .uri(URI.create("https://v6.exchangerate-api.com/v6/a27f17405186de056c465bac/pair/" + moneda1 + "/" + moneda2+"/"+monto))
               .build();

       HttpResponse<String> response;
       try {
           response = client
                   .send(request, HttpResponse.BodyHandlers.ofString());
       } catch (IOException | InterruptedException e) {
           throw new RuntimeException(e);
       }
       return new Gson().fromJson(response.body(), Conversion.class);
   }

}
