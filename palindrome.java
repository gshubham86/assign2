import java.util.*;
public class palindrome
{
public static void main(String ags[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int sum=0,n;

while(a!=0)
{
n=a%10;
sum=sum*10+n;
a=a/10;


}
if(a==sum)
{System.out.println(a + "is palindrome");}

else
{System.out.println(a + "is not palindrome");}
}

}