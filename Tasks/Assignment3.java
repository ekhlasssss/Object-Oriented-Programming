package Student;

import java.util.List;
import java.util.ArrayList;

public class StudentManager {
    public List<Student> registry;

    public StudentManager() {
        this.registry = new ArrayList<>();
    }

    public void addStudent(Student entry) {
        registry.add(entry);
    }

    public Student findStudentById(int searchId) throws Exception {
        for (int i = 0; i < registry.size(); i++) {
            Student current = registry.get(i);
            if (current.studentId == searchId) {
                return current;
            }
        }
        throw new Exception("Student ID not located");
    }

    public void displayAllStudents() {
        registry.forEach(s -> s.getStudentInformation());
    }
}
