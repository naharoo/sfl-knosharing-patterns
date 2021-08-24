package sfl.knosharing.ajabsandal.notification.strategy;

import sfl.knosharing.ajabsandal.notification.SendNotificationRequest;

public class SendPushNotificationStrategy extends
    SendNotificationStrategyTemplate {

  @Override
  protected void doSend(SendNotificationRequest request) {
    // validate recipient against the push notif. id regexp
    // send the actual push notification using third-party library
    System.out.println("Successfully sent a push notification");
  }
}
