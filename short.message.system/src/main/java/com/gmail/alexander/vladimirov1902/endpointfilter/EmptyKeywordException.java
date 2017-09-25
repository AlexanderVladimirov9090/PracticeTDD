package com.gmail.alexander.vladimirov1902.endpointfilter;

/**
 * @author alexandervladimirov1902@gmail.com
 * (Alexander Vladimirov)
 * This custom exception class is used when StatsWithKeyword class is used and emprty string is given to it.
 */
public class EmptyKeywordException extends Exception {
    public EmptyKeywordException() {
        super();
    }
}
