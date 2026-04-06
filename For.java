import java.util.Scanner;
public class For
{
    public static  void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter an integer");
    int num=sc.nextInt();
    for(int i=1;i<=5;i++)
    {
        System.out.println(num+"x"+"num*i");

     
    }
    sc.close();
}

}
