package factorymethod;
interface Notification {
    void send(String message);
}
class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}
class SmsNotification implements Notification {
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}
