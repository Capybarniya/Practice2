import java.util.Scanner;

void main() {
    //Описать метод, который принимает длину стороны равностороннего треугольника и вычисляет его периметр и площадь. Вывести полученные значения на консоль.
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();

    double[] PS = findEquilateralTriangle(a);
    double p = PS[0], s = PS[1];

    System.out.printf("Периметр: %.2f%nПлощадь: %.2f%n", p, s);

}

static double[] findEquilateralTriangle(int triangleSide){
    double p = triangleSide*3;
    double s = triangleSide*triangleSide*Math.pow(3, 0.5)/4;

    return new double[]{p, s};
}