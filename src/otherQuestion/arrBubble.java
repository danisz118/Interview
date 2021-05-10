package otherQuestion;

public class arrBubble {
    public static void main(String[] args) {
        int[] arr = {150, 6, 5, 4, 1, 0, 16, 20};
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tmp;
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
