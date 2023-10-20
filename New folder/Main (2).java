public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Creating a child thread
        Thread childThread = new Thread() {
            public void run() {
                System.out.println("Child thread running");
                try {
                    // Using the sleep() method
                    System.out.println("Child thread sleeping");
                    Thread.sleep(2000);
                    System.out.println("Child thread awake");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // Using the getName() method
                System.out.println("Child thread name: " + Thread.currentThread().getName());
                // Using the setPriority() method
                Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
                // Using the yield() method
                for (int i = 0; i < 5; i++) {
                    System.out.println("Child thread: " + i);
                    Thread.yield();
                }
                // Using the suspend() method (deprecated)
                System.out.println("Child thread suspended");
                //Thread.currentThread()
                System.out.println("Child thread resumed");
            }
        };
        
        // Using the join() method
        childThread.start();
        childThread.join();
        
        // Using the currentThread() method
        Thread currentThread = Thread.currentThread();
        System.out.println("Main thread: " + currentThread.getName());
        
        // Using the setName() method
        currentThread.setName("MainThread");
        System.out.println("Main thread name: " + currentThread.getName());
        
        // Using the getPriority() method
        int priority = currentThread.getPriority();
        System.out.println("Main thread priority: " + priority);
        
        // Using classes and objects
        Dog myDog = new Dog("Fido", "Golden Retriever", 5);
        myDog.bark();
    }
}

class Dog {
    String name;
    String breed;
    int age;
    
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    
    public void bark() {
        System.out.println(name + " says woof!");
    }
}