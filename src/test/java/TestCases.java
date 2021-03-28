import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import vn.vincent.assertion.AssertJSoftAssert;
import vn.vincent.assertion.AssertJSoftAssertion;

import java.util.Arrays;
import java.util.List;

public class TestCases {
    private AssertJSoftAssertion softAssertions;
    private SoftAssertions assertJSoftAssertions;

    private List<String> actual;
    private List<String> expected;

    @BeforeClass
    public void testSetup() {
        softAssertions = new AssertJSoftAssert();
        assertJSoftAssertions = new SoftAssertions();
        actual = Arrays.asList("element2", "element2", "element3", "element4", "element4");
        expected = Arrays.asList("element1", "element2", "element3", "element4", "element5");
    }

    @Test
    public void testMyAssertThat() {
        // My AssertThat will provide some logging info, similar to Assert.assertTrue of junit
        softAssertions.assertThat(actual.size() == expected.size(), "Length of two string arrays is not equal").isTrue();

        for (int i = 0; i < expected.size(); i++) {
            softAssertions.assertThat(actual.get(i).equalsIgnoreCase(expected.get(i)), actual.get(i) + " is different from " + expected.get(i)).isTrue();
        }
    }

//    @Test
//    public void testAssertThat() {
//        // AssertJ's AssertThat
//        assertJSoftAssertions.assertThat(actual.size() == expected.size()).isTrue();
//
//        for (int i = 0; i < expected.size(); i++) {
//            assertJSoftAssertions.assertThat(actual.get(i).equalsIgnoreCase(expected.get(i))).isTrue();
//        }
//    }

    @AfterClass
    public void testTearDown() {
        softAssertions.assertAll();

        System.out.println("*************************************");

        assertJSoftAssertions.assertAll();
    }
}
