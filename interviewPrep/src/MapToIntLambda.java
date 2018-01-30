import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapToIntLambda {

    public static void main(String[] args){

        List<Employee> employees;

        Employee employee,employee1,employee2;

        employee = new Employee(31,"David");
        employee1 = new Employee(25,"Ashley");
        employee2 = new Employee(17, "Mikey");

        employees = Arrays.asList(employee,employee1,employee2);

        System.out.println(employees.stream().limit(10).mapToInt(e -> e.getAge()).max().getAsInt());

    }

    public static class Employee{
        int age;
        String name;

        public Employee(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
