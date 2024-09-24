package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private  static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Start of Execution");

        Scanner sc = new Scanner(System.in);
        double a,b;
        int n;
        boolean flag=true;
        System.out.println("1. a+b\n2. a-b\n3. a*b\n4. a/b\n5. a^1/2\n6. a^b\n7. a! \n8. log_e(a)\n9. Exit");
        while(flag){
            switch(sc.nextInt()){
                case 1:
                    System.out.print("a: ");
                    a = sc.nextDouble();
                    System.out.print("b: ");
                    b = sc.nextDouble();
                    System.out.println(add(a,b));
                    break;
                case 2:
                    System.out.print("a: ");
                    a = sc.nextDouble();
                    System.out.print("b: ");
                    b = sc.nextDouble();
                    System.out.println(sub(a,b));
                    break;
                case 3:
                    System.out.print("a: ");
                    a = sc.nextDouble();
                    System.out.print("b: ");
                    b = sc.nextDouble();
                    System.out.println(mul(a,b));
                    break;
                case 4:
                    System.out.print("a: ");
                    a = sc.nextDouble();
                    System.out.print("b: ");
                    b =sc.nextDouble();
                    System.out.println(div(a,b));
                    break;
                case 5:
                    System.out.print("a: ");
                    a = sc.nextDouble();
                    System.out.println(square_root(a));
                    break;
                case 6:
                    System.out.print("a: ");
                    a = sc.nextDouble();
                    System.out.print("b: ");
                    b = sc.nextDouble();
                    System.out.println(pow(a,b));
                    break;
                case 7:
                    System.out.print("a: ");
                    n = sc.nextInt();
                    System.out.println(factorial(n));
                    break;
                case 8:
                    System.out.print("a: ");
                    a = sc.nextDouble();
                    System.out.println(log_e(a));
                    break;
                case 9:
                    flag=false;
                    break;
                default:
                    logger.warn("Invalid input");
                    System.out.println("Invalid input");

            }
        }

        logger.info("End of Execution");

    }
    public static double add(double a, double b){
        return a + b;

    }
    public static double sub(double a, double b){
        return a - b;
    }
    public static double mul(double a, double b){
        return a * b;
    }
    public static double div(double a, double b){
        return a / b;
    }
    public static double square_root(double a){
        return Math.sqrt(a);
    }
    public static double pow(double a, double b){
        return Math.pow(a, b);
    }
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static double log_e(double a){
        return Math.log(a);
    }
}