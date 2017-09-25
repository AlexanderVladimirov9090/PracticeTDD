package com.gmail.alexander.vladimirov1902.endpointfilter;

/**
 * @author alexandervladimirov1902@gmail.com
 * (Alexander Vladimirov)
 */
public interface Endpoint {
    boolean matches(String url) throws EmptyURLExceptions, EmptyKeywordException;
}
