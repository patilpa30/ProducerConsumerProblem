public class Consumer implements Runnable {
    SharedBuffer sharedBuffer;
    Consumer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }
    @Override
    public void run() {
        try{
            for(int i = 0; i < 10; i++){
                sharedBuffer.consume();
                Thread.sleep(1500);
            }
        }catch(Exception e){
            Thread.currentThread().interrupt();
        }
    }
}
