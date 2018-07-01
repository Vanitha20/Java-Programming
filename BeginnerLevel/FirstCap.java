import java.util.*;
class Firstc{
public static void main(String args[]){
String m="",p="";
Scanner s=new Scanner(System.in);
String n=s.nextLine();
String a[]=n.split(" ");
 if(n.length()<1000000){
for(int j=0;j<a.length;j++){
for(int i=0;i<a[j].length();i++){
if(i==0){
m=(String.valueOf(a[j].charAt(i))).toUpperCase();
}
else{
p=p+(String.valueOf(a[j].charAt(i))).toLowerCase();
}
}
System.out.print(m+p);
p="";
System.out.print(" ");
}
}
}
}
