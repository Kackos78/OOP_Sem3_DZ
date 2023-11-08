import java.util.*;

public class Main {
    public static void main(String[] args) {
        Comparator<Employee> comparator = new ManagerAgeComparator().thenComparing(new ManagerNameComparator());
        Set<Employee> setOfManagersByAge = new TreeSet<>(comparator);
        setOfManagersByAge.add(new Employee("Vova", 26, 25888, "dp1"));
        setOfManagersByAge.add(new Employee("Viktor", 35, 25788, "dp1"));
        setOfManagersByAge.add(new Employee("Anna", 55, 22548, "dp1"));
        setOfManagersByAge.add(new Employee("Vladislav", 65, 50888, "dp1"));
        setOfManagersByAge.add(new Employee("Daniil", 28, 60888, "dp1"));
        setOfManagersByAge.add(new Employee("Svetlana", 29, 29588, "dp1"));
        setOfManagersByAge.add(new Employee("Dmitri", 30, 29888, "dp2"));
        setOfManagersByAge.add(new Employee("Kate", 27, 14888, "dp2"));
        setOfManagersByAge.add(new Employee("Sasha", 35, 22888, "dp2"));
        setOfManagersByAge.add(new Employee("Gleb", 45, 25688, "dp2"));
        setOfManagersByAge.add(new Employee("Nina", 21, 26458, "dp2"));
        setOfManagersByAge.add(new Employee("Vova", 25, 68888, "dp2"));
        setOfManagersByAge.add(new Employee("Vanya", 27, 78588, "dp2"));
        setOfManagersByAge.add(new Employee("Dasha", 22, 41288, "dp3"));
        setOfManagersByAge.add(new Employee("Kate", 22, 23608, "dp3"));
        setOfManagersByAge.add(new Employee("Miroslava", 23, 68888, "dp3"));
        setOfManagersByAge.add(new Employee("Vitalina", 27, 44888, "dp3"));
        setOfManagersByAge.add(new Employee("Elena", 25, 65428, "dp3"));
        setOfManagersByAge.add(new Employee("Igor", 27, 33654, "dp3"));
        setOfManagersByAge.add(new Employee("Evgeniy", 29, 43654, "dp3"));
        System.out.println(setOfManagersByAge);
        System.out.println();


        Comparator<Employee> comparatorBySal = new ManagerSalaryComparator().thenComparing(new ManagerNameComparator());
        Set<Employee> setOfManagersBySal = new TreeSet<>(comparatorBySal);
        setOfManagersBySal.addAll(setOfManagersByAge);
        System.out.println(setOfManagersBySal);
        System.out.println();


        Comparator<Employee> comparatorByDep = new ManagerDepComparator().thenComparing(new ManagerNameComparator());
        Set<Employee> setOfManagersByDep = new TreeSet<>(comparatorByDep);
        setOfManagersByDep.addAll(setOfManagersBySal);
        System.out.println(setOfManagersByDep);
        System.out.println();

    }
}