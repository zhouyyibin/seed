package seed.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * fast json 配置属性对象。
 */
@ConfigurationProperties(prefix = "fastjson")
public class FastJsonProperties {

    private String charset;

    private String dateFormat;

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }
}
