package sfl.knosharing.ajabsandal.notification.strategy.decorator;

import sfl.knosharing.ajabsandal.notification.SendNotificationRequest;
import sfl.knosharing.ajabsandal.notification.strategy.SendPushNotificationStrategy;

public class SendPushNotificationStrategyEventStoringDecorator
    extends SendNotificationStrategyEventStoringDecoratorTemplate {

  public SendPushNotificationStrategyEventStoringDecorator(
      final SendPushNotificationStrategy delegate) {
    super(delegate);
  }

  @Override
  public void doSend(SendNotificationRequest request) {
    System.out.println("Saving Push notification report info in DB");
  }
}
