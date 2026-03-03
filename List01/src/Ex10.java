import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    int X1 = sc.nextInt();
    int V1 = sc.nextInt();
    int X2 = sc.nextInt();
    int V2 = sc.nextInt();

    if (V1 != V2 && (X2 - X1) % (V1 - V2) == 0 && (X2 - X1) / (V1 - V2) >= 0) {
        System.out.println("SIM");
    } else {
        System.out.println("NAO");
    }

    sc.close();
}

