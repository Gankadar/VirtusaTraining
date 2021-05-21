public class MultiThread {
    public static void main(String[] args) {
        ThreadEx thread1 = new ThreadEx();
        thread1.setPriority(4);
        thread1.getPriority();
        System.out.println(thread1.getPriority());
        thread1.setName("ThreaddemoEx");
        System.out.println(thread1.getName());
        thread1.start();
    }
}
