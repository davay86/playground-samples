import java.util.HashMap;
import java.util.Hashtable;

public class PairsToSum {

    public static void main(String[] args){
        int[] numberArray = {1,2,4,5,6,7,9,10};
        int sum = 9;

        Hashtable numberTable = new Hashtable();
        HashMap<Integer,Integer> hashMap = new HashMap();

        for(int i=0; i<numberArray.length; i++){
            numberTable.put(i,numberArray[i]);
        }

        for(int i=0; i<numberArray.length; i++){
            int remainder = sum - numberArray[i];

            if(numberTable.contains(remainder)){
                if(!hashMap.containsKey(remainder)){
                    hashMap.put(numberArray[i],remainder);
                }
            }

        }

        for (Integer integer : hashMap.keySet()) {
            System.out.println(integer + " : " + hashMap.get(integer));
        }
    }
}
