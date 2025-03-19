package final_keyword;

public class Student {
    private final String name;
    private final int id;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Final method to display student details
    public final void displayStudent() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
