import java.util.Scanner;
class PalindromeNumbers
{
public static void main(String args[]){
Scanner src=new Scanner(System.in);
int n;
int rd=0;
System.out.println("Enter any positive integer:");
n=src.nextInt();
int num=n;
while(n>0){
rd=rd*10+(n%10);
n=n/10;
}
if(   num==rd)
{System.out.println("Palindrome");}
else
{System.out.println("Not Palindrome");}
}
}