package sfl.knosharing.ajabsandal.notification.strategy;

import java.util.EnumMap;
import java.util.Map;
import sfl.knosharing.ajabsandal.notification.NotificationType;
import sfl.knosharing.ajabsandal.notification.strategy.decorator.SendEmailNotificationStrategyEventStoringDecorator;
import sfl.knosharing.ajabsandal.notification.strategy.decorator.SendEmailNotificationStrategyLogProducerDecorator;
import sfl.knosharing.ajabsandal.notification.strategy.decorator.SendPushNotificationStrategyEventStoringDecorator;
import sfl.knosharing.ajabsandal.notification.strategy.decorator.SendSmsNotificationStrategyEventStoringDecorator;

public class SendNotificationStrategyFactory {

  private final Map<NotificationType, SendNotificationStrategy> strategyMap;

  public SendNotificationStrategyFactory() {
    this.strategyMap = new EnumMap<>(NotificationType.class);
    this.strategyMap.put(
        NotificationType.EMAIL,
        new SendEmailNotificationStrategyLogProducerDecorator(
            new SendEmailNotificationStrategyEventStoringDecorator(
                new SendEmailNotificationStrategy())));
    this.strategyMap.put(
        NotificationType.SMS,
        new SendSmsNotificationStrategyEventStoringDecorator(new SendSmsNotificationStrategy()));
    this.strategyMap.put(
        NotificationType.PUSH,
        new SendPushNotificationStrategyEventStoringDecorator(new SendPushNotificationStrategy()));
  }

  public SendNotificationStrategy get(final NotificationType type) {
    return this.strategyMap.get(type);
  }
}
