package sfl.knosharing.ajabsandal.notification.strategy.decorator;

import sfl.knosharing.ajabsandal.notification.SendNotificationRequest;
import sfl.knosharing.ajabsandal.notification.strategy.SendSmsNotificationStrategy;

public class SendSmsNotificationStrategyEventStoringDecorator
    extends SendNotificationStrategyEventStoringDecoratorTemplate {

  public SendSmsNotificationStrategyEventStoringDecorator(
      final SendSmsNotificationStrategy delegate) {
    super(delegate);
  }

  @Override
  public void doSend(SendNotificationRequest request) {
    System.out.println("Saving Sms notification report info in DB");
  }
}
