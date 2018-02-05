package com.example.config;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * <p>
 * <code>SwaggerConfig</code>
 * </p>
 * Description:
 *
 * @author Mcchu
 * @date 2018/2/5 9:53
 */
@Configuration
@EnableSwagger
@EnableWebMvc
public class SwaggerConfig {

    private SpringSwaggerConfig springSwaggerConfig;

    @Autowired
    public SwaggerConfig( SpringSwaggerConfig springSwaggerConfig )
    {
        this.springSwaggerConfig = springSwaggerConfig;
    }

    /**
     * Every SwaggerSpringMvcPlugin bean is picked up by the swagger-mvc
     * framework - allowing for multiple swagger groups i.e. same code base
     * multiple swagger resource listings.
     */
    @Bean
    public SwaggerSpringMvcPlugin customImplementation() {
        return new SwaggerSpringMvcPlugin(this.springSwaggerConfig)
                .apiInfo(apiInfo())
                .includePatterns(".*");
    }


    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "Spring MVC Swagger Demo",
                "Spring MVC 简单示例，依赖于 MySQL 数据库，只有简单的用户存储功能。",
                "开发者: Jalen Chu",
                "chumingcheng234@gmail.com",
                "MIT License",
                "/LICENSE");
        return apiInfo;
    }
}
