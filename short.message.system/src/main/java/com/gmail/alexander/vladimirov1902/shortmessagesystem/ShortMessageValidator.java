package com.gmail.alexander.vladimirov1902.shortmessagesystem;

/**
 * @author alexandervladimirov1902@gmail.com
 *         (Alexander Vladimirov)
 *         This concrete implementation of SMSValidator validates message that is trying to be send.
 */
class ShortMessageValidator implements SMSValidator  {
  /**
   * Check if all parts of the message are valid.
   * @param shortMessage tested message before send.
   * @return true when all of the parts of the message are valid.
   */
  @Override
  public boolean checkIsValidMessage(ShortMessage shortMessage) {
    if (isEmpty(shortMessage)) {
      return false;
    }
    if (checkConsistencyOfRecipient(shortMessage)) {
      return false;
    }
    if (titleAndContentExceeded(shortMessage)) {
      return false;
    }
    return true;
  }

  /**
   * Checks if title and content Exceeds length.
   * @param shortMessage tested message.
   * @return true if title and content are under number of characters.
   */
  private boolean titleAndContentExceeded(ShortMessage shortMessage) {
    if (shortMessage.getTitle().length() > 50) {
      return true;
    }
    if (shortMessage.getContent().length() > 120) {
      return true;
    }
    return false;
  }

  /**
   * Check if the number of recipient is consistent.
   * @param shortMessage tested message.
   * @return true if number of the recipient is valid.
   */
  private boolean checkConsistencyOfRecipient(ShortMessage shortMessage) {
    if (!shortMessage.getRecipient().startsWith("08")) {
      return true;
    }
    if (!shortMessage.getRecipient().matches("[0-9]+")) {
      return true;
    }
    if (shortMessage.getRecipient().length() < 10 || shortMessage.getRecipient().length() > 10) {
      return true;
    }
    return false;

  }

  /**
   * Test if any of the parts of the message are empty.
   * @param shortMessage tested message.
   * @return true if any of the field are empty.
   */
  private boolean isEmpty(ShortMessage shortMessage) {
    return shortMessage.getTitle().isEmpty() || shortMessage.getContent().isEmpty() || shortMessage.getRecipient().isEmpty();
  }
}
