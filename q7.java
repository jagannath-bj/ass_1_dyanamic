import java.util.*;
public class q7{
public static void main (String[]args){

double a,b;

Scanner sc = new Scanner(System.in);

System.out.println("ENTER NUMBERS");

System.out.println("FIRST NUMBER :");
a= sc.nextDouble();

System.out.println("SECOND NUMBER :");
b= sc.nextDouble();

char c;
System .out.println("ENTER THE OPERATION :");
c= sc.next().charAt(0);


double r;

switch(c)

{

case '+':
r=a+b;
break;

case '-':
r=a-b;
break;

case '*':
r=a*b;
break;

case '/':
r=a/b;
break;

default:

System.out.println("operation not found");
return;

}

System.out.println("BY CALCULATION");

System.out.print(+a+"" );
System.out.print(c);
System.out.print(+b+" ");
System.out.print("=");
System.out.print(+r);


}}
