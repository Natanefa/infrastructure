package website;

import Infrastructure.TestBase;

public class AuthFlowBaseTest extends TestBase {
    public void beforeTest() {
        logger.atStart();
        logger.log("open home page");
        logger.log("open login page");
    }
}
