//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer(3);
        Thread producer = new Thread(new Producer(sharedBuffer));
        Thread consumer = new Thread(new Consumer(sharedBuffer));
        producer.start(); consumer.start();}
}