package ua.epam.javacore.lesson_03;

public class WorkerDemo {
    public static void main(String[] args) {
        Person worker = new Worker();

        worker.setId(1L);
        worker.setName("Worker name");
        ((Worker) worker).setSpecialty("Test specialty");
        worker.doJob();
    }
}
