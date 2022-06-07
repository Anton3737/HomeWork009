public class Arrays {
    public static void main(String[] args) {
        int [] arrays = new int [10];
        arrays[0] = 1;
        arrays[1] = 2;
        arrays[2] = 3;
        arrays[3] = 4;
        arrays[4] = 5;
        arrays[5] = 6;
        arrays[6] = 7;
        arrays[7] = 8;
        arrays[8] = 9;
        arrays[9] = 10;
        // Варіант 1 вивести всі елементи окремо з вказанням індекса масиву
        System.out.println(arrays[9]);
        System.out.println(arrays[8]);
        System.out.println(arrays[7]);
        System.out.println(arrays[6]);
        System.out.println(arrays[5]);
        System.out.println(arrays[4]);
        System.out.println(arrays[3]);
        System.out.println(arrays[2]);
        System.out.println(arrays[1]);
        System.out.println(arrays[0]);
        System.out.println();


        //Варіант через цикл
        int [] arrays1 = new int[] {1,2,3,4,5,6,7,8,9,10};
        for (int i = arrays1.length-1; i >= 0; i--){
            System.out.println(arrays1[i]);
        }
    }
}
