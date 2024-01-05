import java.util.Scanner;
class Armstrong{
public static int lenDigit(int n){
int len=0;
while(n>0){len++;n=n/10;}
return len;
}//lenDigit()
public static boolean checkArmstrong(final int n)
{
int sum=0;
int exp=lenDigit(n);
int num=n;
while(num>0)
{
sum+=(int)Math.pow((num%10),exp);
num=num/10;
}//while
return n==sum;
}//checkArmstrong()
public static void main(String args[]){
Scanner src=new Scanner(System.in);
int inputNum=src.nextInt();
if(checkArmstrong(inputNum)) System.out.print("YES");
else System.out.println("NO");
}
}