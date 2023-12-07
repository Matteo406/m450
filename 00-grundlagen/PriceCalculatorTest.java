public class PriceCalculatorTest {

    public static void main(String[] args) {
        boolean testResult = test_calculate_price();
        if (testResult) {
            System.out.println("All tests passed successfully.");
        } else {
            System.out.println("Some tests failed.");
        }
    }

    static boolean test_calculate_price() {
        boolean allTestsPassed = true;

        // Test Case 1
        double result1 = calculatePrice(10000, 500, 1000, 2, 5);
        if (result1 != 11000.0) {
            System.out.println("Test Case 1 Failed");
            allTestsPassed = false;
        }

        // Test Case 2
        double result2 = calculatePrice(15000, 1000, 2000, 4, 8);
        if (result2 != 16800.0) {
            System.out.println("Test Case 2 Failed");
            allTestsPassed = false;
        }

        // Test Case 3
        double result3 = calculatePrice(20000, 1500, 2500, 6, 12);
        if (result3 != 19300.0) {
            System.out.println("Test Case 3 Failed");
            allTestsPassed = false;
        }

        // Additional Test Case
        double result4 = calculatePrice(12000, 800, 1200, 3, 6);
        if (result4 != 13780.0) {
            System.out.println("Additional Test Case Failed");
            allTestsPassed = false;
        }

        return allTestsPassed;
    }

    static double calculatePrice(double baseprice, double specialprice, double extraprice, int extras, double discount) {
        double addon_discount;
        double result;

        if (extras == 3)
            addon_discount = 10;
        else if (extras >= 5)
            addon_discount = 15;
        else
            addon_discount = 0;


             // addon discount zählt nur für extras (fehler)
        // if (discount > addon_discount)
        //     addon_discount = discount;


        double basisAusstattung = baseprice / 100.0 * (100 - discount);
        double sonderModelAufPreis = specialprice;
        double extraAusstattung = extraprice / 100.0 * (100 - addon_discount);

        result = basisAusstattung + sonderModelAufPreis + extraAusstattung;

        return result;
    }
}

