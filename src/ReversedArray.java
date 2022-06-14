public class ReversedArray {

  public static void myReverse(int[] array){
      array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

      for (int keyArray: array)
          System.out.print(" " + keyArray);

      System.out.println();
      System.out.println();

      for (int i = array.length-1; i >= 0; i--){
          System.out.print(" " + array[i]);

      }
  }
    public int subArray (int []array, int index, int count ){
      array = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
      for (int i = index; i < array.length; i++);
            for (int j = count; count > array.length; j = 1 );
        return subArray(array, 2, 30);
  }

    public static void main(String[] args) {

    }
}


//        Используя IntelliJ IDEA, создайте класс ReversedArray. Требуется:
//        1) Создать метод myReverse(int [] array),
//        который принимает в качестве аргумента массив целочисленных
//        элементов и возвращает инвертированный массив (элементы массива в обратном порядке).
//        2) Создайте метод int [] subArray(int [] array, int index, int count).

//        Метод возвращает часть полученного в качестве аргумента массива, начиная с позиции
//        указанной в аргументе index, размерностью, которая соответствует значению
//        аргумента count. Если аргумент count содержит значение больше чем количество элементов,
//        которые входят в выбираемую часть исходного массива
//        (от указанного индекса index, до индекса последнего элемента),
//        то при формировании нового массива размерностью в count, заполните единицами
//        те элементы, которые не были скопированы из исходного массива.
