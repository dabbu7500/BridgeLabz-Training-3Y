import java.util.*;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    List<Faculty> facultyList = new ArrayList<>();

    Department(String name) {
        this.name = name;
    }

    void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }
}

class University {
    String name;
    List<Department> departments = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(Department department) {
        departments.add(department);
    }
}

public class UniversityCompositionDemo {
    public static void main(String[] args) {
        University uni = new University("Tech University");
        Department cs = new Department("Computer Science");
        Department bio = new Department("Biology");

        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Jane");

        cs.addFaculty(f1);
        bio.addFaculty(f2);

        uni.addDepartment(cs);
        uni.addDepartment(bio);
    }
}
