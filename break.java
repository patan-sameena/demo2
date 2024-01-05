import java.util.Scanner;
class BreakEx1
{
public static void main(String args[])
{
Scanner src=new Scanner(System.in);
int n=src.nextInt();
byte i=0;
while(true){
System.out.print(i+",");
if(i==n)break;
i++;
}
}
}