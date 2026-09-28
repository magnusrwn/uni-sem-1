import java.util.Scanner;



public class ShoppingCalc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("what item would you like to scan today: ");
        String i = sc.nextLine();

        // item cost
        System.out.println("Instert the item cost: ");
        double c = sc.nextDouble();

        // how many
        System.out.println("Insert the count: ");
        int n = sc.nextInt();

        double t = c * n;

        // return
        // f, s, d
        String resp = String.format(("Yout total is £%f for %d %s's"), t, n, i);
        System.out.println(resp);

        sc.close();
    }
}