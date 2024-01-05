import java.util.Scanner;
 class ArithmeticOperators{
public static void main(String args[]){
Scanner src=new Scanner(System.in);
System.out.println("Enter the first number:");
double num1=src.nextDouble();
System.out.println("Enter the second number:");
double num2=src.nextDouble();
double sum=num1+num2;
double difference=num1-num2;
double product=num1*num2;
double div=num1/num2;
double quotient=num1%num2;
System.out.println("The sum of the above two numbers is:"+sum);
System.out.println("The difference of the two numbers is:"+difference);
System.out.println("The division of the two numbers is:"+div);
System.out.println("The product of the two numbers is:"+product);
System.out.println("The quotient of the two numbers is:"+quotient);
}
}

