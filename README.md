# Notification — Factory Method & Abstract Factory

## Part A — Factory Method (`factorymethod`)
- `Notification` — Product
- `EmailNotification`, `SmsNotification` — Concrete Products
- `NotificationCreator` — Creator
- `EmailNotificationCreator`, `SmsNotificationCreator` — Concrete Creators

## Part B — Abstract Factory (`abstractfactory`)
- `NotificationMessage`, `NotificationSender` — Abstract Products
- Basic / Premium classes — Concrete Products
- `NotificationFactory` — Abstract Factory
- `BasicNotificationFactory`, `PremiumNotificationFactory` — Concrete Factories
- `NotificationService` — Client

# Clean Code — 5 Principles

1. **Clear Names** — `NotificationCreator`, `createNotification`, `NotificationFactory` instead of `Manager`/`Helper`.

2. **Small Methods** — `NotificationService.send()` only calls `format()` and `deliver()`, it doesn't format or send anything itself.

3. **Small, Focused Classes** — each class is responsible for one thing (one product / one creator / one factory).

4. **Validation on Creation** — `NotificationCreator.notify()`:
```java
// was
void notify(String message) {
createNotification().send(message);
}

// became
void notify(String message) {
if (message == null || message.isEmpty()) {
throw new IllegalArgumentException("message cannot be empty");
}
createNotification().send(message);
}
```

5. **No magic strings** — the `"[Basic] "` / `"[Premium] "` prefixes are moved to the `format()` methods of specific classes, rather than scattered throughout the code.
