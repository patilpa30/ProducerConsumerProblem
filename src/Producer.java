public class Producer implements Runnable {
    SharedBuffer sharedBuffer;
    Producer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }
    @Override
    public void run() {
        try{
            for(int i = 0; i < 10; i++){
                sharedBuffer.produce(i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            Thread.currentThread().interrupt();
        }
    }
}
