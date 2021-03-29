package vn.vincent.assertion;

import org.assertj.core.api.BooleanAssert;
import org.assertj.core.api.SoftAssertions;


public class AssertJSoftAssert extends SoftAssertions implements AssertJSoftAssertion {

    private void checkFailure(BooleanAssert assertion, String onFailureMsg) {
        if(!wasSuccess()) {
            onFailure(assertion, onFailureMsg);
        }
    }

    private void onFailure(BooleanAssert assertion, String onFailureMsg) {
        assertion.overridingErrorMessage(onFailureMsg);
    }

    public BooleanAssert assertThat(boolean actual, String onFailureMsg) {
        BooleanAssert assertion = super.assertThat(actual);

        checkFailure(assertion, onFailureMsg);
        return assertion;
    }

    public synchronized void assertAll() {
        super.assertAll();
    }
}
