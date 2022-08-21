package com.irostub.designpatterns._10facade.after;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSender implements MailSender{
    private MailSettings mailSettings;

    @Override
    public void sendMail(MailMessage mailMessage) {
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", mailSettings.getHost());
        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(mailMessage.getFrom());
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(mailMessage.getTo()));
            message.setSubject(mailMessage.getSubject());
            message.setText(mailMessage.getText());
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
