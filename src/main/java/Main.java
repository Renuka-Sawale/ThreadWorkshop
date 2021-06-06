public class Main {
    public static void main(String[] args) {
        CountNumbers countNumbers = new CountNumbers();
        CountCharacters countCharacters = new CountCharacters();

        Thread numThread = new Thread(countNumbers);
        Thread charThread = new Thread(countCharacters);

        numThread.setDaemon(true);
        numThread.start();
        charThread.start();
    }
}
