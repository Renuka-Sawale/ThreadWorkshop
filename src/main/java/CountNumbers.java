public class CountNumbers implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                System.out.println(i);
                Thread.sleep(200);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
