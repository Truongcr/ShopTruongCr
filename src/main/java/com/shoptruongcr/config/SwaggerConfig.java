package com.shoptruongcr.config;

import static springfox.documentation.builders.PathSelectors.regex;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.shoptruongcr.constants.SwaggerConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @SuppressWarnings("deprecation")
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title(SwaggerConstants.SWAGGER_TITLE).description(SwaggerConstants.SWAGGER_DESC)
                .termsOfServiceUrl(SwaggerConstants.TERMS_OF_SERVICE_URL).contact(SwaggerConstants.CONTACT_DISPLAY).license(SwaggerConstants.LICENSE)
                .licenseUrl(SwaggerConstants.LICENSE_URL).version(SwaggerConstants.SWAGGER_VERSION).build();
    }
    private Predicate<String> apiPaths() {
        return Predicates.or(regex("/shop.*"), regex("/api/.*"));
    }
    @Bean
    public Docket restApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .globalOperationParameters(Collections.singletonList(
                        new ParameterBuilder()
                                .name("X_SHOP")
                                .modelRef(new ModelRef("string"))
                                .parameterType("HEADER")
                                .required(true)
                                .hidden(true)
                                .defaultValue("BEARER_TOKEN")
                                .build()
                ))
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.shoptruongcr"))
                .paths(apiPaths())
                .build();
    }
}

