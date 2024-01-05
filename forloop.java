//loops
/*
1,2,3,.....,100
0+5+10+15+....+95+100=1050
*/
class Test{
public static void main(String args[]){
int i=0;
int sum=0;
for(i=0;i<=100;i=i+5)
{
System.out.print(i+"+");
sum=sum+i;
}//for
System.out.println("\b"+"="+sum);
}//main()
}