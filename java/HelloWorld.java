import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HelloWorld{
    public static void main (String[] args){
        // Open scanner for inputs
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What's your first num? ");
        int num1 = sc.nextInt();
        
        System.out.print("What's your second num? ");
        int num2 = sc.nextInt();

        Set<String> allowed = new HashSet<>();
        allowed.add("m");
        allowed.add("d");
        allowed.add("a");
        allowed.add("s");
        System.out.println("Whats the operation? ");
        String operation = sc.next();
        
        if (!allowed.contains(operation)){
            System.out.println("Allowed operations are 'd'(division), 'a'(addition), 'm'(multiplication), 's'(subtraction)");
        } else {
            if(operation.equals("m")){
                System.out.println(num1 * num2);
            } else if(operation.equals("s")){
                System.out.println(num1 - num2);
            } else if(operation.equals("a")){
                System.out.println(num1 + num2);
            } else{
                System.out.println(num1 / num2);
            }
        }
        
        // Clean up
        sc.close();
    }
}