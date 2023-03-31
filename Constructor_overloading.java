                //CONSTRUCTOR OVERLOADING
import java.util.*;
import java.lang.String;
class Details
{
  int m1,m2,m3;
  String name;
  int reg_no;
  Details(int m,int x,int y,String s,int n)
  {
    m1=m;
    m2=x;
    m3=y;
    name=s;
    reg_no=n;
}
  void show()
 {
   System.out.println( name + " " +m1+" "+ m2 +" "+ m3+ " " +reg_no + " " );

  }
}
 
class Constructor_overloading
{
  public static void main(String args[])
 {
   Scanner k=new Scanner(System.in);
   System.out.println("enter details");
   int n1,n2,n3;
   int rr;
   String g;
   n1=k.nextInt();
   n2=k.nextInt();
   n3=k.nextInt();
   rr=k.nextInt();
   g=k.next();
  Details s=new Details(n1,n2,n3,g,rr);
  s.show();
}
  
}
  