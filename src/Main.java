import java.util.Scanner;

public class Main {
    private static int time;
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите желаемое время вывода анимации в секундах (только число)");
        System.out.println("Для завершения программы введите 0");
        time = scan.nextInt();
        while(time!=0) {
            Fish fish = new Fish(160);
            Thread.sleep(time*1000);
            fish.t.interrupt();
            fish.t.join();
            System.out.println();
            System.out.println("Запустить еще раз. Введите время в секундах (только число)");
            System.out.println("Для завершения программы введите 0");
            time = scan.nextInt();
        }
    }
}
