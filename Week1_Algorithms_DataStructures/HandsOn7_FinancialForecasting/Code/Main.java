package Week1_Algorithms_DataStructures.HandsOn7_FinancialForecasting.Code;

public class Main {

    // Recursive method to calculate future value
    public static double futureValue(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue; // base case
        }
        return futureValue(presentValue, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double presentValue = 10000.0; // Rs. 10,000
        double annualGrowthRate = 0.08; // 8% growth per year
        int years = 5;

        double futureVal = futureValue(presentValue, annualGrowthRate, years);
        System.out.printf("Future Value after %d years: %.2f\n", years, futureVal);
    }
}
