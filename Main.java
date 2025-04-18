public class Main {
    public static void main(String[] args) {
        // Creating thread instances
        Thread numberThread = new Thread(new PrintNumbers());
        Thread alphabetThread = new Thread(new PrintAlphabets());
        Thread symbolThread = new Thread(new PrintSymbols());

        // Starting all threads
        numberThread.start();
        alphabetThread.start();
        symbolThread.start();
    }
}

