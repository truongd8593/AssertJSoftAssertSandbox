package vn.vincent.assertion;

import org.assertj.core.api.BooleanAssert;

public interface AssertJSoftAssertion {

    BooleanAssert assertThat(boolean actual, String onFailureMsg);

    void assertAll();
}
