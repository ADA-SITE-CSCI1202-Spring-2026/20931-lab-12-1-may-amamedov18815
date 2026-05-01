import java.util.HashMap;

public class VisitCounter {
    public static void main(String[] args) throws InterruptedException {
        HashMap<String, Integer> visits = new HashMap<>();

        visits.put("home", 0);
        visits.put("about", 0);
        visits.put("contact", 0);

        Thread user1 = new Thread(() -> {
            visits.put("home", visits.get("home") + 1);
            visits.put("about", visits.get("about") + 1);
        });

        Thread user2 = new Thread(() -> {
            visits.put("home", visits.get("home") + 1);
            visits.put("contact", visits.get("contact") + 1);
        });

        user1.start();
        user2.start();

        user1.join();
        user2.join();

        System.out.println(visits);
    }
}