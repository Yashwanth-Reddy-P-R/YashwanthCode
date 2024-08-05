class Diamand2 
{
	public static void main(String[] args) 
	{
		int n=10;
		if(n%2==0) 
n=n+1;
		int spc=n/2-1;
			int st=1;
		for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=spc;j++)
					{
						System.out.print("  ");
					}
				for(int j=1;j<=st;j++)
					{
						if(j==1||j==st)
						System.out.print("* ");
							else System.out.print("  ");
					}
			System.out.println();

			if(i<n/2)
{
				spc--;
				st+=2;
}
else
{
	spc++;
st-=2;
}
				
				
				
			}
	}
}
