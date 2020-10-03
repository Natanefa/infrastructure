package Infrastructure;

public class LocalWebDriverFactory implements WebDriverFactory {
       public String create() {
        String testBrowser = ConfigurationManager.getInstance().getTestbrowser();
        switch (testBrowser) {
            case "chrome":
                return "local new chrome driver";
            case "firefox":
                return "local new firefox driver";
            default:
                return "";
        }


    }
}
