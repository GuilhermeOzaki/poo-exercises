import java.util.Scanner;


void main() {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int C = sc.nextInt();

    int total = 0;
    int precoAtual = C;

    for (int i = 0; i < N; i++) {
        total += precoAtual;
        if (precoAtual > 1) {
            precoAtual--;
        }
    }

    System.out.println(total);

    sc.close();
}


