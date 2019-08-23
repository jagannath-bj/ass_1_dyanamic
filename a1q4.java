import java.util.*;

public class a1q4{
public static void main (String[] args){

int a,b,c,d;

Scanner sc = new Scanner (System.in);

System.out.println("enter your first no.");
a=sc.nextInt();
System.out.println("enter your second no.");
b=sc.nextInt();
System.out.println("enter your third no.");
c=sc.nextInt();
System.out.println("enter your fourth no.");
d=sc.nextInt();

int result = a>b?(a>c?(a>d?a:d):(c>d?c:d)):(b>c?(b>d?b:d):(c>d?c:d));

System.out.println("the greatest no. is = "+result);

}}

