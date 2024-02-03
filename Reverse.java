import java.util.Scanner;

public class Reverse {
    public static void main(String args[]){
        
        int n, rev=0 ,lastdigit;
        System.out.print("Enter any number :");

        Scanner sobj = new Scanner(System.in);
        n=sobj.nextInt();

        while(n>0){

            lastdigit=n%10;
            rev = rev * 10 + lastdigit;
            n = n/10;
        }
        System.out.print(rev);








    }
    
}
