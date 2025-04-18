// This class demonstrates printing alphabets using threads

public class PrintAlphabets implements Runnable {
    @Override
    public void run() {
        // Printing first 5 alphabets
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Alphabet: " + ch);
            try {
                Thread.sleep(600); // Delay for readability
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

