import java.util.Scanner;
public class recursiveFibonacci {
    static int fib(int m){
        if(m==1 || m==2){
            return 1;
        }
        return fib(m-1)+fib(m-2);
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Fibonacci serisini bulmak istediğiniz sayıyı giriniz:");
        int x= input.nextInt();

        System.out.println("CEVAP = "+fib(x));
    }
}
