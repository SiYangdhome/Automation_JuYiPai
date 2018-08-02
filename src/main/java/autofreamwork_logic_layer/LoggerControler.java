package autofreamwork_logic_layer;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoggerControler {

    public static Logger logger = null;
    public static LoggerControler logg = null;

    public static LoggerControler GetLoggerTest(Class<?> T){
        if (logger==null){
            Properties pros = new Properties();
            try {
                String path = System.getProperty("user.dir");
                String filepath = path + "/config/Log4j.properties";
                InputStream is = new FileInputStream(filepath);
                pros.load(is);
            }catch (IOException e){
                e.printStackTrace();
            }
            PropertyConfigurator.configure(pros);
            logger = Logger.getLogger(T);
            logg = new LoggerControler();
        }
        return logg;
    }

    public void info(Object msg){
        logger.info(msg);
    }

    public void debug(Object msg){
        logger.debug(msg);
    }

    public void error(Object msg){
        logger.error(msg);
    }

    public void warn(Object msg){
        logger.warn(msg);
    }
}