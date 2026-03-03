import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);

    double X = sc.nextDouble();
    double V1 = sc.nextDouble();
    double V2 = sc.nextDouble();
    double A = sc.nextDouble();

    double total;

    if (A <= X) {
        total = A * V1;
    } else {
        total = X * V1 + (A - X) * V2;
    }

    System.out.printf("%.2f%n", total);

    sc.close();
}


