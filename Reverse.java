import java.util.*;
class M
{
  void rev(int a[],int i,int j)
  {
    if(i > a.length/2)
    {
      return;
    }
    else
    {
      int t = a[i];
      a[i]=a[j];
      a[j]=t;
    }
    rev(a,i+1,j-1);
    
  } 
}
class Reverse
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    M obj = new M();
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    obj.rev(a,0,a.length-1);
    for(int i=0;i<5;i++)
    {
      System.out.println(a[i]);
    }
  }
}