package stratage.myClass;

import stratage.myInterface.IActivity;

public class Student {
    private IActivity activity;

    public void setActivity(IActivity activity) {
        this.activity = activity;
    }

    public void getActivity() {
        activity.runActivity();
    }
}
