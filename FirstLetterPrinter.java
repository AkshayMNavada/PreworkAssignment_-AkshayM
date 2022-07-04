import java.util.Scanner;

class FirstLetterPrinter {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(firstLetterPrinter(input));
    }
    static String firstLetterPrinter(String str) {
        String[] words = str.split("\\s+");
        String newWord = "";

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w+]","");
            if (words[i].length()>0)
                newWord += words[i].charAt(0);
        }
        return newWord;
    }
}
