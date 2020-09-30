package Infrastructure;

public class WebDriverManager {
    public String createBrowser(){
        String testBrowser = ConfigurationManager.getInstance().getTestbrowser();
        switch (testBrowser){
            case "chrome": return "new chrome driver";
            case "firefox": return "new firefox driver";
            default: return "";
        }
    }

    public void destroyBrowser(String browser) {
        if (browser != null) {
            System.out.println("browser closed");
        }
    }

}
