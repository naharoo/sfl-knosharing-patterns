package sfl.knosharing.ajabsandal.notification;

public class SendNotificationRequest {
  private final NotificationType type;
  private final String recipient;
  private final String title;
  private final String content;

  public SendNotificationRequest(
      final NotificationType type,
      final String recipient,
      final String title,
      final String content) {
    this.type = type;
    this.recipient = recipient;
    this.title = title;
    this.content = content;
  }

  public NotificationType getType() {
    return type;
  }

  public String getRecipient() {
    return recipient;
  }

  public String getTitle() {
    return title;
  }

  public String getContent() {
    return content;
  }
}
