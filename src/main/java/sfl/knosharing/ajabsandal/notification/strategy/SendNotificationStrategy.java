package sfl.knosharing.ajabsandal.notification.strategy;

import sfl.knosharing.ajabsandal.notification.SendNotificationRequest;

public interface SendNotificationStrategy {
  void send(final SendNotificationRequest request);
}
