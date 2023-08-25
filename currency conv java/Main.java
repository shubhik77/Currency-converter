import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    // This class represents the currency converter program.

    private Map<String, Double> exchangeRates;

    public Main() {
        // Constructor initializes the exchange rate map with predefined values.
        exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.74);
        exchangeRates.put("INR", 73.69); // Exchange rate for Indian Rupee
        // Add more exchange rates here...
    }

    public double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        // Method to convert an amount from one currency to another using exchange rates.
        double fromRate = exchangeRates.get(fromCurrency);
        double toRate = exchangeRates.get(toCurrency);
        return amount * (toRate / fromRate); // Calculate converted amount
    }

    public static void main(String[] args) {
        Main converter = new Main(); // Instantiate the currency converter
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available Currencies: USD, EUR, GBP, INR");
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble(); // Read amount to be converted
        scanner.nextLine(); // Consume the newline

        System.out.print("Enter the source currency (e.g., USD): ");
        String fromCurrency = scanner.nextLine().toUpperCase(); // Read source currency

        System.out.print("Enter the target currency (e.g., EUR): ");
        String toCurrency = scanner.nextLine().toUpperCase(); // Read target currency

        double convertedAmount = converter.convertCurrency(amount, fromCurrency, toCurrency);
        // Call convertCurrency method to perform currency conversion
        System.out.println("Converted Amount: " + convertedAmount + " " + toCurrency);

        scanner.close(); // Close the scanner
    }
}

//