package me.nicolaferraro.quickstarts;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "sample")
public class RouteConfig {

    /**
     * The recipient endpoint.
     */
    private String recipients;

    public RouteConfig() {
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
