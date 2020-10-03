package Infrastructure;

public class RemoteWebDriverFactory implements WebDriverFactory {
       public String create() {
        String testBrowser = ConfigurationManager.getInstance().getTestbrowser();
        switch (testBrowser) {
            case "chrome":
                return "remote new chrome driver";
            case "firefox":
                return "remote new firefox driver";
            default:
                return "";
        }


    }
}
