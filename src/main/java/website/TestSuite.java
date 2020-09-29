package website;

public class TestSuite {
    public static void main(String[] args) {
        LoginTests test1 = new LoginTests();
        test1.setup();
        test1.LoginTests();
        test1.tearDown();

        RegistrationTest test2 = new RegistrationTest();
        test2.setup();
        test2.registrationTest();
        test2.tearDown();

    }
}
