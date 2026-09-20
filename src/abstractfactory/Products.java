package abstractfactory;

interface NotificationMessage {
    String format(String text);
}
interface NotificationSender {
    void deliver(String text);
}
class BasicMessage implements NotificationMessage {
    public String format(String text) {
        return "[Basic] " + text;
    }
}

class BasicSender implements NotificationSender {
    public void deliver(String text) {
        System.out.println("Email: " + text);
    }
}
class PremiumMessage implements NotificationMessage {
    public String format(String text) {
        return "[Premium] " + text;
    }
}

class PremiumSender implements NotificationSender {
    public void deliver(String text) {
        System.out.println("Push + SMS: " + text);
    }
}
