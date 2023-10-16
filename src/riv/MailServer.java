package riv;
import java.util.ArrayList;
import java.util.List;

public class MailServer {
	private String serverName; // New field to store the server name
    private List<MailItem> inbox;

    public MailServer(String serverName) {
    	this.serverName = serverName;
        inbox = new ArrayList<>();
    }

    public void receiveMail(MailItem mailItem) {
        inbox.add(mailItem);
    }

    public List<MailItem> getInbox() {
        return inbox;
    }
}


