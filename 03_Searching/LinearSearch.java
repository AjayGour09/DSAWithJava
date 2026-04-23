public class LinearSearch {
    public static int search(int[] arr, int key) {
        // loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9};
        int key = 7;

        System.out.println(search(arr, key));
    }
}