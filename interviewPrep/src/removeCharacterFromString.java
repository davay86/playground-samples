public class removeCharacterFromString {

    public static void main(String[] args) {
        String initialString = args[0];
        char removeChar = args[1].toCharArray()[0];

        System.out.println(initialString);
        System.out.println(removeChar);

        StringBuilder stringBuilder = new StringBuilder(initialString).deleteCharAt(initialString.indexOf(removeChar));
        System.out.println(stringBuilder);
    }
}
