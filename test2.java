import java.util.Scanner;
class Test{
public static void main(String args[]){
boolean cond=true;
int a,b;
Scanner src=new Scanner(System.in);
System.out.println("enter a value:");
a=src.nextInt();
System.out.println("enter b value:");
b=src.nextInt();
System.out.println("Cond is:"+cond);
System.out.println("Var1="+a);
System.out.println("Var2="+b);
System.out.println("Now cond is:"+!cond);
System.out.println("!(a<b)="+!(a<b));
System.out.println("!(a>b)="+!(a>b));
}
}
