package cn.anniweiya.appserver.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.annotation.Order;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.nio.charset.Charset;

/**
 * Created by anniweiya on 5/26/17.
 */
@Configuration
@Order(0)
@ComponentScan(basePackages = "cn.anniweiya",
        includeFilters = {
                @Filter(type = FilterType.ANNOTATION,
                        value = org.springframework.stereotype.Controller.class),
                @Filter(type = FilterType.ANNOTATION,
                        value = org.springframework.web.bind.annotation.RestController.class)
        },
        excludeFilters = @Filter(type = FilterType.ANNOTATION,
                value = org.springframework.stereotype.Service.class)
)
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Bean
    public StringHttpMessageConverter stringHttpMessageConverter() {
        return new StringHttpMessageConverter(Charset.forName("UTF-8"));
    }

    @Bean
    public MappingJackson2HttpMessageConverter jackson2HttpMessageConverter() {
        MappingJackson2HttpMessageConverter jackson2HttpMessageConverter =
                new MappingJackson2HttpMessageConverter();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        jackson2HttpMessageConverter.setObjectMapper(objectMapper);

        return jackson2HttpMessageConverter;
    }


    @Bean
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setDefaultEncoding(String.valueOf(Charset.forName("UTF-8")));
        // 指定所上传文件的总大小不能超过100M
        // 注意maxUploadSize属性的限制不是针对单个文件, 而是所有文件的容量之和
        multipartResolver.setMaxUploadSize(104857600);
        multipartResolver.setMaxInMemorySize(4096);

        return multipartResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations(
                "/resources/");

        registry.addResourceHandler("swagger-ui.html").addResourceLocations(
                "classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**").addResourceLocations(
                "classpath:/META-INF/resources/webjars/");
    }
}
