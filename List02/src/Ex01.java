void main() {
    Scanner sc = new Scanner(System.in);

    int quantDays = 0;

    int[] temperaturas = new int[7];

    for(int i = 0; i < 7; i++){
        temperaturas[i] = sc.nextInt();
    }

    double media = calc(temperaturas);

    for(int temps : temperaturas){
        if(temps > media){
            quantDays += 1;
        }
    }

    IO.println(quantDays);
}

int calc(int[] temperaturas) {
    double sum = 0;
    int media = 0;

    for(double temps : temperaturas)
        sum += temps;

    media = (int)sum/7;

    return media;
}