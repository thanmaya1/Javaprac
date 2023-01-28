import java.util.Arrays;

class Student {
    private int id;
    private String name;
    private String phoneNumber;
    private int m1, m2, m3;

    // constructor with five arguments
    public Student(int id, String name, String phoneNumber, int m1, int m2, int m3) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    // setter methods
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setMarks(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    // getter methods
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int[] getMarks() {
        int[] marks = {m1, m2, m3};
        return marks;
    }

    public double getPercentage() {
        return (m1 + m2 + m3) / 3.0;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "John", "123-456-7890", 90, 85, 80);
        Student s2 = new Student(2, "Mike", "098-765-4321", 95, 92, 88);
        Student s3 = new Student(3, "Emily", "111-222-3333", 80, 80, 80);

        System.out.println("Student 1:");
        System.out.println("ID: " + s1.getId());
        System.out.println("Name: " + s1.getName());
        System.out.println("Phone Number: " + s1.getPhoneNumber());
        System.out.println("Marks: " + Arrays.toString(s1.getMarks()));
        System.out.println("Percentage: " + s1.getPercentage());

        System.out.println("\nStudent 2:");
        System.out.println("ID: " + s2.getId());
        System.out.println("Name: " + s2.getName());
        System.out.println("Phone Number: " + s2.getPhoneNumber());
        System.out.println("Marks: " + Arrays.toString(s2.getMarks()));
       
        System.out.println("Percentage: " + s2.getPercentage());

        System.out.println("\nStudent 3:");
        System.out.println("ID: " + s3.getId());
        System.out.println("Name: " + s3.getName());
        System.out.println("Phone Number: " + s3.getPhoneNumber());
        System.out.println("Marks: " + Arrays.toString(s3.getMarks()));
        System.out.println("Percentage: " + s3.getPercentage());
    }
}
