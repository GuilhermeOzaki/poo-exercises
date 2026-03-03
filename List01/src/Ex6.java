import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);

    double L = sc.nextDouble();
    double A = sc.nextDouble();
    double C = sc.nextDouble();
    double M = sc.nextDouble();

    double area = L * A;
    int latas = (int) Math.ceil(area / M);
    double custoTotal = latas * C;

    System.out.printf("%d %.2f%n", latas, custoTotal);

    sc.close();
}

