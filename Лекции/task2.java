package Лекции;

import java.util.Scanner;

public class task2 {
    private static String sBuilder(String input) {
        StringBuilder y = new StringBuilder();
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < input.length()) {
            j = i;
            count = 0;
            while (j < input.length() && input.charAt(i) == input.charAt(j)) {
                count += 1;
                j += 1;
            }
            y.append(input.charAt(i));
            y.append(count);
            i += count;
        }
        return y.toString();
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = iScanner.nextLine();
        String result = sBuilder(input);
        System.out.println(result);
    }

}
