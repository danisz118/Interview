package otherQuestion;

public class isPolindrome {
    public static void main(String[] args) {
        String text = "alla  alla";
        System.out.println(isPolindrome(text));
    }
    public static boolean isPolindrome(String text) {
        String s1 = text.toUpperCase().replaceAll("[^A-Za-z]", "");
        StringBuffer s2 = new StringBuffer(s1).reverse();
        boolean answer = true;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                answer = false;
                break;
            }
        }
        return answer;
    }

}
