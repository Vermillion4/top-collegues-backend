package app;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@EnableJpaRepositories("app.repository")
public class SgpConfiguration {
	
	@Bean
	public DataSource datasource() {
	//DriverManagerDataSource dataSource = new DriverManagerDataSource();
	/*dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	dataSource.setUrl("jdbc:mysql://.../collegues?useSSL=false");
	dataSource.setUsername("root");
	dataSource.setPassword("");*/

	return new EmbeddedDatabaseBuilder()
	.setType(EmbeddedDatabaseType.H2)
	.build();

	}
	/*
	@Bean
	public EntityManagerFactory entityManagerFactory(DataSource ds) {
		LocalContainerEntityManagerFactoryBean factory = new
		LocalContainerEntityManagerFactoryBean();
		factory.afterPropertiesSet();
		return factory.getObject();
	}

	@Bean // gestionnaire de transaction
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		JpaTransactionManager txManager = new JpaTransactionManager();
		txManager.setEntityManagerFactory(emf);
		return txManager;
	*/
	
}
