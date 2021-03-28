package vn.vincent.assertion;

import org.assertj.core.api.BooleanAssert;
import org.assertj.core.api.SoftAssertions;


public class AssertJSoftAssert extends SoftAssertions implements AssertJSoftAssertion {

    private void checkFailure(String onFailureMsg) {
        if(!wasSuccess()) {
            onFailure(onFailureMsg);
        }
    }

    private void onFailure(String onFailureMsg) {
        System.out.println(onFailureMsg);
    }

    public BooleanAssert assertThat(boolean actual, String onFailureMsg) {
        BooleanAssert assertion = super.assertThat(actual);

        checkFailure(onFailureMsg);
        return assertion;
    }

    public synchronized void assertAll() {
        super.assertAll();
    }
}
