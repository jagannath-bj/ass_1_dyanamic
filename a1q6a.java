import java.util.*;
public class a1q6a{
public static void main (String[] args){

int b;

Scanner sc= new Scanner(System.in);
System.out.println("Enter year");
b=sc.nextInt();

int Q=b%4;

if(Q == 0){
System.out.print("Year " +b);
System.out.println( " is a leap year");
}
else  
{System.out.print("Year " +b);
System.out.println( " is a not leap year");
}


}}

