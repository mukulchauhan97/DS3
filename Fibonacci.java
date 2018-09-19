import java.util.*;
class M1
{
  
  int Fib(int pos)
  {
    if(pos==1)
    {
      return 0;
    }   
    else if(pos==2)
    {
      return 1;
    }
    else{
    return (Fib(pos-1)+Fib(pos-2));
    }
  }
}
class Fibonacci
{
  public static void main(String args[])
  {
    M1 obj = new M1();
    Scanner sc = new Scanner(System.in);
    //int a = 0;
    //int b = 1;
    int pos = sc.nextInt();
    int x = obj.Fib(pos);
    System.out.println("Fibonacci number at position "+pos+" is "+x);
  }
}