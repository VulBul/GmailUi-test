package org.example.misc;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Rear {
    private static Properties properties;

    static {

        properties = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/resources/configResp.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static String getUrl() {

        return properties.getProperty("url");
    }

    public static String getLogin() {

        return properties.getProperty("login");
    }

    public static String getPass() {

        return properties.getProperty("password");
    }

//      static Reader readConfig() {
//          BufferedReader reader = null;
//          try (reader = new BufferedReader(new FileReader("src/main/resources/configResp.properties"))) {
//          } catch (IOException e) {
//              throw new RuntimeException(e);
//          }
//          Properties prop = new Properties()
//      }


}
