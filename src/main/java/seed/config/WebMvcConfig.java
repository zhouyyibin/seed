package seed.config;

import com.alibaba.fastjson.serializer.ContextValueFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

/**
 * web mvc配置对象。
 * Created by yejianfei on 2016/12/14.
 */
@Configuration
@EnableConfigurationProperties({FastJsonProperties.class})
public class WebMvcConfig extends WebMvcConfigurerAdapter {


    @Autowired
    private FastJsonConfig fastJsonConfig;


    @Bean
    public FastJsonConfig fastJsonConfig() {
        String tz = TimeZone.getDefault().getID();
        String format = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
        if ("Etc/UTC".equals(tz) || "UTC".equals(tz) || "GMT".equals(tz) ||  "GMT-00:00".equals(tz) || "GMT+00:00".equals(tz)) {
            format = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
        }

        FastJsonConfig config = new FastJsonConfig();
        config.setCharset(Charset.forName("UTF-8"));
        config.setDateFormat(format);
        config.setSerializerFeatures(SerializerFeature.WriteMapNullValue);

        config.setSerializeFilters((ContextValueFilter) (beanContext, o, s, o1) -> {
            if (o1 != null && o1 instanceof Long) {
                return String.valueOf(o1);
            }
            return o1;
        });

        return config;
    }

    @Bean
    public FastJsonHttpMessageConverter fastJsonHttpMessageConverter() {
        List<MediaType> mediaTypes = new ArrayList<>();
        mediaTypes.add(new MediaType("application", "json", Charset.forName("UTF-8")));

        FastJsonHttpMessageConverter fastjson = new FastJsonHttpMessageConverter();
        fastjson.setSupportedMediaTypes(mediaTypes);
        fastjson.setFastJsonConfig(fastJsonConfig);

        return fastjson;
    }

    /**
     * 统一输出风格
     * See {@link com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy} for details.
     * @param converters
     */
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        for (int i = 0; i < converters.size(); i++) {
            if (converters.get(i) instanceof MappingJackson2HttpMessageConverter ) {
                ObjectMapper objectMapper = new ObjectMapper();
                // 统一返回数据的输出风格
                objectMapper.setPropertyNamingStrategy(new PropertyNamingStrategy.SnakeCaseStrategy());
                objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
                objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                objectMapper.setTimeZone(TimeZone.getTimeZone("GMT+8"));
                MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
                converter.setObjectMapper(objectMapper);
                converters.set(i, converter);
                break;
            }
        }// end for
    }
}
