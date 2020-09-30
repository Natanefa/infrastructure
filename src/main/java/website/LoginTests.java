package website;

import Infrastructure.TestBase;

public class LoginTests extends AuthFlowBaseTest {
    @Override
    public void beforeTest(){
        beforeAuth();
        logger.log("fill login");

    }

    public void loginTest(){
        logger.log("fill password");
        logger.log("submit login form");
        logger.log("check is login in");
    }

    public void loginTestNegative(){
        logger.log("submit login form");
        logger.log("check error visible");
    }
}
