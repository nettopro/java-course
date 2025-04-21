package app.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Logger.
 */
public final class Logger {

    private Logger() {
    }

    /**
     * Shows the message.
     *
     * @param msg Shown message
     */
    public static void info(String msg) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("[INFO] " + sdf.format(new Date()) + " - " + msg);
    }
}
