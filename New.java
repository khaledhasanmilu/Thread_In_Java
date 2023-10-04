public class New extends Thread {
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
    }
 public void runny(){
     System.out.println("Hi Bye");
 }


    public static void main(String[] args) {
        New n = new New();
        New n1 = new New();
        n.start();
        n1.runny();
        n1.start();
        try {
            n.join();
            n1.join();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    }

