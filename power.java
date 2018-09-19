import java.util.*;
class M2
{
  int calc(int x,int y)
  {
    if(y==1)
    {
      return x;
    }
    else
    {
      return (x * calc(x,y-1));
    }
  }
}
public class power
{
  public static void main(String args[])
  {
     M2 obj = new M2();
     Scanner sc = new Scanner(System.in);
     int x = sc.nextInt();
     int y = sc.nextInt();
     int a = obj.calc(x,y);
     System.out.println(x+" to the power "+y+" is "+a);
  }
}