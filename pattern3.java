import java.util.Scanner;
class Pattern3{
public static void main(String args[])
{
Scanner src=new Scanner(System.in);
char ch=src.next().charAt(0);
int row=src.nextInt();
printReversePattern(ch,row);
}
public static void printReversePattern(char c,int n){
for(int i=n;i>=1;i--){
printLine(c,i);
}
}
public static void printLine(char c,int col){
System.out.println("\n");
for(int i=1;i<=col;i++)System.out.print(c);
}
}
