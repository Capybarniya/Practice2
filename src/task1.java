import java.util.Scanner;

void main() {
    //Даны целые A и B (A < B). Вывести по возрастанию все числа от A до B включительно и их количество.
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.printf("Числа от %d до %d:%n", a, b);
    for (int i = a; i <= b; i++){
        System.out.println(i);
    }
    System.out.printf("Кол-во чисел: %d%n", b - a + 1);
}
