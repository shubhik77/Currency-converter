# Currency Converter

The Currency Converter is a simple Java program that allows users to convert an amount from one currency to another using exchange rates. This README file provides an explanation of the code and how to use the program.

## Code Explanation

The main components of the code are as follows:

1. **Main class**: This class contains methods for managing exchange rates and converting currency.

   - `Main()`: Constructor that initializes the exchange rate map with predefined values.

   - `convertCurrency(double amount, String fromCurrency, String toCurrency)`: Method to convert an amount from one currency to another using exchange rates.

2. **Main method**: The `main` method provides a simple command-line interface for users to interact with the currency converter.

   - Users can input the amount to be converted, the source currency, and the target currency.

   - The program calculates the converted amount and displays the result.

## How to Use

1. Compile the Java code using a Java compiler.

2. Run the compiled program. The program will display a list of available currencies (USD, EUR, GBP, INR).

3. Enter the amount you want to convert.

4. Enter the source currency (e.g., USD).

5. Enter the target currency (e.g., EUR).

6. The program will calculate and display the converted amount in the target currency.

## Usage Tips

- The exchange rates used in the code are simplified and for demonstration purposes only. In a real-world scenario, you would fetch up-to-date exchange rates from a reliable data source or API.

- To add more exchange rates, update the `exchangeRates` map in the `Main` class constructor.

- Consider extending the program to fetch exchange rates dynamically from an external API.

## Notes

This program is intended as a simple example of a currency converter. It's not meant for production use and lacks advanced features commonly found in real currency conversion systems.
