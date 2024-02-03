import java.util.Scanner;

public class ReverseString {
    
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        String str = sobj.nextLine();
        String rstr = " ";
        char ch;
        
        for(int i=0; i<str.length(); i++)
        {
             ch = str.charAt(i);
             rstr = ch + rstr;
        }
        System.out.println("Reverse string = "+rstr);
    }
}
