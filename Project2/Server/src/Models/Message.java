package Models;

import java.io.Serializable;

public class Message implements Serializable {
    Boolean check ;
    String message;

    public Message(){
        super();
    }

    public Message(Boolean check, String message) {
        this.check = check;
        this.message = message;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "check=" + check +
                ", message='" + message + '\'' +
                '}';
    }
}
