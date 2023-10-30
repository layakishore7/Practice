        package Oops;

        public class Person {

            protected String name;

            protected  String email;


            public Person(String name,String email) {
                this.name = name;
                this.email = email;
            }


            public  void print(){
                System.out.println(this.name);
                System.out.println(this.email);
            }
        }
