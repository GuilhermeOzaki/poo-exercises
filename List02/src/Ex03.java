void main() {
    Scanner sc = new Scanner(System.in);

    int[] array = new int[10];

    for(int i = 0; i < 5; i++)
        array[i] = sc.nextInt();
    IO.println(compute(array));

}

String compute(int[] array){

    String output = null;
    String Arrays = null;


    output = Arrays.toString(array) + "\n";

    return output;
}
