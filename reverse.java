/*//Reverse the digits
INPUT
56342
OUTPUT
24365
*/
import java.util.Scanner;
class ReverseDigits
{
public static void main(String args[]){
Scanner src=new Scanner(System.in);
int n;
int rd=0;
n=src.nextInt();
while(n>0){
rd=rd*10+(n%10);
n=n/10;
}
System.out.println(rd);
}
}
