package Videos40to45;

public class JoinMethod {

    private static int count = 0;

    public static synchronized void incCount() {
        count++;
        //synchronized will "lock" the count variable so that
        //only one thread can access it at a time; if it's locked,
        //the other thread(s) will wait until it is done.
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<10000; i++){
                    incCount();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<10000; i++){
                    incCount();
                }
            }
        });

        t1.start();
        t2.start();


        try {
            /*
            Java Thread join method can be used to pause current thread
            execution until the specified thread is dead.
             */
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("value : " + count);
    }

}
