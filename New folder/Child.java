public class Child {
    public static void main(String[] args) {
        // Creating a child thread
        Thread childThread = new Thread() {
            public void run() {
                System.out.println("Child thread running");
            }
        };
        
        // Starting the child thread
        childThread.start();
        
        // Main thread execution
        System.out.println("Main thread running");
    }
}