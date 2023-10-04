public class Example implements Runnable {
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Example example = new Example();
        Thread t1 = new Thread(example);
        t1.setName("Arosh");
        t1.start();
        Thread t2 = new Thread(example);
        t2.setName("Sizan");

        try {
            t1.join();
            t2.start();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            t1.wait(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}

