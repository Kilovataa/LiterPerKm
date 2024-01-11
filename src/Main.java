public class Main {
    public static void main(String[] args) {
        boolean exitPoint = true;
        System.out.println("Для выхода введите 'q', для продолжения нажмите любую клавишу");
        String stop;
        stop = ScannerClass.scan.nextLine();
        if(stop.equals("q")) {
            exitPoint = false;
        }
        while (exitPoint) {
            double liter = 0;
            double distance = 0;
            System.out.print("Введите затраченное количество топлива: ");
            while (ScannerClass.scan.hasNext()) {
                if(ScannerClass.scan.nextLine() == "q") {
                    stop = ScannerClass.scan.nextLine();
                    exitPoint = false;
                    break;
                }
                if(ScannerClass.scan.hasNextDouble()) {
                    liter = ScannerClass.scan.nextDouble();
                    break;
                } else {
                    System.out.println("Ошибка! Необходимо ввести число. Повторите ввод: ");
                    ScannerClass.scan.next();
                }
            }
            System.out.print("Введите пройденное растояние: ");
            while (ScannerClass.scan.hasNext()) {
                if(ScannerClass.scan.nextLine() == "q") {
                    stop = ScannerClass.scan.nextLine();
                    exitPoint = false;
                    break;
                }
                if(ScannerClass.scan.hasNextDouble()) {
                    distance = ScannerClass.scan.nextDouble();
                    break;
                } else {
                    System.out.println("Ошибка! Необходимо ввести число. Повторите ввод: ");
                    ScannerClass.scan.next();
                }
            }
            double result = liter / distance * 100;
            result = Math.round(result * 100.0) / 100.0;
            System.out.println("Ваш расход топлива: " + result + "л/100км \n");
        }
    }
}