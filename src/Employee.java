import java.util.Comparator;

public class Employee implements Comparable<Employee>, Comparator<Employee> {
    private String name;
    private Integer age;
    private Integer salary;
    private String department;
    public Employee(String name, Integer age, Integer salary, String department){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public Integer getAge() {return age;}
    public String getName() {return name;}
    public Integer getSalary() {return salary;}
    public String getDepartment() {return department;}
    public void setName(String name) {this.name = name;}
    public void setAge(Integer age) {this.age = age;}
    public void setSalary(Integer salary) {this.salary = salary;}
    public void setDepartment(String department) {this.department = department;}

    @Override
    public int compareTo(Employee manager) {
        if (age < manager.age) {
            return -1;
        } else if (age > manager.age) {
            return 1;
        }
        return 0;
    }

    @Override
    public int compare(Employee a, Employee b) {

        return a.getName().compareTo(b.getName());
    }

    public String toString() {
        return "name = " + name +", " + "age = " + age + ", " + "Salary = " + salary + ", " + "Department = " + department + ".\n";
     }
}
class ManagerNameComparator implements Comparator<Employee>{
    public int compare(Employee a,Employee b){
        return a.getName().compareTo(b.getName());
        }
}
class ManagerAgeComparator implements Comparator<Employee> {
    public int compare(Employee a, Employee b) {
        if (a.getAge() > b.getAge())
            return 1;
        else if (a.getAge() < b.getAge())
            return -1;
        else
            return 0;
    }
}
class ManagerSalaryComparator implements Comparator<Employee> {
    public int compare(Employee a, Employee b) {
        if (a.getSalary() > b.getSalary())
            return -1;
        else if (a.getSalary() < b.getSalary())
            return 1;
        else
            return 0;
    }
}
class ManagerDepComparator implements Comparator<Employee>{
    public int compare(Employee a,Employee b){
        return a.getDepartment().compareTo(b.getDepartment());
    }
}