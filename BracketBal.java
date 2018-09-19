import java.util.Scanner;
class Bal
{
	private char brackets[];
	private int index;
	
	Bal(String str)
	{
		brackets = new char[str.length()];
		index = -1;
	}
	
	public boolean checkBalancedBrackets(String str,int i,int len)
	{
		
		if((i == len && index == -1) || len == 0)
			return true;
		else if(i == len && index > -1)
			return false;
		else
		{
			char ch = str.charAt(i);
			
			{
				if(index > -1 && ch == ']' && brackets[index] == '[')
				{
					brackets[index] = ' ';
					index--;
				}
				else if(index > -1 && ch == '}' && brackets[index] == '{')
				{
					brackets[index] = ' ';
					index--;
				}
				else if(index > -1 && ch == ')' && brackets[index] == '(')
				{
					brackets[index] = ' ';
					index--;
				}
			}
			else if(ch=='[' || ch=='{' || ch=='(' || ch==']' || ch=='}' || ch==')')
			{
				index++;
				

				brackets[index] = str.charAt(i);
			}
			
			return checkBalancedBrackets(str,++i,len);
		}
	}
	
}
class BracketBal
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter an expression : ");
		String str = sc.nextLine();
		Bal s = new Bal(str);
		
		int len = str.length();
		System.out.println("\nBalanced Brackets = " + s.checkBalancedBrackets(str,0,len));
		sc.close();
	}
}