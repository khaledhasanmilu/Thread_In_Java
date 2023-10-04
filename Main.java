public class Main extends Thread {
    int id;

    public Main(int id) {
        this.id = id;
    }

    public void run() {
        try {
            System.out.println("Thread class object: " + id);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
