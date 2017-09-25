package com.gmail.alexander.vladimirov1902.shortmessagesystem;

/**
 * @author alexandervladimirov1902@gmail.com
 *         (Alexander Vladimirov)
 *         Used to validate short message before send to target.
 */
public interface SMSValidator {
  /**
   * Check if message is valid to be send.
   * @param shortMessage tested message before send.
   * @return true if the message is valid.
   */
  boolean checkIsValidMessage(ShortMessage shortMessage);
}
