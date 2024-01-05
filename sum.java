import java.util.Scanner;
class Addition{
public static void main(String args[])
{
int num1,num2,sum;
Scanner src=new Scanner(System.in);
System.out.println("Enter the number:");
num1=src.nextInt();
System.out.println("Enter the number:");
num2=src.nextInt();
src.close();
sum=num1+num2;
System.out.println(num1+"+"+num2+"="+sum);
}
}