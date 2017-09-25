package com.gmail.alexander.vladimirov1902.endpointfilter;

/**
 * @author alexandervladimirov1902@gmail.com
 * (Alexander Vladimirov)
 * This interface is used to check if url is mached with the given string.
 */
public interface Endpoint {
    /**
     * Used to check if string matches the url.
     * @param url that is checked.
     * @return true if matches any url.
     * @throws EmptyURLExceptions if empty string is given throw this exception.
     * @throws EmptyKeywordException if empty keyword is given throw this exception.
     */
    boolean matches(String url) throws EmptyURLExceptions, EmptyKeywordException;
}
