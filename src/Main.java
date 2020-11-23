import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Создаем объект
        BonusMilesService bonusMilesService = new BonusMilesService();

        // Подключаем модуль Scanner
        Scanner scanner = new Scanner(System.in);

        //Просим ввести стоимость билета
        bonusMilesService.message();

        // Записываем введеное значение в переменную price
        int price = scanner.nextInt();

        // Вызываем метод calculate из объекта bonusMilesService класса BonusMilesService и
        // записываем его результат в переменную miles
        int miles = bonusMilesService.calculate(price);

        // Выводим на консоль сообщение
        System.out.println("Начислено бонусов - " + miles);

    }
}
