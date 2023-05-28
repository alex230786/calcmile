// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int priceTicket = 10000;
        int bonusMile = service.calculate(priceTicket);

        System.out.println("Бонусные мили: " + bonusMile);
    }
}