public class PrintAllSubsets {

    public static void printSubsets(String str, String ans, int index) {
        
        // Base case
        if (index == str.length()) {
            System.out.println(ans);
            return;
        }

        // Include character
        printSubsets(str, ans + str.charAt(index), index + 1);

        // Exclude character
        printSubsets(str, ans, index + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubsets(str, "", 0);
    }
}