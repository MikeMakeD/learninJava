package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Боб");
        User user2 = new User("Сем");
        User user3 = new User("Джон");

        user1.sendMessage(user2,"Привет, Сем");
        user1.sendMessage(user2,"Как твои дела?");
        user2.sendMessage(user1,"Првиет, Боб");
        user2.sendMessage(user1,"У меня все хорошо!");
        user2.sendMessage(user1,"Как твои дела?");
        user3.sendMessage(user1,"Привет, Боб!");
        user3.sendMessage(user1,"Как твои дела?");
        user3.sendMessage(user1,"Как твое здоровье?");
        user1.sendMessage(user3,"Привет, Джон");
        user1.sendMessage(user3,"У меня все отлично");
        user1.sendMessage(user3,"Как твои дела?");
        user3.sendMessage(user1,"У меня тоже все отлично");

        MessageDatabase.showDialog(user1,user3);

    }
}
