import java.util.Scanner;

public class BonusMilesService {

    public int calculate(int cost) {
        int bonusMiles = cost / 20;
        return bonusMiles;
    }

    public void message() {
        System.out.println("Введите стоимость авиабилета (рублей)");
    }

}
