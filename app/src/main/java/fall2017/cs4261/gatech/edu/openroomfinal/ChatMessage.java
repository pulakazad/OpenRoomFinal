package fall2017.cs4261.gatech.edu.openroomfinal;

import java.util.Date;

/**
 * Created by pulakazad on 2/6/18.
 * Modified by reidbarton
 */

public class ChatMessage {

    private String messageText;
    private String messageUser;
    private long messageTime;


    //Checking to see if it updates with this comment

    public ChatMessage(String messageText, String messageUser) {
        this.messageText = messageText;
        this.messageUser = messageUser;

        // Initialize to current time
        messageTime = new Date().getTime();
    }

    public ChatMessage(){

    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}