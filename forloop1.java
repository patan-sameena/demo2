//loops
/*
1,2,3,.....,100
0+5+10+15+....+95+100=1050
*/
class Test{
public static void main(String args[]){
int i=0;int j=100;
int sum=0;
for(i=0,j=100;i<=100&&j>=0;i++,j--)
{
System.out.print(i+","+j+",");
}//for
}//main()
}