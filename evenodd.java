import java.util.*;
class Program201{
public static void main(String args[])
{
Scanner src=new Scanner(System.in);
int n;
System.out.println("Enter the number:");
n=src.nextInt();
if(n%2==0)
{
System.out.println("Even\n");
System.out.println(n+"is Even\n");
}
else
{
System.out.println("Odd\n");
System.out.println(n+"is Odd\n");
}
}
}