package otherQuestion;

public class reverseString {
    public static void main(String[] args) {
        String reverse = "man has dog";
        String [] arr = reverse.split(" ");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
