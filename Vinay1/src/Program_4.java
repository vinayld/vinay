
public class Program_4 {
	public static void main(String []args)
	{
		int n,k=0;
		
		
		int a[]= {1,2,8,9,12,46,76,82,15,20,30};
		for(int i=1;i<10;i++)
		{
			for(int j=0;j<11;j++)
			{
				n=a[j]%i;
				if(n==0)
				{
					k++;	
				}
				
			}
			System.out.print(i);
			System.out.print(":"); 
			System.out.print(k);
			System.out.print("\n");
			
			k=0;
			
		}
		
}

}
