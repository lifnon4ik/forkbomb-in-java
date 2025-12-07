import java.io.IOException;

class Main {

    private static final String App_calc = "calc.exe";
    private static final String App_explorer = "explorer.exe";
    

    public static void main(String[] args) {
        long totalStartTime = System.currentTimeMillis();
        for (int i = 2; i > 1; i++) {
            long sampleStartTime = System.currentTimeMillis();
            launchApplication();
            System.out.println("Sample time: " + (System.currentTimeMillis() - sampleStartTime) + " ms");
        }
        System.out.println("Total time: " + (System.currentTimeMillis() - totalStartTime) + " ms");
    }

    private static void launchApplication() {
        try {
            new ProcessBuilder(App_calc).start();
            System.out.println("Started: " + App_calc);
        } catch (IOException e) {
            System.err.println("Failed to start application: " + e.getMessage());
        }
        try { 
            new ProcessBuilder(App_explorer).start();
            System.out.println("Started " + App_explorer);
        } catch(IOException e){
            System.out.println("Failed to start" + e.getMessage());
        }
    }
}
