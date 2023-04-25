package stratage.myClass;

import stratage.myInterface.IActivity;

public class Study implements IActivity {
    @Override
    public void runActivity() {
        System.out.println("Study...");
    }
}
