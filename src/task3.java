import java.util.Scanner;

void main() {
    //Дано целое число N (> 0). Используя операции целочисленного деления и остатка, найти число, полученное при прочтении N справа налево.
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    while (n > 0){
        int digit = n % 10;
        System.out.print(digit);
        n /= 10;
    }

}
