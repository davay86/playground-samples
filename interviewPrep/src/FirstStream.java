import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstStream {

    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();

        Employee employee,employee1,employee2;

        employee = new Employee("David",123,new BigDecimal(120000));
        employee1 = new Employee("Ashley", 43556,new BigDecimal(50000));
        employee2 = new Employee("Mikey",23355,new BigDecimal(15000));

        employees = Arrays.asList(employee,employee1,employee2);

        employees.stream().filter(e -> e.salary.longValue() > 40000).filter(e -> e.id < 500).forEach(System.out::println);

        //collecting filtered stream as an array
        List<Employee> returnedEmployees = employees.stream().filter(e -> e.name.equalsIgnoreCase("Mikey")).collect(Collectors.toList());
        for (Employee returnedEmployee : returnedEmployees) {
            System.out.println(returnedEmployee);
        }

    }

    private static class Employee{
        String name;
        int id;
        BigDecimal salary;

        public Employee(String name, int id, BigDecimal salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public BigDecimal getSalary() {
            return salary;
        }

        public void setSalary(BigDecimal salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    ", salary=" + salary +
                    '}';
        }
    }
}
