import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);

    int idade;
    int totalPessoas = 0;
    int somaIdades = 0;
    int maioresIdade = 0;
    int idosos = 0;

    while (true) {
        idade = sc.nextInt();

        if (idade < 0) {
            break;
        }

        somaIdades += idade;
        totalPessoas++;

        if (idade >= 18) {
            maioresIdade++;
        }

        if (idade > 75) {
            idosos++;
        }
    }

    double media = 0.0;
    double porcentagemIdosos = 0.0;

    if (totalPessoas > 0) {
        media = (double) somaIdades / totalPessoas;
        porcentagemIdosos = ((double) idosos / totalPessoas) * 100.0;
    }

    System.out.printf("%.2f %d %.2f%%%n", media, maioresIdade, porcentagemIdosos);

    sc.close();
}

