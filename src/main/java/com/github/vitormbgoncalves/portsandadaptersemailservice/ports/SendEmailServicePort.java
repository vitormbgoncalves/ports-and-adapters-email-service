package com.github.vitormbgoncalves.portsandadaptersemailservice.ports;

import com.github.vitormbgoncalves.portsandadaptersemailservice.core.domain.Email;

public interface SendEmailServicePort {

  void sendEmailSmtp(Email email);
}
