import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int C = sc.nextInt();
    int M = sc.nextInt();

    if (N <= 0 || C <= 0 || M <= 0) {
        System.out.println("Erro");
    } else {
        int chocolates = N / C;
        int embalagens = chocolates;

        while (embalagens >= M) {
            int bonus = embalagens / M;
            chocolates += bonus;
            embalagens = bonus + (embalagens % M);
        }

        System.out.println(chocolates);
    }

    sc.close();
}
