package Related_Class;

public class StopWatch {
    //Data field
    private long startTime;
    private long endTime;

    //Constructor
    public StopWatch(){
        startTime = System.currentTimeMillis();
    }

    //Methods
    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public float getElapsedTime() {
        return endTime - startTime;
    }
}
