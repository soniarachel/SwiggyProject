package com.swiggyTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class Configuration {
    final static String PROJECT_PROPERTY_FILE="Project.properties";

static Properties properties=null;

    static void loadProperty() throws Throwable {
        if(properties==null){
            properties=new Properties();

        String profilepath=System.getProperty("user.dir")+"/src/test/resources/"+PROJECT_PROPERTY_FILE;
        File file=new File(profilepath);
        System.out.println(file.exists());
       InputStream ins =new FileInputStream(profilepath);
        properties.load(ins);
    }
    }
public static String getProperty(String name) throws Throwable{
        loadProperty();
        return properties.getProperty(name);
}

}
