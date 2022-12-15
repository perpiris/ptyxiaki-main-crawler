package crawler;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {

    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Schedule the task to run every 6 hours
        scheduler.scheduleAtFixedRate(() -> RefreshData(), 0, 6, TimeUnit.HOURS);
    }

    private static void RefreshData() {
        try (Repository repository = new Repository()) {

        }
    }
}
