public class SmellyCode {

    public static String globalData = "mutable"; // public field

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4, e = 5; // poor variable names

        // Long method + magic numbers + duplicated code
        for (int i = 0; i < 10; i++) {
            if ((a + b + c + d + e) * 42 > 100) {
                System.out.println("Condition met");
            }
        }

        for (int i = 0; i < 10; i++) {
            if ((a + b + c + d + e) * 42 > 100) {
                System.out.println("Condition met");
            }
        }

        doEverything();
    }

    public static void doEverything() {
        try {
            int result = calculate(10, 0);
            System.out.println(result);
        } catch (Exception e) {
            // Empty catch block
        }

        if (true) { // dead/useless code pattern
            System.out.println("Always true");
        }
    }

    public static int calculate(int x, int y) {
        if (y == 0) {
            return -9999; // primitive error code
        }
        return x / y;
    }

    public static String getCustomerType(int type) {
        switch (type) { // switch smell
            case 1:
                return "STANDARD";
            case 2:
                return "PREMIUM";
            case 3:
                return "VIP";
            default:
                return "UNKNOWN";
        }
    }
}
