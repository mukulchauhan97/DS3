import java.util.*;
class SearchArr
{
       public static boolean search(int[] arr, int num) {

		if(arr.length == 0) {
			return false;
		}
		
		int smallArray[] = new int[arr.length-1];
		
		for(int i = 0; i < smallArray.length; i++) {
			smallArray[i] = arr[i+1];
		}

		if(arr[0] == num) {
			return true;
		} 
		else 
		{
			return search(smallArray, num);
		}
	}
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Element to search : ");
        int x = sc.nextInt();
        boolean y = search(arr,x);
        if(y){
        System.out.println("Search of element "+x+" is "+y);
        }
        else
        {
        System.out.println("Search of element "+x+" is "+y);
        }
	}
}