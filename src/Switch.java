import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Введи возраст");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
       switch (age){
           case  0:
               System.out.println("я родился");
               break;
           case 15:
               System.out.println("ты дохляк");
               break;
           case 18:
               System.out.println("ты машина");
               break;
           default:
               System.out.println("Жук навозный");
       }
    }
}
