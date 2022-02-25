import java.util.HashMap;
import java.util.Scanner;

/**
 * @author butrim
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Double> avgMarkByPupil = new HashMap<>();

        while (true) {
            System.out.println("===============================");
            System.out.println("1 -- добавить ученика");
            System.out.println("2 -- вывести средние баллы");
            System.out.println("0 -- выход");
            System.out.println("Введите команду: ");

            int cmd = scanner.nextInt();
            System.out.println("===============================");

            if (cmd == 0) {
                break;
            } else if (cmd == 1) {
                System.out.println("Введите имя: ");
                String name = scanner.next();
                System.out.println("Оценка за математику:");
                int mathMark = scanner.nextInt();
                System.out.println("Оценка за русский язык:");
                int russianLngMark = scanner.nextInt();
                System.out.println("Оценка за физику:");
                int physics = scanner.nextInt();

                double avgMark = (mathMark + russianLngMark + physics) / 3.0;
                avgMarkByPupil.put(name, avgMark);
                System.out.println("Ученик " + name + " успешно добавлен");
            } else if (cmd == 2) {
                System.out.println("Классный журнал");
                for (String pupil : avgMarkByPupil.keySet()) {
                    System.out.println(pupil + ": " + avgMarkByPupil.get(pupil));
                }
            }
        }
    }
}
