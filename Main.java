import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter a number: ");
        Integer num1 = input.nextInt();
        System.out.print("Enter another number: ");
        Integer num2 = input.nextInt();
        System.out.print(name + " your Product value: "+ num1*num2);
    }
}