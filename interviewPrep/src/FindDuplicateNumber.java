public class FindDuplicateNumber {

    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        int expectedLength = 20;

        int expectedSum = expectedLength *(expectedLength+1) / 2;
        int sum=0;

        for(int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }

        System.out.println(expectedSum);
        System.out.println(sum);
        System.out.println(expectedSum - sum);
    }
}
