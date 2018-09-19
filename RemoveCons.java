import java.util.Scanner;
public class RemoveCons
{
	public static final int index(String s) 
	{
	    for (int c = s.length()-1; c > 0; c--) 
	    {
	        if(s.charAt(c) == s.charAt(c-1))
	        {
	            return c;
	        }
	        else
	        {
	            break;
	        }
	    }
	    return -1;
	}
	static public String remove(String str)
	{
	    int i = str.length()-1;
	    int index = index(str);
	    if(str.equals("") || str.length() == 1)
	        return str;
	    else if(index != -1)
	        return remove(str.substring(0,index));
	    else
	        return remove(str.substring(0,i)) + str.charAt(i);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		String r = remove(s);
		System.out.println("after alter string is "+ r);		
	}
}