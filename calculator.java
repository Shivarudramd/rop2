import java.util.Scanner;
public class calculator {
    public static  int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int pro(int a,int b){
        return a*b;
    }
    public static float div(float a,float b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the operand a: ");
        int a= in.nextInt();
        System.out.println("Enter the operand b: ");
        int b= in.nextInt();
        System.out.println("Enter the operation ");
        System.out.println("1.Addition\n2.Subtraction\n3.Product\n4.Division\n");
        int choice= in.nextInt();
        switch (choice){
            case 1:
                System.out.println("The sum of the "+a+" and "+b+" is: "+add(a,b));
                break;
            case 2:
                System.out.println("The difference of the "+a+" and "+b+" is: "+sub(a,b));
                break;
            case 3:
                System.out.println("The Product of the "+a+" and "+b+" is: "+pro(a,b));
                break;
            case 4:
                System.out.println("The Product of the "+a+" and "+b+" is: "+div(a,b));
                break;
        }
    }
}

