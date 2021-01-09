public class Break_Continue {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 15) {
                break; //цикл прерывается
            }
            System.out.println(i);
            i++;
        }
        System.out.println("всё");

        for (int x = 0; x <= 15; x++) {
            if (x % 2 == 0) { //% - деление на число после и просмотр остатка
                continue; //продолжаем цикл, если условие x % 2 == 0 выполнилось 
            }
            System.out.println("Это нечетное число "+x);

        }
    }
}
