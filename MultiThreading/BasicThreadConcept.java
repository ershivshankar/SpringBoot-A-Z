package ThreadPackage;


    // 1. Creating a thread by implementing Runnable.
    class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("Runnable thread is running");

            for (int i = 1; i <= 3; i++) {
                System.out.println(
                        Thread.currentThread().getName() + " : " + i
                );

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Runnable thread interrupted");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    // 2. Creating a thread by extending Thread
    class MyThread extends Thread {

        MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println("Thread class is running");

            for (int i = 1; i <= 3; i++) {
                System.out.println(
                        Thread.currentThread().getName() + " : " + i
                );
            }
        }
    }

    public class BasicThreadConcept{

        public static void main(String[] args)
                throws InterruptedException {

            // 3. Current thread methods
            Thread mainThread = Thread.currentThread();

            System.out.println("Current thread: "
                    + mainThread.getName());

            System.out.println("Main priority: "
                    + mainThread.getPriority());

            // mainThread.setName("MyMainThread");
            // mainThread.setPriority(8);

            // 4. Create threads using both approaches
            MyThread t1 = new MyThread("Worker-1");

            MyRunnable task = new MyRunnable();
            Thread t2 = new Thread(task, "Worker-2");

            // 5. Thread name and priority methods
            t1.setName("First-Thread");
            t1.setPriority(Thread.MAX_PRIORITY);

            t2.setName("Runnable-Thread");
            t2.setPriority(Thread.MIN_PRIORITY);

            System.out.println("Thread 1 name: " + t1.getName());
            System.out.println("Thread 1 priority: " + t1.getPriority());

            System.out.println("Thread 2 name: " + t2.getName());
            System.out.println("Thread 2 priority: " + t2.getPriority());

            // 6. Check thread state before starting
            System.out.println("Is t1 alive? " + t1.isAlive());

            // 7. Start both threads
            t1.start();
            t2.start();

            // 8. Check whether threads are alive
            System.out.println("Is t1 alive? " + t1.isAlive());
            System.out.println("Is t2 alive? " + t2.isAlive());

            // 9. Main thread sleeps for one second
            Thread.sleep(1000);
            System.out.println("Main thread woke up");

            // 10. Wait for both threads to finish
            t1.join();
            t2.join();

            System.out.println("Is t1 alive? " + t1.isAlive());
            System.out.println("Is t2 alive? " + t2.isAlive());

            // 11. Demonstrate a daemon thread
            Thread daemon = new Thread(() -> {
                while (true) {
                    System.out.println("Daemon thread is running");

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        break;
                    }
                }
            }, "Daemon-Thread");

            // Must be called before start()
            daemon.setDaemon(true);

            System.out.println("Is daemon? " + daemon.isDaemon());

            daemon.start();

            // 12. Demonstrate yield()
            Thread.yield();

            System.out.println("Main thread finished");
        }
    }


