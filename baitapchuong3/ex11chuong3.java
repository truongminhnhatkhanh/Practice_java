package baitapchuong3;
public class ex11chuong3{
    public static void main(String[] args){
        int i = 1;
        while(i <= 1000){
            if(i % 2 == 0){
                System.out.println(i+ " EVEN");
                i++;
            }
            if(i % 2 == 1){
                System.out.println(i+" UNEVEN");
                i++;
            }
        }
    }
}