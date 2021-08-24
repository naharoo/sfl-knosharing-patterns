package sfl.knosharing.ajabsandal.notification.strategy;

import sfl.knosharing.ajabsandal.notification.SendNotificationRequest;

public abstract class SendNotificationStrategyTemplate implements
    SendNotificationStrategy {

  @Override
  public final void send(SendNotificationRequest request) {
    validateRequest(request);
    doSend(request);
  }

  protected abstract void doSend(SendNotificationRequest request);

  private void validateRequest(final SendNotificationRequest request) {
    if (request == null
        || request.getContent() == null
        || request.getTitle() == null
        || request.getRecipient() == null) {
      throw new IllegalArgumentException("Bad Request");
    }
  }
}
