package sfl.knosharing.ajabsandal.notification.strategy;

import sfl.knosharing.ajabsandal.notification.SendNotificationRequest;

public class SendEmailNotificationStrategy extends SendNotificationStrategyTemplate {

  @Override
  public void doSend(SendNotificationRequest request) {
    // validate recipient against the email regexp
    // send the actual email notification using third-party library
    System.out.println("Successfully sent an email notification");
  }
}
