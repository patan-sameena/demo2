import java.util.Scanner;
class BreakEx1
{
public static void main(String args[])
{
Scanner src=new Scanner(System.in);
int n=src.nextInt();//5
byte i=0;
while(true){
i++;
if(i%5==0)continue;
else{System.out.print(i+",");}
}//while
}}
