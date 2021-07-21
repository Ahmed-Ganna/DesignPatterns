package behavioral.command;


//Client
public class CommandEverydayDemo {

    public static void main(String[] args) {
        Task task1 = new Task(3,2);
        Task task2 = new Task(3,2); //  encapsulating

        Thread thread1 = new Thread(task1); //invoker
        thread1.start();

        Thread thread2 = new Thread(task2);
        thread2.start();
    }


    static class Task implements Runnable {
        private int num1,num2;

        public Task(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        @Override
        public void run() { // Receiver
            System.out.println(num1*num2);
        }
    }
}
