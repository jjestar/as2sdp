package abstractfactory;
class NotificationService {

    private final NotificationFactory factory;

    NotificationService(NotificationFactory factory) {
        this.factory = factory;
    }

    void send(String text) {
        NotificationMessage message = factory.createMessage();
        NotificationSender sender = factory.createSender();
        sender.deliver(message.format(text));
    }
}
