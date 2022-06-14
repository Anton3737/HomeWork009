public class test {
    public static void main(String[] args) {
    }

    public Object subArray(int[] array, int index, int count) {
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i = 0; i < array.length; i++) {
            for (i = index; i < array.length; i++) {
                System.out.println(subArray(array, 1, 20));
            }
        }
        return null;
    }
}


