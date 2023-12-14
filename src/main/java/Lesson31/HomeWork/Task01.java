package Lesson31.HomeWork;

public class Task01 {
    //Напишите класс, реализующий интерфейс Runnable, содержащий поле-счетчик. Метод run()
    //должен наращивать этот счетчик. Создайте пять экземпляров этого класса и запустите их в пяти
    //потоках с разными приоритетами. После 3 секунд работы остановите потоки и сравните значения
    //счетчиков.

    //hw - Создайте пять экземпляров этого класса и запустите их в пяти
    //потоках с разными приоритетами. После 3 секунд работы остановите потоки и сравните значения
    //счетчиков.
    public static void main(String[] args) throws InterruptedException {

        Thread thread[] = new Thread[5];

        for (int i = 0; i < thread.length; i++) {
            thread[i] = new Thread(new CountThread(), "Thread " + i);
            thread[i].setPriority(Thread.MIN_PRIORITY + i * 2);
        }
        for (int i = 0; i < thread.length; i++) {
            thread[i].start();
        }
        Thread.sleep(3000);
        System.out.println();
        for (int i = 0; i < thread.length; i++) {
            thread[i].interrupt();
            thread[i].join();
        }
    }

    static class CountThread implements Runnable {
        volatile int count = 0;

        public int getCount() {
            return count;
        }

        @Override
        public void run() {
            System.out.println("Start " + Thread.currentThread().getName() + " priority = " + Thread.currentThread().getPriority());
            while (true) {
                count++;

                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("End   " + Thread.currentThread().getName() + " priority = " + Thread.currentThread().getPriority());
                    break;
                }
            }
        }
    }


}
