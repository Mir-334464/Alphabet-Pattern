class Pattern3
{

  public static void main(String[]args)

     {

         int i,j;

     for(i=65; i<=70; i++)

      {

         for(j=65; j<=i; j++)
           System.out.print((char)j+" ");
       System.out.println();
        
       }
 
        for(i=69; i>=65; i--)
          {
     
            for(j=65; j<=i; j++)
             System.out.print((char)j+" ");
 
          System.out.println();
        }
    }
}