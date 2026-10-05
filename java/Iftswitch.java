// if else example
import java.util.HashSet;
import java.util.Scanner;

public class Iftswitch{
   public Iftswitch() {
   }

   public static void main(String[] var0) {
      // act type type-check
      HashSet<String> act_types = new HashSet<String>();
      act_types.add("leisure");
      act_types.add("sport");
      act_types.add("work");
   
      Scanner sc = new Scanner(System.in);
      
      System.out.print("What's the date? [YYYY-MM-DD]: ");
      String date = sc.nextLine();

      System.out.print("What activity are you doing?: ");
      String act = sc.next();

      String t_act = "";
      System.out.print("What type of acticity is this [sport, work, leisure]?: ");
      while (!act_types.contains(t_act)){
         System.out.println("please check spelling and ensure the input matches either ['sport', 'work', 'leusiure']: ");
         t_act = sc.next();
      }
      sc.close();

      System.out.println("Added activity: " + act + " of type " + t_act + " completed on " + date);

      if (act.equals("nish") && t_act.equals("leisure")){
         System.out.println("fatass");
      }
      
   }
}

