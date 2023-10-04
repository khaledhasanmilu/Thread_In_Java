 class haha1 extends Thread {
    @Override
    public void run() {
      int i = 0;
      while(i<500){
          System.out.println("Khaled Hasan Milu");
          System.out.println("Very bad Boy");
      }
    }
}
 class haha2 extends Thread{
    @Override
    public void run() {
        int i =0;
        while (i<500){
            System.out.println("Labonno was Beutiful");
            System.out.println("And Cutie");
        }
    }
}
public class HarrBaba {
    public static void main(String[] args) {
     haha1 h = new haha1();
     haha2 h1 = new haha2();
     h.start();
     h1.start();
    }
}
