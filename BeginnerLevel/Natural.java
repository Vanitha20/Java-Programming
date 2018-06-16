import java.util.*;
class Natnum{
public static void main(String args[]){
try{
int sum=0;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n<=100000){
for(int i=1;i<=n;i++)
sum+=i;
System.out.println(sum);
}
else
System.out.println("Invalid input");
}
catch(Exception e){
System.out.println("Invalid input");
}
}
}
