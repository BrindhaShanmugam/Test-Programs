import java.util.Scanner;
public class Number{
public static void main(String ag[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if(a>0)
{
System.out.println("The given number is Positive number");
}
else if(a<0)
{
System.out.println("The given number is negative number");
}
else
{
System.out.println("The given number is zero");
}
}
}