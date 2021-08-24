package sfl.knosharing.ajabsandal.notification.strategy.decorator;

import sfl.knosharing.ajabsandal.notification.SendNotificationRequest;
import sfl.knosharing.ajabsandal.notification.strategy.SendNotificationStrategy;

public class SendEmailNotificationStrategyEventStoringDecorator
    extends SendNotificationStrategyEventStoringDecoratorTemplate {

  public SendEmailNotificationStrategyEventStoringDecorator(
      final SendNotificationStrategy delegate) {
    super(delegate);
  }

  @Override
  public void doSend(SendNotificationRequest request) {
    System.out.println("Saving Email notification report info in DB");
  }
}
