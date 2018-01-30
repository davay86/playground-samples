package staticInterface;

public class StaticInterfaceMain {

    public interface MyInterface {

        void doThing();
        static void printThing(String hello){
            hello = hello + "---";
            System.out.println(hello);
        }

        static void printOtherThing(String hello){
            System.out.println(hello);
        }

        default void printMyThing(String str){
            System.out.println(str);
        }

        default void printMyThing2(String str){
            System.out.println(str);
        }
    }

    public static void main(String[] args){

        Thing thing = new Thing();
        OtherThing otherThing = new OtherThing();

        String hello = "hello";
        MyInterface.printThing(hello);
        MyInterface.printOtherThing("hello again");

        thing.printMyThing("other thing");
        otherThing.printMyThing("");

    }

    public static class Thing implements MyInterface{

        public void doThing() {

        }

    }

    public static class OtherThing implements MyInterface {


        @Override
        public void doThing() {

        }

        @Override
        public void printMyThing(String str) {
            System.out.println("I have overridden this");
        }
    }
}
