import java.util.Scanner;

interface calci{
int add(int a, int b)
}
class CalcImpl implements calci{
    public int add(int a, int b){
        return a+b;
    }
}
class Calcidriver{
    public static void main(String[] args){
        System.out.println("Enter number");
        Scanner s= new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        Calci c=new CalcImpl();
        System.out.println(c.add);
    }
}
