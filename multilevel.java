class Student {
    int rollNo;
    String name;
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}
class Marks extends Student {
    int sub1, sub2, sub3, sub4, sub5;
    Marks(int rollNo, String name, int sub1, int sub2, int sub3,
          int sub4, int sub5) {
        super(rollNo, name);
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
        this.sub5 = sub5;
    }
    void displayMarks() {
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Subject 3: " + sub3);
        System.out.println("Subject 4: " + sub4);
        System.out.println("Subject 5: " + sub5);
    }
}
class Result extends Marks {
    Result(int rollNo, String name, int sub1, int sub2, int sub3,
           int sub4, int sub5) {

        super(rollNo, name, sub1, sub2, sub3, sub4, sub5);
    }
    void calculateResult() {
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double average = total / 5.0;
        char grade;
        if (average >= 90)
            grade = 'A';
        else if (average >= 75)
            grade = 'B';
        else if (average >= 60)
            grade = 'C';
        else if (average >= 50)
            grade = 'D';
        else
            grade = 'F';
        displayStudent();
        displayMarks();
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}
 class Main {
    public static void main(String[] args) {

        Result student = new Result(
            101, "Rahul",
            85, 90, 78, 88, 92
        );
        student.calculateResult();
    }
}
