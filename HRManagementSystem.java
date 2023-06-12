package Challange1;

import java.util.ArrayList;

import java.util.List;


public class HRManagementSystem {
    public static void main(String[] args){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101,"Roger","UK",1));
        employeeList.add(new Employee(102,"Sam","India",3));
        employeeList.add(new Employee(103,"Xiang","China",7));
        employeeList.add(new Employee(104,"Wiley","US",4));
        employeeList.add(new Employee(105,"Jane","India",20));

        //Requirement 1
        System.out.println("Employee List");
        for (Employee employee: employeeList){
           addEmployee(employee);
           displayEmployee(employee);
        }

        //Requirement 2
        System.out.println("\n Employees sorted by country");
        Project.sortByCountry(employeeList);

        //Requirement 3
        System.out.println("\n Employees sorted by ID(less than a year experience)");
        Project.sortById(employeeList);

       //Requirement 4
        System.out.println("\n Employees divided into even and odd groups");
        Project.createList(employeeList);

        //Requirement 5
        System.out.println("\n Project Details:");
        Project project = new Project("p101", "Anaplan", employeeList.subList(0,3));
        Project.addProjectDetails(project);
        project.printDetails();
    }

    public static void addEmployee(Employee employee) {}

    public static void displayEmployee(Employee employee) {
        System.out.println(employee);

    }
}
