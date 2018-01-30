import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerLambda {


    public static <T> void applyConsumerOperation(List<T> things, Consumer<T> operation){
        for (T thing : things) {
            operation.accept(thing);
        }
    }
    public static void main(String[] args){

        Employee employee = new Employee();
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        List employees = Arrays.asList(employee,employee1,employee2);

        Random random = new Random();
        Consumer<Employee> addToString = e -> e.setWage(random.nextInt());
        Consumer<Employee> printString = System.out::println;
        applyConsumerOperation(employees,addToString.andThen(printString));
    }

    private static class Employee{
        int wage = 0;

        public Employee() {
            this.wage = wage;
        }

        public int getWage() {
            return wage;
        }

        public void setWage(int wage) {
            this.wage = wage;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "wage=" + wage +
                    '}';
        }
    }
}
