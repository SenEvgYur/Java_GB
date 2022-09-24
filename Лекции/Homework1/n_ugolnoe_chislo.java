package Лекции.Homework1;

import java.util.Scanner;

public class n_ugolnoe_chislo {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        Integer n = iScanner.nextInt();
        double x = 0.5*n*(n+1);
        int value = (int) x;
        System.out.println("n треугольное число равно "+value);

    }
}
