package Challange1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Project {
    private String pcode;
    private String projectName;
    private static List<Employee> employees;

    public Project(String pcode, String projectName, List<Employee> employees) {
        this.pcode = pcode;
        this.projectName = projectName;
        this.employees = employees;
    }

    public static void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void printDetails(){
        System.out.println("project Code: " + pcode + ", project_Name: " + projectName + ", employees " + employees);
    }
    public static void sortByCountry(List<Employee> employeeList) {
        employeeList.sort(Comparator.comparing(Employee::getWorkLocation));
        for (Employee employee : employeeList ){
            System.out.println(employee);
        }
    }

    public static void sortById(List<Employee> employeeList) {
        employeeList.stream()
                .filter(employee -> employee.getYearOfExperience()<1)
                .sorted(Comparator.comparing(Employee::getEid))
                .forEach(System.out::println);
    }

    public static void createList(List<Employee> employeeList) {
        employeeList.stream()
                .collect(
                        Collectors.partitioningBy(employee -> employee.getEid() % 2 == 0 )
                )
                .forEach((isEven, employees) ->{
            System.out.println(isEven ? "Even Employees: " : "Odd Emplyees");
            employees.forEach(System.out::println);
        });
    }

    public static void addProjectDetails(Project project) {
        //HRManagement.java
    }

}
