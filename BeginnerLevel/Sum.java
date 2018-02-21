import java.util.*;
class Sum{
public static void main(String args[])throws Exception{
try{
int n=0,sum=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=0;i<=n;i++){
sum=sum+i;
}
System.out.println(sum);
}
catch(Exception e){
System.out.println("enter input as number");
}
}
}
