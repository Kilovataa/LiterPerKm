public class Palindrom {
    //Преобразуем введеную строку в StringBuilder
    public static StringBuilder getWordToPalindrome() {
        StringBuilder strInput = new StringBuilder();
        while (ScannerClass.scan.hasNext()) {
            if(ScannerClass.scan.hasNextLine()) {
                strInput.append(ScannerClass.scan.nextLine());
                break;
            }
        }
        return strInput;
    }

    public static void isPalindrome() {
        while (true) {
            System.out.println("Введите слово для проверки на палиндром:");
            StringBuilder str = getWordToPalindrome();
            String result = str.toString().toLowerCase();
            if (result.equals("q")) break;
            String resultReverse = str.reverse().toString().toLowerCase();

            if (result.equals(resultReverse)) {
                System.out.println(str + " - Является палиндромом!\n");
            } else System.out.println(str + " - НЕ ПАЛИНДРОМ!\n");
        }
        System.out.println(BodyProgramm.info);
    }

}
