public class CountCharacters implements Runnable {
    public void run() {
        char c;
        for (c='a'; c<='z'; c++) {
            try {
                System.out.println(c + " ");
                Thread.sleep(200);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
