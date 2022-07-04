class Pattern6

{

    public static void main(String[]args)
 
    {

        int i,j;

     for(i=65; i<=70; i++)

      {

        for(j=i; j<=70; j++)
        System.out.print(" ");

          for(j=65; j<=i; j++)
           System.out.print((char)j+" ");

        System.out.println();
      }
   }
}