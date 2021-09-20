package taller1.punto3;

/**
 *
 * @author Marco Contreras
 */
public class MyThread  implements Runnable{
    
    long ini,fin, dif = 0;
    private int theCounter= 0;
    private Thread theThread = null;
    private int theID = 0;
    private OnChange theDelegate = null;
    
    public MyThread(int newID, MyThread.OnChange newDelegate){
        theID = newID;
        theDelegate = newDelegate;
        
    }
    
    public Thread start(){
        if (getTheThread() == null) {
            theThread = new Thread(this);
            getTheThread().start();
        }
        return getTheThread();
    }
    
    @Override
    public void run() {
        
        for (int i = 0; i < 5000; i++) {
            theCounter++;
            if (theDelegate != null) {
               theDelegate.show(theID,theCounter);
            }
        }
    }
    public interface OnChange{
        public abstract void show(int id, int value);
    }
    /**
     * @return the theID
     */
    public int getTheID() {
        return theID;
    }
    /**
     * @return the theThread
     */
    public Thread getTheThread() {
        return theThread;
    }
}