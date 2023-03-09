import java.util.*;
class gt
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  System.out.println("enter a: ");
  int a=s.nextInt();
  System.out.println("enter b: ");
  int b=s.nextInt();
  System.out.println("enter c: ");
  int c=s.nextInt();
  if(a>=b&&a>=c)
  {
   System.out.println(+a+"is the greatest");
  }
  else if(b>=a && b>=c)
  {
   System.out.println(b+"is the greatest");
  }
  else
  {
   System.out.println(c+"is the greatest");
  }
 }
}
   
  