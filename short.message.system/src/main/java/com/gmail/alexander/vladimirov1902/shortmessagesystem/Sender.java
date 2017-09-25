package com.gmail.alexander.vladimirov1902.shortmessagesystem;

/**
 * @author alexandervladimirov1902@gmail.com
 *         (Alexander Vladimirov)
 *         The interface is used to send message to the destination.
 */
interface Sender {
  /**
   * Sends message to the destination.
   * @param shortMessage that is going to be send.
   * @return true if the message is send without a problem.
   * @throws GatewayNotReachableException is thrown if Gateway has any kind of problem.
   */
  boolean send(ShortMessage shortMessage) throws GatewayNotReachableException;
}
