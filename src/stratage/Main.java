package stratage;

import stratage.myClass.Eat;
import stratage.myClass.Sleep;
import stratage.myClass.Student;
import stratage.myClass.Study;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();

        student.setActivity(new Sleep());
        student.getActivity();

        student.setActivity(new Eat());
        student.getActivity();

        student.setActivity(new Study());
        student.getActivity();

    }
}
