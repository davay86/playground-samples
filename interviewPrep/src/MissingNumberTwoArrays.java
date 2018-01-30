import java.util.Hashtable;

public class MissingNumberTwoArrays {

    public static void main(String[] args){
        int[] firstArray = {1,2,3,4,5,6,7};
        int[] secondArray = {1,2,3,5,6,7};

        Hashtable arrayTable = new Hashtable();
        for(int i=0;i <secondArray.length;i++){
            arrayTable.put(i,secondArray[i]);
        }

        for(int i=0;i <firstArray.length;i++) {
            if (!arrayTable.contains(firstArray[i])) {
                System.out.println(firstArray[i]);
            }
        }
    }
}
