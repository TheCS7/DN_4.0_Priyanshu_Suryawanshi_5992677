import java.util.Scanner;

public class FinancialForecast {

    // Recursive method to forecast value after n years
    public static double forecastRecursive(double amount, double rate, int years) {
        if (years == 0) {
            return amount;
        }
        return forecastRecursive(amount, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Financial Forecasting Tool");

        double initialAmount = 0;
        while (true) {
            System.out.print("Enter Initial Investment Amount : ");
            if (scanner.hasNextDouble()) {
                initialAmount = scanner.nextDouble();
                if (initialAmount > 0) break;
                else System.out.println("Amount must be positive.");
            } else {
                System.out.println("Please enter a number.");
                scanner.next(); 
            }
        }

        double growthRatePercent = 0;
        while (true) {
            System.out.print("Enter Annual Growth Rate in %: ");
            if (scanner.hasNextDouble()) {
                growthRatePercent = scanner.nextDouble();
                if (growthRatePercent > 0) break;
                else System.out.println("Growth rate must be greater than 0");
            } else {
                System.out.println("Invalid input. Please enter a number");
                scanner.next(); 
            }
        }

        int years = 0;
        while (true) {
            System.out.print("Enter Forecast Duration in Years: ");
            if (scanner.hasNextInt()) {
                years = scanner.nextInt();
                if (years >= 0) break;
                else System.out.println("Years can't be negative.");
            } else {
                System.out.println("Please enter an integer.");
                scanner.next(); // consume invalid token
            }
        }

        double rate = growthRatePercent / 100.0;
        double predictedValue = forecastRecursive(initialAmount, rate, years);

        System.out.println("\n Summary of the forecast:");
        System.out.printf("Initial Investment: Rupee %.2f\n", initialAmount);
        System.out.printf("Growth Rate: %.2f%%\n", growthRatePercent);
        System.out.println("Years: " + years);
        System.out.printf("Predicted Value After %d Years: Rupees %.2f\n", years, predictedValue);

        scanner.close();
    }
}
