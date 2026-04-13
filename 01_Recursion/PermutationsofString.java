
public class PermutationsofString {

    public static void printPermutations(String str, String ans) {

        // Base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);

            // Remaining string
            String newStr = str.substring(0, i) + str.substring(i + 1);

            printPermutations(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str, "");
    }
}