package Infrastructure;

import Infrastructure.logging.STDTimeLogger;

public class TestBase {
    private WebDriverManager wdm;
    protected TestServer server;
    protected STDTimeLogger logger;

    private String browser;

    public void setup(){


        wdm = new WebDriverManager();
        logger = new STDTimeLogger();
        browser = wdm.createBrowser();
        server = new TestServer();
        String url = server.getUrl();
        logger.log(url);
        logger.log(browser);

        beforeTest();

    }

    public void tearDown(){
        wdm.destroyBrowser(browser);
    }


}
