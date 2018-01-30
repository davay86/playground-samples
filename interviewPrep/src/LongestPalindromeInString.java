public class LongestPalindromeInString {

    public static void printPalindrome(String inputString){
        for(int i=0; i < inputString.length()+1; i++){
            for(int j= inputString.length(); j >i +1; j--){
                if(inputString.substring(i,j).equalsIgnoreCase(new StringBuilder(inputString.substring(i,j)).reverse().toString())){
                    System.out.println(inputString.substring(i,j));
                    return;
                }

            }
        }
    }

    public static void main(String[] args){
        printPalindrome("helloolloo");
    }
}
