package sfl.knosharing.ajabsandal.notification.strategy.decorator;

import sfl.knosharing.ajabsandal.notification.SendNotificationRequest;
import sfl.knosharing.ajabsandal.notification.strategy.SendNotificationStrategy;

public class SendEmailNotificationStrategyLogProducerDecorator
    extends SendNotificationStrategyEventStoringDecoratorTemplate {

  public SendEmailNotificationStrategyLogProducerDecorator(
      final SendNotificationStrategy delegate) {
    super(delegate);
  }

  @Override
  public void doSend(SendNotificationRequest request) {
    System.out.println("Producing some logs regarding email notification");
  }
}
