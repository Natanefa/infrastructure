package website;

import Infrastructure.TestBase;

public class RestAuthBaseTest extends TestBase {
    @Override
    public void beforeTest(){
        logger.log("rest auth");
        logger.log("refresh browser");
    }
}
