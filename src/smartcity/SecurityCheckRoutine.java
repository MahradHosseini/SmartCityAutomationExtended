package smartcity;

// Concrete Class for security check routine
public class SecurityCheckRoutine extends DailyRoutine{
    protected void startRoutine() {
        System.out.println("Security check routine started");
    }
    protected void executeCoreTask(){
        System.out.println("Performing security checks around the city...");
    }

    protected void endRoutine() {
        System.out.println("Security check routine ended");
    }
}
