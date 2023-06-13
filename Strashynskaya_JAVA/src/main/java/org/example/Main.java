import java.util.Scanner;

public class Main {

    public static int num = 7;
    public static String name = "Vyacheslav";
    public static int divide = 3;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        Task1();
        //Task2();
        //Task3(new int[]{ 1,2,3,4,5,6,7,8,9,10 });


    }

    public static void Task1() {

        System.out.println("Enter an integer");
        int myint = keyboard.nextInt();

        if (myint > num) System.out.println("Privet");
    }

    public static void Task2() {
        System.out.println("Enter a name");
        String mystring = keyboard.nextLine();

        if (mystring.equals(name)) System.out.println("Privet" + " " + name);
    }

    public static void Task3(int[] arr) {
        for (int i : arr) {
            if (i % divide == 0) System.out.println(i);
        }

    }
}