import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateLambda {


    public static <T> void printItemThatMatches(List<T> items, Predicate<T> function){

        for (T item : items) {
            if(function.test(item)){
                System.out.println(item);
            }
        }

    }

    public static void main(String args[]){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("david","12345"));
        employees.add(new Employee("Ashley", "1234"));
        employees.add(new Employee("Mikey","123"));

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Citreon","saxo","1.6"));
        cars.add(new Car("Honda", "crv", "1.6"));
        cars.add(new Car("Ford","focus","1.2"));
        cars.add(new Car("Ford","Fiesta","1.4"));

        Predicate<Car> ford =e -> e.name.equalsIgnoreCase("ford");
        Predicate<Car> smallEngine = e -> e.engine.equalsIgnoreCase("1.2");

        printItemThatMatches(employees, e -> e.name.contains("d"));
        printItemThatMatches(employees, e -> e.name.contains("M"));
        printItemThatMatches(employees, e -> Integer.valueOf(e.getId()) > 123);

        printItemThatMatches(cars,e -> e.engine.equalsIgnoreCase("1.6"));
        printItemThatMatches(cars,ford.and(smallEngine));

    }

    static private class Car{
        private String name;
        private String model;
        private String engine;

        public Car(String name, String model, String engine) {
            this.name = name;
            this.model = model;
            this.engine = engine;
        }

        public String getName() {
            return name;
        }

        public String getModel() {
            return model;
        }

        public String getEngine() {
            return engine;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "name='" + name + '\'' +
                    ", model='" + model + '\'' +
                    ", engine='" + engine + '\'' +
                    '}';
        }
    }

    static private class Employee{
        private String name;
        private String id;

        public Employee(String name, String id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", id='" + id + '\'' +
                    '}';
        }
    }
}
