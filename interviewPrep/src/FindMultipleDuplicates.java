import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindMultipleDuplicates {

    public static void main(String[] args){
        int[] numbers = {1,1,2,3,4,5,6,7,7,8,9,10,11,12,13,13,14,15,16,17,18,19,20,20};

        HashSet nonDuplicates = new HashSet();

        ArrayList duplicates = new ArrayList<Integer>();

        for(int i =0; i < numbers.length; i++){
            if(!nonDuplicates.add(numbers[i])){
                duplicates.add(numbers[i]);
            }
        }

        for (Object duplicate : duplicates) {
            System.out.println(duplicate);
        }
    }
}
