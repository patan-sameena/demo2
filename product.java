import java.util.Scanner;
class ProductDigits1
{
public static void main(String args[]){
Scanner src=new Scanner(System.in);
int n;//To hold number
int pd=1;//To hold sum of digits
System.out.println("Enter any positive integer:");
n=src.nextInt();
while(n>0){
pd=pd*(n%10);
n=n/10;
}
System.out.println(pd);
}
}