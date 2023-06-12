package Challange1;

public class Employee {
    private final int eid;
    private final String ename;
    private final String workLocation;
    private final int yearOfExperience;

    public Employee(int eid, String ename, String workLocation, int yearOfExperience) {
        this.eid = eid;
        this.ename = ename;
        this.workLocation = workLocation;
        this.yearOfExperience = yearOfExperience;
    }

    public int getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", workLocation='" + workLocation + '\'' +
                ", yearOfExperience=" + yearOfExperience +
                '}';
    }
}
