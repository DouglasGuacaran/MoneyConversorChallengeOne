import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.*;

public class CurrencyAPI {

    public static JsonObject getExchangeRates(String baseCurrency) {
        String apiKey = "dd6fad5c7a8f4443201f90cf";
        String urlStr = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + baseCurrency;

        try {
            URL url = new URL(urlStr);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            con.disconnect();

            JsonParser parser = new JsonParser();
            JsonObject json = parser.parse(content.toString()).getAsJsonObject();
            return json;

        } catch (Exception e) {
            System.out.println("Error al obtener datos de la API: " + e.getMessage());
            return null;
        }
    }
}

