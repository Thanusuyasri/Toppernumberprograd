import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
       int regnumber=scanner.nextInt();
       int evensum=0;
       int oddsum=0;
       while(regnumber>0)
       {
           int temp=regnumber%10;
           if(temp%2==0)
           {
               evensum+=temp;
           }
           else{
               oddsum+=temp;
           }
           regnumber/=10;
       }
       if(evensum==oddsum)
       {
           System.out.println(true);
       }
       else {
           System.out.println(false);
       }
    }
}