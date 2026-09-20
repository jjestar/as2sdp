package factorymethod;
abstract class NotificationCreator {

    abstract Notification createNotification();

    void notify(String message) {
        if (message == null || message.isEmpty()) {
            throw new IllegalArgumentException("message cannot be empty");
        }
        Notification notification = createNotification();
        notification.send(message);
    }
}
class EmailNotificationCreator extends NotificationCreator {
    Notification createNotification() {
        return new EmailNotification();
    }
}
class SmsNotificationCreator extends NotificationCreator {
    Notification createNotification() {
        return new SmsNotification();
    }
}
