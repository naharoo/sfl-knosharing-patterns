package sfl.knosharing.ajabsandal.notification.strategy;

import sfl.knosharing.ajabsandal.notification.SendNotificationRequest;

public class SendSmsNotificationStrategy extends SendNotificationStrategyTemplate {

  @Override
  public void doSend(SendNotificationRequest request) {
    // validate recipient against the phone-number regexp
    // send the actual sms notification using third-party library
    System.out.println("Successfully sent sms notification");
  }
}
