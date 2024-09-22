package br.com.thidi.middleware.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.classmate.TypeResolver;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringFoxConfig {
//	private final TypeResolver typeResolver;

	@Autowired
	public SpringFoxConfig() {
//		this.typeResolver = typeResolver;
	}
//
//	@Autowired
//	public void createAdditionalModelDocumentation(Docket docket) {
////		docket.additionalModels(typeResolver.resolve(WebhookGenericModel.class));
//	}

	Package pkg = getClass().getPackage();
	String version = pkg.getImplementationVersion();

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class)).paths(PathSelectors.any())
				.build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Middleware Hikvision - SeniorX")
				.description("API REST ConexV2 para comunicação com equipamentos Telemática").version(version).build();
	}

}