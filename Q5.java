import java.util.*;
public class Q5{
public static void main (String[] args){

double a;

Scanner sc= new Scanner(System.in);
System.out.println("Enter you salary");
a=sc.nextDouble();

if (a>=0.00&&a<15000.00)
System.out.println("Tax to be paid is "+(0.00+((a-0.00)*0.15)));

if (a>=15000.00&&a<30000.00)
System.out.println("Tax to be paid is "+(2250.00+((a-15000.00)*0.18)));

if (a>=30000.00&&a<50000.00)
System.out.println("Tax to be paid is "+(5400.00+((a-30000.00)*0.22)));

if (a>=30000.00&&a<50000.00)
System.out.println("Tax to be paid is "+(5400.00+((a-30000.00)*0.22)));

if (a>=50000.00&&a<80000.00)
System.out.println("Tax to be paid is "+(11000.00+((a-50000.00)*0.27)));

if (a>=80000.00&&a<=150000.00)
System.out.println("Tax to be paid is "+(21600.00+((a-80000.00)*0.33)));

if (a>150000.00)
System.out.println("Tax to be paid is "+(-1.0));

}}

