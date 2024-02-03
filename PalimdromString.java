import java.util.Scanner;

public class PalimdromString {
 
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string :");

        String str = sobj.nextLine();
        int i=0, j=str.length()-1;

        while(i < j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                System.out.println("not a palimdrom");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("is a palimdrom");

    }
}
