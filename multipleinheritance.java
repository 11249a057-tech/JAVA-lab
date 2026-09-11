interface Sports {
    void sportsActivity();
}
interface Academics {
    void academicActivity();
}
class Student implements Sports, Academics {
    String name;
    Student(String name) {
        this.name = name;
    }
    public void sportsActivity() {
        System.out.println("Student participates in sports.");
    }
    public void academicActivity() {
        System.out.println("Student performs well in academics.");
    }
    void displayName() {
        System.out.println("Student Name: " + name);
    }
}
 class Main {
    public static void main(String[] args) {
        Student s = new Student("Rahul");
        s.displayName();
        s.sportsActivity();
        s.academicActivity();
    }
}
