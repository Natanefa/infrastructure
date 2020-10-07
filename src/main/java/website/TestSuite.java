package website;

import Infrastructure.TestURL;
import Infrastructure.TestURL.Builder;

public class TestSuite {
    public static void main(String[] args) {
        LoginTests test1 = new LoginTests();
        test1.setup();
        test1.loginTest();
        test1.tearDown();

        test1.setup();
        test1.loginTestNegative();
        test1.tearDown();

        RegistrationTest test2 = new RegistrationTest();
        test2.setup();
        test2.registrationTestNegative();
        test2.tearDown();

        test2.setup();
        test2.registrationTestPositive();
        test2.tearDown();

    }


}
