package sfl.knosharing.ajabsandal.notification;

import sfl.knosharing.ajabsandal.notification.strategy.SendNotificationStrategy;
import sfl.knosharing.ajabsandal.notification.strategy.SendNotificationStrategyFactory;

public class NotificationSender {

  private final SendNotificationStrategyFactory sendNotificationStrategyFactory =
      new SendNotificationStrategyFactory();

  public void send(final SendNotificationRequest request) {
    final SendNotificationStrategy sendNotificationStrategy =
        sendNotificationStrategyFactory.get(request.getType());
    sendNotificationStrategy.send(request);
  }
}
