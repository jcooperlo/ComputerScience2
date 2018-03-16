public class Looping
{
 public static void main (String [] args)
 {
  int x = 9;
  while(x > 0)
  {
   System.out.print(x);
   x--;
  }

  System.out.println();

  
  for(int y = 2; y < 8; y++)
  {	  
   System.out.print(y +  " ");
   
   if(y < 7)
   {
	   System.out.print("0 ");
   }
  }//for

  System.out.println();
 
  int num = 4;
  int a = 4;
  int b = 9;
  do
  {
   System.out.print(a + " ");
   a += 10;
   if(a < 25)
   {
	   System.out.print(b + " ");
   }
   b += 10;
   num += 10;
  }
  while(num < 25);
  
  System.out.println();
  
  for(int c = 111; c > 103; c--)
  {
	  System.out.print(c + " ");
  }
  
  System.out.println();
  
 }//looping
}//main
