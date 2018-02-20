import java.util.*;
class Hello{
public static void main(String args[])throws Exception{
try{
int n=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=1;i<=n;i++)
System.out.println("Hello");
}
}
catch(Exception e){
  System.out.println("invalid input");
  }
  }
}
