public class BonusMilesService {
    public int calculate(int price) {
        int amount = 20;                // делитель
        int bonus = price / amount;     // бонусные мили
        return bonus;
    }
}
