import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    int quant = sc.nextInt();

    if(quant <= 0) {
        IO.println("Erro");
        return;
    }

    double A = 0.25 * quant + 7.50;
    double B = 0.50 * quant + 2.50;

    if(A == B){
        IO.println("Indiferente");
    }
    else if(A < B){
        IO.println("Critério A");
    }
    else{
        IO.println("Critério B");
    }

    sc.close();
}

