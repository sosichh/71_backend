package lessons.lesson_01;

public class MyThread extends Thread {
    private String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
        setName(threadName);        // Устанавливаем имя потока для отладки
    }

    @Override
    public void run() {
        System.out.println(threadName + " начал работу");

        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + ": счетчик = " + i);
            try {
                // Thread.sleep() - приостанавливает выполнение потока
                // Параметр устанавливается в миллисекундах
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + " был прерван");
                e.printStackTrace();
            }
        }
        System.out.println(threadName + " завершил работу");
    }
}







