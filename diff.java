import java.io.*;
import java.util.Scanner;
class Difference{
public static void main(String args[])
{
Scanner src=new Scanner(System.in);
int x=src.nextInt();
int y=src.nextInt();
int diff=0;
if(x>y)
diff=x-y;
else
diff=y-x;
System.out.println(diff);
}
}