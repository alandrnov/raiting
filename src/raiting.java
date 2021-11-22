import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class raiting {

    public static void main(String[] args) {

        Date date = new Date();
        //Собираем данные у пользователя
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя и фамилию финишера");
        String name = sc.nextLine();
        System.out.println("Введите место в общем зачете");
        double a = sc.nextInt();
        System.out.println("Введите количество финишировавших");
        double b = sc.nextInt();
        //Считаем рейтинг
        double c = a / b * 100;
        int d = (int) c;
        System.out.println("Рейтинг: " + d);

        Result result = new Result(name, a, b);
        result.setRating(d);

        try {
            //Пишем данные в файл
            FileWriter writer = new FileWriter("rating.txt");
            writer.write(String.valueOf(result));
            System.out.println("Данные сохранены в файле raiting.txt");
            writer.close();

            //Читаем строчку из файла
            FileReader fileReader = new FileReader("rating.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            System.out.println("Текст записи: " + reader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}