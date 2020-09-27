package Infrastructure;

public class TestServer {
    public String getUrl() {
        String testEnvironment = ConfigurationManager.getInstance().getTestEnvironment();

        switch (testEnvironment) {
            case "QA_env":
                return "https://test1.test.test";
            case "prod_env":
                return "https://test2.test.test";
            case "staging_env":
                return "https://test3.test.test";
            default:
                return "https";
        }


    }
}
