import java.util.Scanner;

void main() {
    //Дано вещественное число X и целое число N (> 0). Найти значение выражения: exp(X)∼1+X+X^2/2!+X^3/3!+…+X^N/N!
    Scanner scanner = new Scanner(System.in);

    double x = scanner.nextInt();
    int n = scanner.nextInt();

    double expX = 0;

    for (int i = 0; i <= n; i++){
        expX += Math.pow(x, i) / findFactorial(i);
    }

    System.out.printf("exp(%.2f) = %.2f", x, expX);

}

static int findFactorial(int n){
    int nFactorial = 1;
    for (int i = 2; i <= n; i++) nFactorial *= i;
    return nFactorial;
}