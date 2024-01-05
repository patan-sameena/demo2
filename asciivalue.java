
import java.util.Scanner;
class printAsciiValue{
public static void main(String args[]){
System.out.println("Enter the ascii character:");
Scanner src=new Scanner(System.in);
char chr=src.next().charAt(0);
int asciiValue=chr;

System.out.println("Ascii value:"+asciiValue);
}
}
