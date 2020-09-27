package Infrastructure;

public class ConfigurationManager {
    private static ConfigurationManager instanse;
    private ConfigurationManager () {
    }
        public static ConfigurationManager getInstance () {
            if (instanse == null) {
                instanse = new ConfigurationManager();
            }
            return instanse;

        }

        public String getEnvironmentVariebleDefault(String enVar, String defaultValue){
        String currentVarValue = System.getenv(enVar);
        return currentVarValue == null || currentVarValue.isEmpty() ?
        defaultValue : currentVarValue;
        }

        public  String getTestbrowser(){
            return getEnvironmentVariebleDefault("browser", "Chrome");

        }

        public  String getTestEnvironment(){
             return getEnvironmentVariebleDefault("environment", "QA_environment");

    }





}
