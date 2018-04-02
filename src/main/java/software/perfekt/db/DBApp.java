package software.perfekt.db;

import liquibase.integration.commandline.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.Properties;

public class DBApp{

    private static final Logger LOGGER = LoggerFactory.getLogger("UPDATE DB");

    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();

        try (InputStream fis = ClassLoader.getSystemClassLoader().getResourceAsStream("app.prop");){

            properties.load(fis);

            LOGGER.info("Update DB");
            final String url = properties.getProperty("db.url");
            final String username = properties.getProperty("db.username");
            final String password = properties.getProperty("db.password");
            if(url == null )
                LOGGER.debug("Host " + url);
            LOGGER.debug("username " + username);
            LOGGER.debug("run liquibase");
            Main.run(new String[]{
                    "--logLevel=debug",
                    "--url=" + url,
                    "--driver=org.postgresql.Driver",
                    "--username=" + username,
                    "--password=" + password,
                    "--currentDateTimeFunction=CURRENT_TIMESTAMP(3)",
                    "--changeLogFile=init/db.xml",
                    "update"
            });
            LOGGER.debug("run liquibase - done");
        }catch (Exception e){
            LOGGER.info("error update DB");
            LOGGER.error("error",e);
        }
    }
}