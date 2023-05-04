package constConfig;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config config = readConfig();

    static Config readConfig(){
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ?ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                :ConfigFactory.load("application");
    }
    String  URL = readConfig().getString("url");
    String  LOGIN = readConfig().getString("userParams.admin.login");
    String  PASSWORD = readConfig().getString("userParams.admin.password");
}
