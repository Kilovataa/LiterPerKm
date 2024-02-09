import java.time.LocalDate;

public class BodyProgramm {
    public static String info = "Выберите действие:\n " +
            "1. Расчитать расход топлива.\n " +
            "2. Показать информацию о последнем замере расхода.\n " +
            "3. Показать средний расход топлива.\n " +
            "4. Проверка на палиндром\n " +
            "q - Выход из программы.";
    public static String infoText = "***Выберите действие (q - выход, i - показать информацию)***";
    public static void calculateLiterPerKM() {
        boolean exitPoint = true;

        outerLoop:
        while (exitPoint) {
            double liter = 0;
            double distance = 0;
            System.out.print("Введите затраченное количество топлива: ");
            while (ScannerClass.scan.hasNext()) {
                if(ScannerClass.scan.hasNextDouble()) {
                    liter = ScannerClass.scan.nextDouble();
                    break;
                } else {
                    if(ScannerClass.scan.next().equals("q")) {
                        exitPoint = false;
                        break outerLoop;
                    }
                    System.out.println("Ошибка! Необходимо ввести число. Повторите ввод: ");
                }
            }
            System.out.print("Введите пройденное растояние: ");
            while (ScannerClass.scan.hasNext()) {
                if(ScannerClass.scan.hasNextDouble()) {
                    distance = ScannerClass.scan.nextDouble();
                    break;
                } else {
                    if(ScannerClass.scan.next().equals("q")) {
                        exitPoint = false;
                        break outerLoop;
                    }
                    System.out.println("Ошибка! Необходимо ввести число. Повторите ввод: ");
                }
            }
            double result1 = liter / distance * 100;
            double result = Math.round(result1 * 100.0) / 100.0;
            System.out.println("Ваш расход топлива: " + result + "л/100км \n");
            LocalDate dateLocal = LocalDate.now();
            String date = String.valueOf(dateLocal);
            SQLconnect.sendDataToDB(result, date);
            break;
        }
        System.out.println(infoText);
        ScannerClass.scan.nextLine();
    }
}
