package mediator.MInterface;

import mediator.myClass.User;

public interface ChatMediator {
    public void sendMessage(String msg, User user);

    void addUser(User user);
}
