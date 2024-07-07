public class task3 {
    public static void main(String[] args) {

        //task 3 (length of numbers, find shortest and longest)

        int[] arr = {2,43,421,9584,78203};
        int largest = arr[0];
        int shortest = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < shortest){
                shortest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(shortest);
    }
}
