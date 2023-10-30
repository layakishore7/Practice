    package Oops;

    public class Student extends Person{
        protected String course;

        public Student(String name, String email,String course) {
            super(name, email);
            this.course = course;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        @Override
        public void print() {
            super.print();
            System.out.println(this.course);
        }
    }
