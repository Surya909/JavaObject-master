package Abstraction;

public abstract class Calc1 implements MyInterface {
//    public abstract void method2();
    public void add(int a, int b) {
        int c = a+b;
        System.out.println(c);
    }


    public void mul(int a, int b) {
        int c = a*b;
        System.out.println(c);
    }
}
