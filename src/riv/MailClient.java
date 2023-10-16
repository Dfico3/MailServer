package riv;

import java.util.ArrayList;
import java.util.List;

public class MailClient {
    private String username;
    private MailServer server;
    private List<MailItem> inbox;

    public MailClient(String username, MailServer server) {
        this.username = username;
        this.server = server;
        inbox = new ArrayList<>();
    }

    public void sendMailItem(String recipient, String message) {
        MailItem mailItem = new MailItem(username, recipient, message);
        server.receiveMail(mailItem);
    }

    public void checkInbox() {
        // Implement code to check inbox (not specified in the question)
    }
    
    public String getClientName() {
        return username;
    }
}
