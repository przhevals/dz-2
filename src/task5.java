public class task5 {
    public static void main(String[] args) {

        //task 5 (find a palindrome)

        int[] arr = {12,1331,44,25,267,689986,3003};


        for(int i = 0; i < arr.length; i++){
            int n = arr[i];
            int temp = n;
            int rev = 0;

            while (temp != 0){
                int rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
            }

            if(rev == arr[i]){
                System.out.println(arr[i]);
            }
        }
    }
}

