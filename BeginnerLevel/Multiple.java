import java.util.*;
class Multi{
public static void main(String args[])throws Exception{
try{
int k=0;
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
int n=s.nextInt();
for(int i=1;i<=5;i++){
k=k+n;
System.out.println(k+" ");
}
}
catch(Exception e){
System.out.println("invalid input");
}
}
}
