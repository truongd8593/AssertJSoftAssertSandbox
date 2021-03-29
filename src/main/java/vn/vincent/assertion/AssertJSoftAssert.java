package vn.vincent.assertion;

import org.assertj.core.api.BooleanAssert;
import org.assertj.core.api.SoftAssertions;


public class AssertJSoftAssert extends SoftAssertions implements AssertJSoftAssertion {

    public BooleanAssert assertThat(boolean actual, String onFailureMsg) {
        BooleanAssert assertion = super.assertThat(actual).withFailMessage(onFailureMsg);

        return assertion;
    }

    public synchronized void assertAll() {
        super.assertAll();
    }
}
