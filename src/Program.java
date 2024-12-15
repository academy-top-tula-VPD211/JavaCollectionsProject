import java.util.ArrayList;
import java.util.Comparator;

public class Program {
    public static void main(String args[]){
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Tommy", 25));
        employees.add(new Employee("Jimmy", 19));
        employees.add(new Employee("Poppy", 41));
        employees.add(new Employee("Lenny", 36));
        employees.add(new Employee("Bobby", 33));

        Examples.arrayConsoleLn(employees);

        employees.sort(new EmployeeNameComparator());
        Examples.arrayConsoleLn(employees);

        employees.sort(new EmployeeAgeComparator());
        Examples.arrayConsoleLn(employees);
    }


}

record Employee(String name, int age) {
    @Override
    public String toString() {
        return "Name: " + name() + ", Age: " + age();
    }
}

class EmployeeNameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name().compareTo(o2.name());
    }
}

class EmployeeAgeComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.age() - o2.age();
    }
}


