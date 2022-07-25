package ReversePack;

import java.util.Arrays;

public class Reverse {


    public int[] myReverse(int[] array) {               // крок 3 створюємо метод де параметром є інтовий масив
        int[] reversArray = new int[array.length];            // крок 4 створюємо Новий масив де  його довжиною виступає батьківський масив з кроку 1
        for (int i = 0; i < reversArray.length; i++){        // стандартний цикл FOR
            reversArray[i] = array[array.length-1-i];     // крок 5 ЗВЕРНИ УВАГУ НА КОНСТУКЦІЮ РЕВЕРСУ
        }
            return reversArray;                     // крок 6 ти робиш ретюрн масиму який ти вдже пройшов циклом FOR
    }

    public static void main(String[] args) {

        Reverse reverse =new Reverse();  // крок 7 ствроюємо об'єкт

        int[] array = new int[9];                 // крок 1 створюємо масив
        for (int i = 0; i < array.length; i++) {        // крок 2 ініціалізуємо масив з 9 елементів на всю його довжину
            array[i] = i;
        }
        Arrays.stream(reverse.myReverse(array)).forEach(System.out::println);    // крок 8 виводимо масив через стрим ЗВЕРНИ УВАГУ НА КОСТРУКЦІЮ ВИВОДУ
        // викликаємо клас Arrays з методом .stream +  Arrays.stream() , в метод  .stream(прописуємо наш об'єкт з кроку 7 + дописуємо метод кроку 3 )+ ,а потім магія невідомої мені раніше конструкці .forEach(System.out::println)

//        Arrays.stream(reverse.subArray(array, array[3], 33)).forEach(System.out::println);


        }

//    public int [] subArray(int [] array, int index, int count) {
//        int [] subarray = new int[array.length];
//        for (int i = index; i < array.length; i++){
//        }
//        return subArray(myReverse(array), array[3], count);
//    }

}



