import java.util.*;
class Fact{
public static void main(String args[]){
try{
int f=1;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n<=20){
for(int i=1;i<=n;i++){
f=f*i;
}
System.out.println(f);
}
else
System.out.println("enter valid input");
}
catch(Exception e){
System.out.println("enter vaild input");
}
}
}
