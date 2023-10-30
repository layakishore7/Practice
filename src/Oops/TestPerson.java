package Oops;

public class TestPerson {
    public static void main(String[] args) {
      // Teacher t = new Teacher("jhon","jhon@gmail.com","java,.net");

        //upcasting
        Student t = new Student("jhon","jhon@gmail.com","java");
        Student s = t;
        s.print();

        //downcasting
//        Person p = new Teacher("bob","bob@gmail.com",".net");
//        Teacher f = (Teacher) p;
//        f.print();

    }
}
