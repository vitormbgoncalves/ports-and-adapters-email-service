package com.github.vitormbgoncalves.portsandadaptersemailservice.adapters.outbound.smtp;

import com.github.vitormbgoncalves.portsandadaptersemailservice.core.domain.Email;
import com.github.vitormbgoncalves.portsandadaptersemailservice.ports.SendEmailServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SmtpSendEmailServicePort implements SendEmailServicePort {

  @Autowired
  JavaMailSender emailSender;

  @Override
  public void sendEmailSmtp(Email email) {
    SimpleMailMessage message = new SimpleMailMessage();
    message.setFrom(email.getEmailFrom());
    message.setTo(email.getEmailTo());
    message.setSubject(email.getSubject());
    message.setText(email.getText());
    emailSender.send(message);
  }
}
