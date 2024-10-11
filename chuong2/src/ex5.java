
    class Student {
        String name, address;
        int age;
        double math, science, physics;
        double average;

        public Student(String name, String address, int age, double math, double science, double physics) {
            this.name = name;
            this.address = address;
            this.age = age;
            this.math = math;
            this.science = science;
            this.physics = physics;
        }

        public double Avg() {
            return average = (math + science + physics) / 3;
        }

        public void details() {
            System.out.println("Name = " + name);
            System.out.println("address = " + address);
            System.out.println("age = " + age);
            System.out.println("Math score = " + math);
            System.out.println("Science score = " + science);
            System.out.println("Physics score = " + physics);
            System.out.println("Average = " + Avg());
        }
    }

    public class ex5 {
        public static void main(String[] args) {
            Student A = new Student("bndh", "djkkk", 19, 9.8, 9.5, 10);
            Student B = new Student("snbnnb", "jnjdj", 18, 5, 4.75, 2.5);
            A.details();
            System.out.println("----------------------");
            B.details();
        }
    }

