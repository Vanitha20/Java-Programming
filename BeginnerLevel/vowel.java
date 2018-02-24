import java.util.*;
class Vowel{
public static void main(String args[]){
char n='0';
Scanner s=new Scanner(System.in);
n=s.next().charAt(0);
if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U')
System.out.println("Vowel");
else if((n>='a'&&n<='z')||(n>='A'&&n<='Z')
System.out.println("Consonant");
else
System.out.println("invaild input");
}
}
