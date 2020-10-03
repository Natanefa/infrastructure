package Infrastructure;

public interface WebDriverManager {
    String getBrowser();
    void destroyBrowser(String browser);

}
