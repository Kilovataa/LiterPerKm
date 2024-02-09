import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        boolean exitPoint = true;
        System.out.println(BodyProgramm.info);
        outerLoop:
        while (exitPoint) {
            String scanner;
            scanner = ScannerClass.scan.nextLine();
            switch (scanner) {
                case "1" -> BodyProgramm.calculateLiterPerKM();
                case "2" -> SQLconnect.showLastCalculate();
                case "3" -> SQLconnect.showAverageCalculate();
                case "4" -> Palindrom.isPalindrome();
                case "q" -> exitPoint = false;
                default -> System.out.println(BodyProgramm.infoText);
            }
        }
    }
}