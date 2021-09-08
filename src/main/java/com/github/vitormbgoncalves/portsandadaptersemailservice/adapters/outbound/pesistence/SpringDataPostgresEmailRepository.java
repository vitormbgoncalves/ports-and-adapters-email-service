package com.github.vitormbgoncalves.portsandadaptersemailservice.adapters.outbound.pesistence;

import com.github.vitormbgoncalves.portsandadaptersemailservice.adapters.outbound.pesistence.entities.EmailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SpringDataPostgresEmailRepository extends JpaRepository<EmailEntity, UUID> {
}
