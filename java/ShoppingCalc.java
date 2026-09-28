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

        // force int division
        int x = 3;
        // same as cpp '/'
        int f_d = n/x;
        int r_fd = n%x;
        System.out.println("Force division (n(items)/3) " + (f_d + r_fd));


        // return
        String resp = String.format(("Yout total is £%f for %d %s's"), t, n, i);
        System.out.println(resp);

        sc.close();
    }
}