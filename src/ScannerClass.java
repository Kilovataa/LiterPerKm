import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerClass {
    static Scanner scan = new Scanner(System.in);
    public static StringBuilder getWord() {
        StringBuilder strInput = new StringBuilder();
        System.out.println("Введите слово: ");
        while (scan.hasNext()) {
            if(scan.hasNextLine()) {
                String str = scan.nextLine();
                if(isAlphabetic(str)) {
                    strInput.append(str);
                    break;
                } else System.out.println("Необходимо ввести слово!");
            }
        }
        return strInput;
    }
    public static int getInt() throws IOException {
        int num = 0;
        System.out.println("Введите число: ('q' - выход)");
        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                break;
            } else {
                System.out.println("Ошибка! Нужно ввести число!");
            }
             if(scan.next().equals("q")) {
                 throw new IOException();
             }
        }
        return num;
    }
    public static boolean isAlphabetic(String s) {
        if (Pattern.matches("[a-zA-Z]+",s)) {
            return true;
        } else return false;
    }
}
