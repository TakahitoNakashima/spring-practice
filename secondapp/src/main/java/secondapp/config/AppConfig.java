package secondapp.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {

	@Bean // MessageSourceのBeaan定義
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasenames("messages");
		return messageSource;
	}

	@Bean  // PropertySourcesPlaceholderConfigurerのBean定義
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderCongifurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}
