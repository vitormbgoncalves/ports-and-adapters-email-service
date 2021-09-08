package com.github.vitormbgoncalves.portsandadaptersemailservice.ports;

import com.github.vitormbgoncalves.portsandadaptersemailservice.core.domain.Email;
import com.github.vitormbgoncalves.portsandadaptersemailservice.core.domain.PageInfo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EmailRepositoryPort {

  Email save(Email email);
  List<Email> findAll(PageInfo pageInfo);
  Optional<Email> findById(UUID emailId);
}
