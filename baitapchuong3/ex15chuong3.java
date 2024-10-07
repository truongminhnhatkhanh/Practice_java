package baitapchuong3;
public class ex15chuong3{
    public static void main(String[]args){
        for(int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= 8-2*i; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i-1; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= 3; i++)
        {
            for(int j = 1; j <= 13; j++)
            {
                if(j >= 2*i+1 && j <= 13-2*i && j % 2 == 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}