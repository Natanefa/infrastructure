package Infrastructure;

import Infrastructure.logging.AbstractLogger;
import Infrastructure.logging.FileTestLogger;
import Infrastructure.logging.STDTestLogger;

public class TestBase {
    private WebDriverManager wdm;
    protected AbstractLogger logger;
    protected TestServer server;
    private String browser;

    public void setup() {
        wdm = new DefaultWebDriverManager();
        logger = getLogger();
        browser = wdm.getBrowser();
        server = new TestServer();
        String url = server.getUrl();
        logger.log(url);
        logger.log(browser);
        beforeTest();

    }

    public void tearDown() {
        wdm.destroyBrowser(browser);
        afterTest();
    }

    public void beforeTest() {
        logger.atStart();
    }

    public void afterTest() {
        logger.atFinish();
    }

    public AbstractLogger getLogger() {
        return ConfigurationManager.getInstance().getCurrentEnvironment().equals("local") ? new STDTestLogger() : new FileTestLogger();

    }


}
