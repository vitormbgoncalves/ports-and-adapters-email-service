package com.github.vitormbgoncalves.portsandadaptersemailservice.adapters.configuration;

import com.github.vitormbgoncalves.portsandadaptersemailservice.Application;
import com.github.vitormbgoncalves.portsandadaptersemailservice.ports.EmailRepositoryPort;
import com.github.vitormbgoncalves.portsandadaptersemailservice.ports.SendEmailServicePort;
import com.github.vitormbgoncalves.portsandadaptersemailservice.core.service.EmailServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Application.class)
public class BeanConfiguration {

  @Bean
  EmailServiceImpl emailServiceImpl(EmailRepositoryPort repository, SendEmailServicePort sendEmailServicePort) {
    return new EmailServiceImpl(repository, sendEmailServicePort);
  }

  @Bean
  public ModelMapper modelMapper() {
    return new ModelMapper();
  }
}
