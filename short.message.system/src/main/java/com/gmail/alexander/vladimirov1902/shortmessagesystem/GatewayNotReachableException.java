package com.gmail.alexander.vladimirov1902.shortmessagesystem;

/**
 * @author alexandervladimirov1902@gmail.com
 *         (Alexander Vladimirov)
 *         This custom exception class is thown when the gateway does not respond for any reason.
 */
class GatewayNotReachableException extends Exception {
  public GatewayNotReachableException() {
    super();
  }
}
