package Videos40to45;

class Example implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i<10; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Thread2Example {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Example());
        Thread t2 = new Thread(new Example());
        t1.start();
        t2.start();
    }

}
