import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatchTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap vao 3 canh tam giac");
        try{
            double a=input.nextDouble();
            double b=input.nextDouble();
            double c=input.nextDouble();
            tryCatchTriangle.IllegalTriangleException(a,b,c);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Khong phai la so thuc");
        }catch (Exception e){
            System.out.println("Nhieu loi qua");
        }finally {
            System.out.println("End");
        }
    }
    public static void IllegalTriangleException(double a, double b, double c){
        if(a+b>c && a+c>b && b+c>a && a>0&& b>0&& c>0){
            throw new ArithmeticException("Triangle");
        }else {
            throw new ArithmeticException("NOT a triangle");
        }
    }

}
