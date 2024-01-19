import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        boolean exitPoint = true;
        System.out.println("Выберите действие:\n " +
                "1. Расчитать расход топлива.\n " +
                "2. Показать информацию о последнем замере расхода.\n " +
                "3. Показать средний расход топлива.\n " +
                "q - Выход из программы.");
        outerLoop:
        while (exitPoint) {
            String scanner;
            scanner = ScannerClass.scan.nextLine();
            switch (scanner) {
                case "1" -> BodyProgramm.calculateLiterPerKM();
                case "2" -> SQLconnect.showLastCalculate();
                case "3" -> SQLconnect.showAverageCalculate();
                case "q" -> exitPoint = false;
                case "i" -> System.out.println(BodyProgramm.info);
                default -> System.out.println("Ошибка.Выберите действие или введите i");
            }
        }
    }
}