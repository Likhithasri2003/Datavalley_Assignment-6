import java.util.Scanner;

public class Vowels{
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            
           char ch=str.charAt(i);
            if ( ch== 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch=='A' || ch=='E'|| ch=='I'||ch=='O'||ch=='U') {
                count++;
            }
        }
        
        if (count!=0) {
            System.out.println("Vowels are present in the string.");
            System.out.println("Total number of vowels: " + count);
        } else {
            System.out.println("No vowels are present in the string.");
        }
    }
}