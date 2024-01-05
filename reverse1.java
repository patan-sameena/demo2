/*//Reverse the digits
INPUT
56342
OUTPUT
24365
*/
import java.util.Scanner;
class ReverseString
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String n;
String rs="";
//System.out.println("Enter a Strin:");
n=sc.next();
int len=n.length()-1;
for(int i=len;i>=0;i--)
{
rs=rs+n.charAt(i);
}
System.out.println(rs);
}
}
