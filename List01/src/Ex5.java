import java.util.Scanner;


void main() {

    Scanner sc = new Scanner(System.in);

    int L = sc.nextInt();
    double M = sc.nextDouble();
    double A = sc.nextDouble();
    int V = sc.nextInt();

    double multa = 0.0;

    if (V > L) {
        int excesso = V - L;
        multa = M + (excesso * A);
    }

    System.out.printf("%.2f%n", multa);

    sc.close();
}

