import java.util.ArrayList;

public class FirstLamda {

    static String hello = "hello interface";

    @FunctionalInterface
    public interface MyInterface{
        void myInterfaceMethod(String e);
    }

    public static void methodUsingInterface(String s,MyInterface myinterface){
        myinterface.myInterfaceMethod(s);
    }

    public static void main(String[] args){

        ArrayList<String> list = new ArrayList();
        list.add("hello");
        list.add("bye");
        list.add("test");
        list.add("last");
        list.parallelStream().forEach(e -> System.out.println(e));

        methodUsingInterface("Hello interface", e -> System.out.println(e));

        //method referencing
        methodUsingInterface("Hello interface", System.out::println);

        methodUsingInterface("",e -> {hello = "can do this"; System.out.println(hello);});

        methodUsingInterface("local variable", hello-> System.out.println(hello));
    }


    //********YOU CANT DO THIS***************
//    private void cantDoThis(){
//        String hello = "hello";
//
//        methodUsingInterface("", e -> {hello = "Cant change local variables"; System.out.println(e);});
//    }
}
