package stratage.myClass;

import stratage.myInterface.IActivity;

public class Eat implements IActivity {
    @Override
    public void runActivity() {
        System.out.println("Eating...");
    }
}
