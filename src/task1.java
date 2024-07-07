//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class task1 {
    public static void main(String[] args) {

        //task 1 (min and max)

        int[] arr = {1,2,3,4,5,6,7,8};
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
        
    }
