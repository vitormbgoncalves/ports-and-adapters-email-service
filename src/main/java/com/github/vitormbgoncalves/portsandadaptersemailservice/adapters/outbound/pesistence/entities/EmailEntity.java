package com.github.vitormbgoncalves.portsandadaptersemailservice.adapters.outbound.pesistence.entities;

import com.github.vitormbgoncalves.portsandadaptersemailservice.core.domain.enums.StatusEmail;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailEntity implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private UUID emailId;
  private String ownerRef;
  private String emailFrom;
  private String emailTo;
  private String subject;
  @Column(columnDefinition = "TEXT")
  private String text;
  private LocalDateTime sendDateEmail;
  private StatusEmail statusEmail;
}
