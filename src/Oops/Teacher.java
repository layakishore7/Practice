        package Oops;

        public class Teacher extends Person{

            protected String subjects;

            public Teacher(String name, String email,String subjects) {
                super(name, email);
                this.subjects = subjects;
            }

            public String getSubjects() {
                return subjects;
            }

            public void setSubjects(String subjects) {
                this.subjects = subjects;
            }


            @Override
            public void print() {
                super.print();
                System.out.println(this.subjects);
            }
        }
