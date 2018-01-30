import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByLambda {

    public static void main(String[] args){

        Employee emp1,emp2,emp3,emp4,emp5;

        emp1 = new Employee("David","Ronaldson","livingston");
        emp2 = new Employee("Ashley", "Purdon", "livingston");
        emp3 = new Employee("Murren", "Murdo", "Edinburgh");
        emp4 = new Employee("Mikey", "Moo","Rosyth");
        emp5 = new Employee("Hannah", "Baloo", "Rosyth");

        List<Employee> employeeList = Arrays.asList(emp1,emp2,emp3,emp4,emp5);

        Map<String, List<Employee>> officeGroups = employeeList.stream().collect(Collectors.groupingBy(Employee::getOffice));

        System.out.println("Livingston Staff: " + officeGroups.get("livingston"));
        System.out.println("Edinburgh Staff: " + officeGroups.get("Edinburgh"));
        System.out.println("Rosyth Staff: " + officeGroups.get("Rosyth"));

    }

    private static class Employee{
        String name;
        String surname;
        String office;

        public Employee(String name, String surname, String office) {
            this.name = name;
            this.surname = surname;
            this.office = office;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getOffice() {
            return office;
        }

        public void setOffice(String office) {
            this.office = office;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", office='" + office + '\'' +
                    '}';
        }
    }
}
