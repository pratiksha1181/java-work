package multidimentional;

public class Prime_num {

	public static void main(String[] args) {

		int no=0;
		int[][]arr=new int[10][10];
		
		int counter=1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(counter==1) {
					arr[i][j]=0;
					
				}
				counter++;
				if(counter>1)
				{
					boolean flag=true;
					for(int k=2;k<counter;k++)
					{
						if (counter%k==0);
					}
				}
			}
		}
		
	}

}
