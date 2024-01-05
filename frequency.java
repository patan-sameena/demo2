import java.util.Scanner;
class FrequencyChar{
public static void main(String args[])
{
Scanner src=new Scanner(System.in);
String str=src.nextLine();
char ch=src.next().charAt(0);
int count=0;
for(int i=0;i<=str.length()-1;i++){
if(str.charAt(i)==ch){
count++;
}
}
//System.out.println("Frequency of"+ch+"is:"+count);
System.out.println(count);
}
}
