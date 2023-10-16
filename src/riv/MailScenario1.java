package riv;

import java.util.Scanner;

public class MailScenario1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for server name
        System.out.print("Enter server name: ");
        String serverName = scanner.nextLine();

        // Create the MailServer object with the user-provided server name
        MailServer mailServer = new MailServer(serverName);

        // Prompt the user for client names
        System.out.print("Enter sender's name: ");
        String senderName = scanner.nextLine();
        System.out.print("Enter recipent's name: ");
        String recipientName = scanner.nextLine();

        // Create MailClient objects with the user-provided client names
        MailClient sender = new MailClient(senderName, mailServer);
        MailClient recipient = new MailClient(recipientName, mailServer);

        // Prompt the user for the message
        System.out.print("Enter the message: ");
        String message = scanner.nextLine();

        // Use Sophie's sendMailItem method to send the message
        sender.sendMailItem(recipientName, message);

        // Show the mail message
        System.out.print(recipientName+ ",\n\n" + message + "\n\n" + "Thanks," +"\n"+ senderName);
        
        // Close the scanner
        scanner.close();
    }
}
