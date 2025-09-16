import java.util.*;

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollInCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }
}

class Course {
    String title;
    List<Student> students = new ArrayList<>();

    Course(String title) {
        this.title = title;
    }

    void addStudent(Student student) {
        students.add(student);
    }
}

class School {
    String name;
    List<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student student) {
        students.add(student);
    }
}

public class SchoolAggregationDemo {
    public static void main(String[] args) {
        School school = new School("Green Valley High");
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course math = new Course("Math");
        Course science = new Course("Science");

        s1.enrollInCourse(math);
        s1.enrollInCourse(science);
        s2.enrollInCourse(math);

        school.addStudent(s1);
        school.addStudent(s2);
    }
}
