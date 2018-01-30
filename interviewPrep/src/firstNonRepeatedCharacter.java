public class firstNonRepeatedCharacter {

    public static void main(String[] args){
        String testString = "tuiooiittuuz";

        for(int i=0; i < testString.length(); i++){
            String nextChar = String.valueOf(testString.charAt(i));
            String remainderString = testString.substring(0,i) + testString.substring(i+1,testString.length());
            if(!remainderString.contains(nextChar)){
                System.out.println(testString.substring(i,i+1));
                break;
            }
        }
    }
}
