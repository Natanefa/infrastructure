package website;

import Infrastructure.TestBase;
public class RegistrationTest extends AuthFlowBaseTest {
    public void beforeTest(){
        beforeAuth();
        logger.log("switch to registration page");
        logger.log("fill login");
        logger.log("fill password");
    }


        public void registrationTestPositive(){
            logger.log("confirm password");
            logger.log("submit registration form");
            logger.log("check is registration in");
        }

    public void registrationTestNegative(){
        logger.log("submit registration form");
        logger.log("check is error visible");
    }
    }

