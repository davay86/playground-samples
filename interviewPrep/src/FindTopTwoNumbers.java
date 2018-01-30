public class FindTopTwoNumbers {

    public static void main(String[] args){
        int[] numberArray = {1,2,3,4,5,77,6,7,8,9,18,10,11,12,13,14,15};

        int largestNumber = 0;
        int secondLargestNumber = 0;

        for(int i =0;i < numberArray.length;i++){
            if(numberArray[i] > secondLargestNumber){
                secondLargestNumber = numberArray[i];
            }
            if(numberArray[i] > largestNumber){
                secondLargestNumber = largestNumber;
                largestNumber = numberArray[i];
            }
        }

        System.out.println("Largest Number: " + largestNumber);
        System.out.println("Second Number: " + secondLargestNumber);
    }
}
