public class task2 {
    public static void main(String[] args) {

        //task 2 (odd and even numbers)

        int[] arr = {11,12,13,14,15,16,17,18,19,20};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
