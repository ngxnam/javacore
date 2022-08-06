import java.time.LocalDate;

enum Gender {
    MALE,
    FEMALE,
};

public class Employee2 implements Comparable<Employee2> {
    public String id;
    public String name;
    public LocalDate dateOfBirth;
    public Gender gender;
    double salary;

    public Employee2(String id, String name, LocalDate dateOfBirth, Gender gender, double salary) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.salary = salary;
    }

    public String toString() {
        return "id: " + id + ", name: " + name + ", dateOfBirth: " + dateOfBirth + ", gender: " + gender + ", salary: " + salary; 
    }

    boolean hasID(String idFind) {
        return (id.equals(idFind));
    }

    boolean hasNameContain(String nameFind) {
        return (name.contains(nameFind));
    }

    @Override
    public int compareTo(Employee2 emp) {
        if (emp.salary == this.salary) {
            return 0;
        }

        if (emp.salary > this.salary) {
            return 1;
        } else {
            return -1;
        } 
    }
}