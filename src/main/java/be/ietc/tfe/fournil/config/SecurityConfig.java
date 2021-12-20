package be.ietc.tfe.fournil.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource securityDataSaource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		// super.configure(auth);
		//UserBuilder users = User.withDefaultPasswordEncoder();

		/*auth.inMemoryAuthentication().withUser(users.username("john").password("test123").roles("CUSTOMER"))
				.withUser(users.username("mary").password("test123").roles("CUSTOMER", "MANAGER"))
				.withUser(users.username("suan").password("test123").roles("CUSTOMER", "MANAGER", "ADMIN"));
		*/
		auth.jdbcAuthentication().dataSource(securityDataSaource);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/css/**").permitAll()
			.antMatchers("/js/**").permitAll()
			
			.antMatchers("/customer/**").permitAll()
			.antMatchers("/manager/**").hasRole("MANAGER")
			.antMatchers("/admin/**").hasRole("ADMIN")
			.anyRequest().authenticated()
			.and()		
			.formLogin().loginPage("/loginPage")
				.loginProcessingUrl("/authenticateUser").permitAll()
			.and().logout().permitAll()
			.and()
			.exceptionHandling().accessDeniedPage("/access-denied");
			
		
		
	}

}
