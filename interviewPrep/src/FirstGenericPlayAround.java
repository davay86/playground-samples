public class FirstGenericPlayAround {

    public static <T> T randomElement(T[] array){
        return array[1];
    }
    public static void main(String[] args){
        String[] strings = {"hello","test"};
        Integer[] numbers = {1,2,3,4,5,6};

        System.out.println(randomElement(strings));
        System.out.println(new getElement<Integer>().getElement(numbers));

    }

    public static class getElement<T>{

        public T getElement(T[] array){
            return array[1];
        }
    }
}
