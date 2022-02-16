package MyExceptions;

import Utils.Alerts;
import javafx.scene.control.Alert;

public class DbException extends RuntimeException{
    private static final long serialVersionUID=1L;
    
    public DbException(String msg, String msg2){
        super(msg);
        Alerts.alertMessage("Database Error", msg2, msg, Alert.AlertType.ERROR);
    }
    
}
