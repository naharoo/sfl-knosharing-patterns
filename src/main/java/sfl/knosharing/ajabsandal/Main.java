package sfl.knosharing.ajabsandal;

import sfl.knosharing.ajabsandal.notification.NotificationSender;
import sfl.knosharing.ajabsandal.notification.NotificationType;
import sfl.knosharing.ajabsandal.notification.SendNotificationRequest;

public class Main {

  private static final NotificationSender NOTIFICATION_SENDER = new NotificationSender();

  public static void main(final String... args) {
    // performing card-to-card transfer

    final SendNotificationRequest emailNotificationRequest =
        new SendNotificationRequest(
            NotificationType.EMAIL,
            "narek@sfl.am",
            "Money Transfer",
            "A new money transfer has been done");
    NOTIFICATION_SENDER.send(emailNotificationRequest);

    final SendNotificationRequest smsNotificationRequest =
        new SendNotificationRequest(
            NotificationType.SMS,
            "+37499999999",
            "Money Transfer",
            "A new money transfer has been done");
    NOTIFICATION_SENDER.send(smsNotificationRequest);

    final SendNotificationRequest pushNotificationRequest =
        new SendNotificationRequest(
            NotificationType.PUSH,
            "119292301238",
            "Money Transfer",
            "A new money transfer has been done");
    NOTIFICATION_SENDER.send(pushNotificationRequest);
  }
}

/*
1. Send Email notification
2. I want to be able to send also SMS notifications
3. PUSH
4. Implement reporting
 */
