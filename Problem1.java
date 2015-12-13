import java.util.*;
import java.io.*;
public class Problem1
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      int[] count = new int[num];
      scan.nextLine();
      for(int i = 0; i < num; i++)
      {
         scan.nextLine();
         String student = scan.nextLine();
         String answer = scan.nextLine();
         for(int j = 0; j < student.length(); j++)
            if(student.charAt(j)!=answer.charAt(j))
               count[i]++;
      }
      for(int i = 0; i < count.length; i++)
         System.out.println("Case " + (i+1) + ": " + count[i]);
   }
}