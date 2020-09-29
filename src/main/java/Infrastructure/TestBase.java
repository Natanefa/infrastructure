package Infrastructure;

import Infrastructure.logging.STDTimeLogger;

public class TestBase {
    private WebDriverManager wdm;
    protected TestLogger logger;
    protected TestServer server;
    private String browser;

    public void setup(){
        wdm = new WebDriverManager();
        logger = new TestLogger();
        browser = wdm.createBrowser();
        server = new TestServer();
        String url = server.getUrl();
        logger.log();
        logger.log(browser);
        beforeTest();

      }

    public void tearDown(){
        wdm.destroyBrowser(browser);
    }


}
