package encapsulation;

import java.util.Scanner;


public class Test {
    public static void main(String[] args){
        Student s=new Student();
//        Scanner scanner=new Scanner(System.in);
//
//        System.out.println("What name you want set?");
//
//        String name=scanner.next();

        System.out.println("You Have :"+s.getName());
        s.setName("Srikanth");
        System.out.println("You entered :"+s.getName());
    }
}
