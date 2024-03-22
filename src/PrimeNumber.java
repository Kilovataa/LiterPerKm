import java.io.IOException;

public class PrimeNumber {
    public static void isPrimeNumber() {
        try {
            while (true) {
                int n = ScannerClass.getInt();
                boolean flag = false;
                for (int x = 2; x <= Math.sqrt(n); x++) {
                    if (n % x == 0) {
                        flag = true;
                    }
                }
                if (flag == false) {
                    System.out.println("Число простое!!!!!!!\n");
                } else {
                    System.out.println("Число не простое =(\n");
                    flag = false;
                }
            }
        } catch (IOException e) {
            System.out.println(BodyProgramm.info);
        }
    }
}
