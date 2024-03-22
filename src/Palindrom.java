public class Palindrom {
    public static void isPalindrome() {
        while (true) {
            StringBuilder str = ScannerClass.getWord();
            String result = str.toString().toLowerCase();
            if (result.equals("q")) break;
            String resultReverse = str.reverse().toString().toLowerCase();

            if (result.equals(resultReverse)) {
                System.out.println(result + " - Является палиндромом!\n");
            } else System.out.println(result + " - НЕ ПАЛИНДРОМ!\n");
        }
        System.out.println(BodyProgramm.info);
    }

}
