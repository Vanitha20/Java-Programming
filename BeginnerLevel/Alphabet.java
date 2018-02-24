import java.util.*;
class Alphabet{
public static void main(String args[]){
char n='0';
Scanner s=new Scanner(System.in);
n=s.next().charAt(0);
if((n>='a'&&n<='z')||(n>='A'&&n<='Z'))
System.out.println("Alphabet");
else
System.out.println("No");
}
}
