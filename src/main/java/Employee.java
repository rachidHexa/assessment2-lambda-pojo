import java.util.ArrayList;
import java.util.List;

public class Employee {

    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>();
        new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0);
        new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0);
        new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0);
        new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0);
        new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0);
        new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0);
        new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0);
        new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0);
        new Employee(277, "Anuj", 31, "Male", "Product Development", 2012, 35700.0);
    }



}
