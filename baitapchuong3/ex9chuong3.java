package baitapchuong3;
public class ex9chuong3{
    public static void main(String[] args){
        int j = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 7 == 0){
                j = i;
            }
        }
        System.out.println("largest number found = "+ j );
    }
}