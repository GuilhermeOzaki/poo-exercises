import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);

    int ano = sc.nextInt();

    if (ano <= 0) {
        System.out.println("Erro");
    } else if (ano % 400 == 0) {
        System.out.println("Ano bissexto");
    } else if (ano % 4 == 0 && ano % 100 != 0) {
        System.out.println("Ano bissexto");
    } else {
        System.out.println("Ano nao bissexto");
    }

    sc.close();
}

