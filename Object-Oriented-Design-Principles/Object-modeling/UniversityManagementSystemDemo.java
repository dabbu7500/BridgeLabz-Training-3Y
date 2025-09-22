import java.util.*;

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    void assignCourse(Course course) {
        course.setProfessor(this);
    }
}

class UniversityStudent {
    String name;
    List<Course> enrolledCourses = new ArrayList<>();

    UniversityStudent(String name) {
        this.name = name;
    }

    void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }
}

class Course {
    String name;
    Professor professor;

    Course(String name) {
        this.name = name;
    }

    void setProfessor(Professor professor) {
        this.professor = professor;
    }
}

public class UniversityManagementSystemDemo {
    public static void main(String[] args) {
        UniversityStudent student = new UniversityStudent("Ryan");
        Professor prof = new Professor("Dr. Patel");

        Course java = new Course("Java Programming");

        student.enrollCourse(java);
        prof.assignCourse(java);
    }
}
