package sfl.knosharing.ajabsandal.notification.strategy.decorator;

import sfl.knosharing.ajabsandal.notification.SendNotificationRequest;
import sfl.knosharing.ajabsandal.notification.strategy.SendNotificationStrategy;

public abstract class SendNotificationStrategyEventStoringDecoratorTemplate
    extends BaseSendNotificationStrategyDecorator {

  protected SendNotificationStrategyEventStoringDecoratorTemplate(
      final SendNotificationStrategy delegate) {
    super(delegate);
  }

  @Override
  public final void send(final SendNotificationRequest request) {
    delegate.send(request);
    // save reporting info in DB
    doSend(request);
  }

  protected abstract void doSend(final SendNotificationRequest request);
}
