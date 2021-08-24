package sfl.knosharing.ajabsandal.notification.strategy.decorator;

import sfl.knosharing.ajabsandal.notification.strategy.SendNotificationStrategy;

public abstract class BaseSendNotificationStrategyDecorator
    implements SendNotificationStrategyDecorator {

  protected final SendNotificationStrategy delegate;

  public BaseSendNotificationStrategyDecorator(final SendNotificationStrategy delegate) {
    this.delegate = delegate;
  }
}
