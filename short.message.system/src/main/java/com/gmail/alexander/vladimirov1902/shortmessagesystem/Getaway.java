package com.gmail.alexander.vladimirov1902.shortmessagesystem;

/**
 * @author alexandervladimirov1902@gmail.com
 *         (Alexander Vladimirov)
 *         This is simple Getaway main reason is to practice Test-driven development.
 */
class Getaway {
  private final Sender sender;
  private final SMSValidator validator;

  public Getaway(Sender sender, SMSValidator validator) {
    this.sender = sender;
    this.validator = validator;
  }

  /**
   * Send Message to the destination.
   * @param shortMessage that is going to be send.
   * @return true when passes validation and has been send to destination.
   * @throws GatewayNotReachableException is thrown when Gateway has a problem with the message.
   */
  public boolean send(ShortMessage shortMessage) throws GatewayNotReachableException {
    if (validator.checkIsValidMessage(shortMessage)) {

      sender.send(shortMessage);
      return true;
    }
    return false;
  }
}
