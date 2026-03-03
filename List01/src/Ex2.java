import java.util.Scanner;


void main() {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if (a <= 0 || b <= 0 || c <= 0) {
        System.out.println("Erro");
    } else if (a + b <= c || a + c <= b || b + c <= a) {
        System.out.println("Nao forma triangulo");
    } else if (a == b && b == c) {
        System.out.println("Equilatero");
    } else if (a == b || a == c || b == c) {
        System.out.println("Isosceles");
    } else {
        System.out.println("Escaleno");
    }

    sc.close();
}

