/**
 * Created by java_dev on 29.06.17.
 */
public class StoppableThread extends Thread {
    private boolean stopRequested = false;
    public void run() {
        boolean done = false;
        while (!stopRequested() &&!done) {
            //do something
        }
    }
    public synchronized void requestStop() {
        stopRequested = true;
    }
    private synchronized boolean stopRequested() {
        return stopRequested; }
}
