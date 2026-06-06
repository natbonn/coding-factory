package gr.aueb.cf.ch15.interfaces;

public class StudentSerivceImpl implements ISchoolService {

    @Override
    public void register() {
        System.out.println("Student registered!");
    }

    @Override
    public void unregister() {
        System.out.println("Student unregistered!");
    }
}
