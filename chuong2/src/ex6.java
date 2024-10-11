
    class Company {
        String name, address;
        double cost, income, benefit;

        public Company(String name, String address, double cost, double income) {
            this.name = name;
            this.address = address;
            this.cost = cost;
            this.income = income;
            this.cost = cost;
        }

        public double benif() {
            return benefit = income - cost;
        }

        public void details() {
            System.out.println("Name = " + name);
            System.out.println("address = " + address);
            System.out.println("income = " + income);
            System.out.println("cost = " + cost);
            System.out.println("benefit = " + benif());
        }
    }

    public class ex6{
        public static void main(String[]args){
            Company A = new Company("vcv","vcdfsf",1004,130000);
            A.details();
        /*double B = A.benif();
        System.out.println(B);*/
        }
    }

