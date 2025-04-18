public class PrintSymbols implements Runnable {
    @Override
    public void run() {
        // Printing a few symbols
        char[] symbols = {'#', '@', '*', '$', '&'};
        for (char symbol : symbols) {
            System.out.println("Symbol: " + symbol);
            try {
                Thread.sleep(700); // Slight delay between prints
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

