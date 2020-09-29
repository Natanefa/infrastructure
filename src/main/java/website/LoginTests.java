package website;

import Infrastructure.TestBase;

public class LoginTests extends AuthFlowBaseTest {
    public void loginTest(){
        beforeAuth();
        logger.log("fill login");
        logger.log("fill password");
        logger.log("submit login form");
        logger.log("check is login in");
    }
}
