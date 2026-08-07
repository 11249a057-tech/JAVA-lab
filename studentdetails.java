class Student {
    String name;
    int rollNo;
    int marks;
    // Constructor
    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    // Method to display student details
    void displayDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Marks        : " + marks);
        System.out.println("Grade        : " + calculateGrade());
        System.out.println();
    }
    // Method to calculate grade
    char calculateGrade() {
        if (marks >= 90)
            return 'A';
        else if (marks >= 75)
            return 'B';
        else if (marks >= 60)
            return 'C';
        else if (marks >= 50)
            return 'D';
        else
            return 'F';
    }
    public static void main(String[] args) {
        // Creating student objects
        Student s1 = new Student("santhu", 101, 92);
        Student s2 = new Student("Priya", 102, 78);
        // Displaying details
        s1.displayDetails();
        s2.displayDetails();
    }
}