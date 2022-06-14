public class CustomerArray {
    public static void main(String[] args) {
        int[] array = {4, 5, 7, 1, 23, 55, 77, 83, 0, 345, 2, 13, 8, 900, 34, 12};
        double sum = 0;
        double sredArefm = 0;
        int minNumbers = 0;
        int maxNumbers = 0;
        for (int i = 0; i < array.length; i++){
           sum = sum + array[i];    // Вивід в консоль суми чисел масиву
           sredArefm = sum/16;     // Розрахунок середнього арифметичного із суми чисел масиву
            if (i % 2 !=0){       // Вивод непарних чисел з масива
                System.out.print(" " + i);
            }
            if (array[i] < minNumbers){
                minNumbers = array[i];
            }
            if (array[i] > maxNumbers){
                maxNumbers = array[i];
            }
           }
        System.out.println();
        System.out.println("Сумма чисел в масиві: " + sum);  // Вивід в консоль суми чисел масиву
        System.out.println("Середнє арифметичне суми чисел масива " + sredArefm);  // Розрахунок середнього арифметичного із суми чисел масиву
        System.out.println("Мінімальне значення масиву: " + minNumbers);   // Вивід в консоль мінімального значення масиву
        System.out.println("Максимальне значення масиву: " + maxNumbers);  // Вивід в консоль максимального значення масиву
        }
}
