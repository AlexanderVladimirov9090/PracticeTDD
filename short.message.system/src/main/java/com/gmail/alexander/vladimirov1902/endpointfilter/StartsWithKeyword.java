package com.gmail.alexander.vladimirov1902.endpointfilter;

/**
 * @author alexandervladimirov1902@gmail.com
 * (Alexander Vladimirov)
 * Concrete implementation of Endpoint interface.
 */
class StartsWithKeyword implements Endpoint {
    private final String keyWord;

    public StartsWithKeyword(String keyWord) {
        this.keyWord = keyWord;
    }

    /**
     * Used to check if string matches the url.
     * @param url that is checked.
     * @return true if matches any url.
     * @throws EmptyURLExceptions if empty string is given throw this exception.
     * @throws EmptyKeywordException if empty keyword is given throw this exception.
     */
    @Override
    public boolean matches(String url) throws EmptyURLExceptions, EmptyKeywordException {

        if (url.isEmpty()) {
            throw new EmptyURLExceptions();
        }

        if (keyWord.isEmpty()) {
            throw new EmptyKeywordException();
        }

        return url.startsWith(keyWord);
    }
}
