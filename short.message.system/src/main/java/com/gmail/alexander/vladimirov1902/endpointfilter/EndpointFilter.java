package com.gmail.alexander.vladimirov1902.endpointfilter;

/**
 * @author alexandervladimirov1902@gmail.com
 * (Alexander Vladimirov)
 * This class is used to iterate urls in Endpoint and  calls matches if url is there.
 */
public class EndpointFilter {
    private final Endpoint[] endpoints;


    public EndpointFilter(Endpoint... endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * Iterates trough all urls in Endpoint and find a match if exists.
     * @param url string that is passed for testis if exists a match.
     * @return true if match is found.
     * @throws EmptyURLExceptions used for empty url.
     * @throws EmptyKeywordException used for empty keyword.
     */
    public boolean shouldFilter(String url) throws EmptyURLExceptions, EmptyKeywordException {
        for (Endpoint each : endpoints) {
            if (each.matches(url)) {
                return true;
            }
        }
        return false;
    }
}
