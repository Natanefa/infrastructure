package Infrastructure;

public class TestURLApp {
    public static void main(String[] args) {
        new TestURL.Builder().withProtocol("https://")
                .withDomain("google.com.ua")
                .withPort("80")
                .withPath("/search")
                .withParams("test")
                .build();
    }
}
