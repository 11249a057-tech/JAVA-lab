import java.io.*;
import java.util.*;
class Factorial
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
int i=s.nextInt();
long factorial=1;
if(i<0){
System.out.println("factorial is not defined for negative numbers");
}else{
for(int a=1;a<=i;a++){
factorial *=a;
}
System.out.println("The factorial of"+i+"is"+factorial);
}
}
}