import com.google.gson.JsonObject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Conversor de Moneda");
        System.out.print("Ingrese cantidad en USD: ");
        double cantidad = sc.nextDouble();

        JsonObject rates = CurrencyAPI.getExchangeRates("USD");
        if (rates != null) {
            JsonObject conversionRates = rates.getAsJsonObject("conversion_rates");
            double tasaCLP = conversionRates.get("CLP").getAsDouble();  // Por ejemplo, peso chileno

            double resultado = Conversor.convertir(cantidad, tasaCLP);
            System.out.println("Equivale a: " + resultado + " CLP");
        }
    }
}
