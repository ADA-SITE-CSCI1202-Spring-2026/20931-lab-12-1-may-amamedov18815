import java.util.HashMap;

public class ProductStock {
    public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<>();

        stock.put("Laptop", 5);
        stock.put("Mouse", 20);
        stock.put("Keyboard", 10);
        stock.put("Monitor", 3);

        System.out.println("All products:");
        stock.forEach((product, quantity) ->
                System.out.println(product + ": " + quantity));

        System.out.println("\nLow stock products:");
        stock.forEach((product, quantity) -> {
            if (quantity < 6) {
                System.out.println(product + ": " + quantity);
            }
        });
    }
}