import java.util.*;
class evenint{
public static void main(String args[])throws Exception{
try{
Scanner s=new Scanner(System.in);
System.out.println("enter two numbers");
int n=s.nextInt();
int m=s.nextInt();
for(int i=n+1;i<=m;i++){
if(i%2==0)
System.out.print(i+" ");
}
}
catch(Exception e){
System.out.println("invalid input");
}
}
}
