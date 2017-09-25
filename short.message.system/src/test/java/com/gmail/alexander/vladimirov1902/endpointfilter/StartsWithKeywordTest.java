package com.gmail.alexander.vladimirov1902.endpointfilter;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;


/**
 * @author alexandervladimirov1902@gmail.com
 * (Alexander Vladimirov)
 */
public class StartsWithKeywordTest extends EndpointFilterTest {

    @Test
    public void endPointIsMatching() throws EmptyURLExceptions, EmptyKeywordException {
        StartsWithKeyword startsWithKeyword = new StartsWithKeyword("Start");
        assertTrue(startsWithKeyword.matches("Start with"));
    }

    @Test(expected = EmptyURLExceptions.class)
    public void emptyUrl() throws EmptyURLExceptions, EmptyKeywordException {
        StartsWithKeyword startsWithKeyword = new StartsWithKeyword("Start");
        startsWithKeyword.matches("");
    }

    @Test
    public void endPointDoesNotMatch() throws EmptyURLExceptions, EmptyKeywordException {
        StartsWithKeyword startsWithKeyword = new StartsWithKeyword("StartKeyWord");

        assertFalse(startsWithKeyword.matches("SomeUrl"));
    }

    @Test(expected = EmptyKeywordException.class)
    public void emptyEndPoint() throws EmptyURLExceptions, EmptyKeywordException {
        StartsWithKeyword startsWithKeyword = new StartsWithKeyword("");
        startsWithKeyword.matches("SomeUrl");
    }
}
