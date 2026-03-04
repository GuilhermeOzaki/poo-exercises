void main() {
    Scanner sc = new Scanner(System.in);

    int[] A = new int[5];
    int[] B = new int[5];
    int[] C = new int[5];

    for(int i = 0; i < 5; i++){
        A[i] = sc.nextInt();
    }
    for(int i = 0; i < 5; i++){
        B[i] = sc.nextInt();
    }
    for(int i = 0; i < 5; i++){
        C[i] = A[i] + B[i];
    }

    IO.println(C[0] + ", " + C[1] + ", " + C[2] + ", " + C[3] + ", " + C[4]);

}