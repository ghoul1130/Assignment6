import java.util.*;

class StudentRegistration {

    private Map<String, String> students = new HashMap<>();

    public void addStudent(String id, String name) {
        if (students.containsKey(id)) {
            System.out.println("Student with ID " + id + " already exists.");
        } else {
            students.put(id, name);
            System.out.println("Added: " + name + " (ID: " + id + ")");
        }
    }

    public String findStudent(String id) {
        return students.getOrDefault(id, "Student not found.");
    }
}
