class myThread implements Runnable{

    @Override
    public void run() {
        System.out.println("My thread Runneble 1");
        System.out.println("My thread Runneble 1");
        System.out.println("My thread Runneble 1");
        System.out.println("My thread Runneble 1");
        System.out.println("My thread Runneble 1");
        System.out.println("My thread Runneble 1");
        System.out.println("My thread Runneble 1");
        System.out.println("My thread Runneble 1");
        System.out.println("My thread Runneble 1");
        System.out.println("My thread Runneble 1");
        System.out.println("My thread Runneble 1");
        System.out.println("My thread Runneble 1");
        System.out.println("My thread Runneble 1");
        System.out.println("My thread Runneble 1");
        System.out.println("My thread Runneble 1");
    }
}
class myThread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("My thread Runneble 2");
        System.out.println("My thread Runneble 2");
        System.out.println("My thread Runneble 2");
        System.out.println("My thread Runneble 2");
        System.out.println("My thread Runneble 2");
        System.out.println("My thread Runneble 2");
        System.out.println("My thread Runneble 2");
        System.out.println("My thread Runneble 2");
        System.out.println("My thread Runneble 2");
        System.out.println("My thread Runneble 2");
        System.out.println("My thread Runneble 2");
        System.out.println("My thread Runneble 2");
        System.out.println("My thread Runneble 2");
    }
}


public class Harrbaba2 {
    public static void main(String[] args) {
    myThread m = new myThread();
    Thread t1 = new Thread(m);
    myThread1 m1 = new myThread1();
    Thread t2 = new Thread(m1);
    t1.start();
    t2.start();

    }
}
