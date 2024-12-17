package smartcity;

// Concrete Class for lighting routine
public class LightingRoutine extends DailyRoutine{
    protected void startRoutine() {
        System.out.println("Lighting Routine Started");
    }

    protected void executeCoreTask(){
        System.out.println("Turning on/off street lights as per schedule...");
    }

    protected void endRoutine() {
        System.out.println("Lighting Routine Ended");
    }
}
