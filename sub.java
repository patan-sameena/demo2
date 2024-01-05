import java.util.Scanner;
class Subtraction{
public static void main(String args[])
{
int num1,num2,sub;
Scanner src=new Scanner(System.in);
System.out.println("Enter the number:");
num1=src.nextInt();
System.out.println("Enter the number:");
num2=src.nextInt();
src.close();
sub=num1-num2;
System.out.println(num1+"-"+num2+"="+sub);
}
}