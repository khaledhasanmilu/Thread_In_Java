public class hanama implements Runnable {
    @Override
    public void run(){
        try {
            System.out.println("Thread interface object:"+Thread.currentThread().getId());
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Main myThread = new Main(i);
            myThread.setPriority(Thread.MAX_PRIORITY);
            myThread.start();
            Thread t = new Thread(new hanama());
            t.start();
        }
    }
}
