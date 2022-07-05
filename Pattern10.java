class Pattern10
{

    public static void main(String[]args)

      {

       int i,j,k=65;
			
     for(i=65; i<=70; i++)
     {

         for(j=65; j<i+1; j++)
          System.out.print((char)k++ +" ");

         System.out.println();
       }
   }
}