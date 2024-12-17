package smartcity;

// Template Pattern

// Abstract Class
public abstract class DailyRoutine {
    public final void performRoutine(){
        startRoutine();
        executeCoreTask();
        endRoutine();
    }

    protected abstract void startRoutine();

    protected abstract void executeCoreTask();

    protected abstract void endRoutine();
}

