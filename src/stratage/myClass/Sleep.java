package stratage.myClass;

import stratage.myInterface.IActivity;

public class Sleep implements IActivity {
    @Override
    public void runActivity() {
        System.out.println("Sleeping...");
    }
}
