
public class MandatoryEntryException  extends Exception{
    private static String msg = "A temperature entry is required";

    public static String getMsg() {
        return msg;
    }
   

    public static void setMsg(String msg) {
        MandatoryEntryException.msg = msg;
    }

    public MandatoryEntryException() {
        super(msg);
    }

    public MandatoryEntryException(String message) {
        super(msg);
    }

    public MandatoryEntryException(String message, Throwable cause) {
        super(msg, cause);
    }

    public MandatoryEntryException(Throwable cause) {
        super(cause);
    }

    public MandatoryEntryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(msg, cause, enableSuppression, writableStackTrace);
    }
}
