package website;

import Infrastructure.TestBase;
public class RegistrationTest extends AuthFlowBaseTest {
        public void registrationTest(){
            beforeAuth();
            logger.log("switch to registration page");
            logger.log("fill login");
            logger.log("fill password");
            logger.log("confirm password");
            logger.log("submit registration form");
            logger.log("check is registration in");
        }
    }

