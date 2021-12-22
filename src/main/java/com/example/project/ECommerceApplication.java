package com.example.project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.example.project.model.Category;
import com.example.project.model.produit;
import com.example.project.repository.ReposiroryCategory;
import com.example.project.repository.RepositoryProduit;

@SpringBootApplication
public class ECommerceApplication  implements CommandLineRunner {
	  @Autowired
	private RepositoryProduit rrpp ; 
	  @Autowired
	  private ReposiroryCategory rrcc ;
	
	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}
	/*	
	@Bean
	public CorsFilter corsFilter() {
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
				"Accept", "Authorization", "Origin, Accept", "X-Requested-With",
				"Access-Control-Request-Method", "Access-Control-Request-Headers"));
		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
				"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);
	} */

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Category cat1  =rrcc.save(new Category("phone", "les nouvautes des smartphones"));
		Category cat2  =rrcc.save(new Category("laptop", "les nouvautes des smartphones"));
		
		produit p1 =rrpp.save(new produit("xiaomi ", (double) 1200, "https://scontent.ftun10-1.fna.fbcdn.net/v/t39.30808-6/189521642_4128928740462539_6139505311189418692_n.jpg?_nc_cat=107&ccb=1-3&_nc_sid=8bfeb9&_nc_ohc=b-fQ56v_fWIAX9Zg0EC&_nc_ht=scontent.ftun10-1.fna&oh=1e0ea903956b14f1944b3e7bfee1e59c&oe=60CB692C", "64fd64fzd9f","Vous trouverez ici l'information complète sur xiaomi ",cat1 )) ;
		produit p2 =rrpp.save(new produit("iphone x ", (double) 1200, "img", "64fd64fzd9f","jawou bahi ",cat1 )) ;
		produit p3 =rrpp.save(new produit("hp ", (double) 2400, "img", "64fd64fzd9f","jawou bahi ",cat1 )) ;
		produit p4 =rrpp.save(new produit("dell", (double) 3200, "https://scontent.ftun10-1.fna.fbcdn.net/v/t39.30808-6/188258553_4128929547129125_337977284649942130_n.jpg?_nc_cat=107&ccb=1-3&_nc_sid=8bfeb9&_nc_ohc=59AX3_8RhhEAX_7Ku5m&_nc_ht=scontent.ftun10-1.fna&oh=81b9e55ea7c6ad8c2b6548b17db46cc3&oe=60CD7BA8", "64fd64fzd9f","Vous trouverez ici l'information complète sur L'iphone 12 pro max. . ",cat1 )) ;
		
	}
		
		
			
	}


