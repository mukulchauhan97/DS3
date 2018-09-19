import java.util.Scanner;
    public class Sumstr {
      
      public static void main(String[] args) 
      {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int sum1=0;
        System.out.println("Sum : "+ sum(s1,sum1) );
      }
      public static int sum(String s1,int sum1)
      {
          if(s1.length() == 0)
          {
              return 0;
          }
          char a = s1.charAt(0);
          if(Character.isDigit(a))
          {
              int b = Integer.parseInt(String.valueOf(a));
              sum1=b;
              
          }
          //System.out.println(sum1);
          return (sum1+sum(s1.substring(1,s1.length()),sum1));
      }
    }