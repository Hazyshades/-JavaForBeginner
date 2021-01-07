import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {
        String s ="String1"; // String1 = Объект класса стринг
        String a = new String("String2"); // то же самое, новый объект класса стринг = String2
        Scanner sc = new Scanner(System.in); //В скобках пишется входной поток - System.in
        System.out.println("Введите число:");
        int x = sc.nextInt();
       // String string = sc.nextLine(); // объект sc вызываем метод nextLine()
        System.out.println("Вы ввели "+"'" +x+"'");
    }
}
