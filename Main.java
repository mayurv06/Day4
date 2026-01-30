class Student {
    int id;
    String name;

    Student(int i, String name) {
        this.id = i;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Manu");
        Student s2 = new Student(2, "Likhi");
        s1.display();
        s2.display();
    }
}