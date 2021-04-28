public class TestSynchronization {
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread1 myThread1 = new MyThread1(obj);
        MyThread2 myThread2 = new MyThread2(obj);
        myThread2.start();
        myThread1.start();

    }
}
