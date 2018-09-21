
import java.io.*;
import java.util.*;
class Armstrong
{
public static void main(String args[])
{
int result=0,remainder,a;
Scanner sc=new Scanner(System.in);
int Num=sc.nextInt();
a=Num;
while (Num != 0)
    {
        remainder = Num%10;
        result += remainder*remainder*remainder;
        Num /= 10;
    }

    if(result == a)
    {
        System.out.println("number is an Armstrong number.");
    }
    else
        {
            System.out.println("number is not an Armstrong number.");
}
}
}
