package be.ietc.tfe.fournil.config;

import java.beans.PropertyVetoException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "be.ietc")
@PropertySource("classpath:persistence-postgresql.properties")
public class ConfigApp implements WebMvcConfigurer {
	@Autowired
	private Environment env;
	private Logger logger = Logger.getLogger(getClass().getName());

	// define viewResolver
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/css/**", "/js/**").addResourceLocations("/css/", "/js/");

	}

	@Bean
	public DataSource securityDataSource() {

		ComboPooledDataSource securityDataSource = new ComboPooledDataSource();
		try {
			securityDataSource.setDriverClass(env.getProperty("jdbc.driver"));
		} catch (PropertyVetoException e) {
			throw new RuntimeException(e);
		}
		logger.info(">>> jdbc url = " + env.getProperty("jdbc.url"));
		logger.info(">>> jdbc user = " + env.getProperty("jdbc.user"));

		securityDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
		securityDataSource.setUser(env.getProperty("jdbc.user"));
		securityDataSource.setPassword(env.getProperty("jdbc.password"));
		
		securityDataSource.setInitialPoolSize(getInProperty("connection.pool.initialPoolSize"));
		securityDataSource.setMinPoolSize(getInProperty("connection.pool.minPoolSize"));
		securityDataSource.setMaxPoolSize(getInProperty("connection.pool.maxPoolSize"));
		securityDataSource.setMaxIdleTime(getInProperty("connection.pool.maxIdleTime"));
		
		return securityDataSource;
	}
	
	private int getInProperty(String propName) {
		String propVal = env.getProperty(propName);
		
		int intPropVal = Integer.parseInt(propVal);
		
		return intPropVal;
	}

}
