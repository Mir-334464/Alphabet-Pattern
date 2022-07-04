class Pattern7
{
	 public static void main(String[] args)
	 {
		int i,j;

		for(i=70; i>=65; i--)
		{
			for(j=i; j>=65; j--)
				System.out.print((char)j+" ");

			System.out.println();
		}
    }
}