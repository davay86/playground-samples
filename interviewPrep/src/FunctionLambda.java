import java.util.function.Function;

public class FunctionLambda {

    public static <T,R> R applyFuntion(T entity, Function<T,R> function){
        return function.apply(entity);
    }


    public static void main(String[] args){
        Employee employee = new Employee(123,"David");

        System.out.println(employee.salary);

        employee.salary = applyFuntion(employee,(e) ->  e.salary + 1000);

        System.out.println(employee.salary);

        employee.name = applyFuntion(employee.name,String::toUpperCase);

        System.out.println(employee.name);

        Function<Employee,Employee> calcSalary = e -> {e.salary = e.getSalary() + 1000; return e;};
        Function<Employee,Employee> doubleSalary = e -> {e.salary = e.getSalary() * 2; return e;};

    }

    private static class Employee{
        int salary;
        String name;

        public Employee(int salary, String name) {
            this.salary = salary;
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public String getName() {
            return name;
        }
    }
}
