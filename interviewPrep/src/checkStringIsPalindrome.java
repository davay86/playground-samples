public class checkStringIsPalindrome {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String receivedString = args[0];
        stringBuilder.append(receivedString);
        String reversedString = stringBuilder.reverse().toString();

        System.out.println(receivedString);
        System.out.println(reversedString);
        if(receivedString.equalsIgnoreCase(reversedString)){
            System.out.println("This string is palindrome");
        }
    }
}
