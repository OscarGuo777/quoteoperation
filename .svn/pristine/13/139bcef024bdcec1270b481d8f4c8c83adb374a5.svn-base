package com.jz.quoteoperation.wechat.config;

import com.jz.quoteoperation.wechat.Feigninterface.FeignHttp;
import com.netflix.hystrix.HystrixCommandProperties;
import feign.Contract;
import feign.hystrix.HystrixFeign;
import feign.hystrix.SetterFactory;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 使用注解 配置FeignCofig
 */

@Configuration
public class FeignConfig {
    @Value("https://api.weixin.qq.com")
    private  String baseUrl ;

    @Value("3000")
    private String  accessTimeOutMillis;  //设置连接3000毫秒





    @Bean
    FeignHttp feignHttp() throws InterruptedException {
        try{
            Integer.parseInt(accessTimeOutMillis);
            return HystrixFeign.builder()
                    .decoder(new JacksonDecoder())
                    .encoder(new JacksonEncoder())
                    .setterFactory((target, method) ->
                            new SetterFactory.Default().create(target, method).
                                    andCommandPropertiesDefaults(HystrixCommandProperties.defaultSetter().
                                            withExecutionTimeoutInMilliseconds(Integer.parseInt(accessTimeOutMillis))))
                    .target(FeignHttp.class, this.baseUrl);
        }catch (Exception e){
            return HystrixFeign.builder()
                    .decoder(new JacksonDecoder())
                    .encoder(new JacksonEncoder())
                    .setterFactory((target, method) ->
                            new SetterFactory.Default().create(target, method).
                                    andCommandPropertiesDefaults(HystrixCommandProperties.defaultSetter().
                                            withExecutionTimeoutInMilliseconds(10000)))
                    .target(FeignHttp.class, this.baseUrl);
        }
    }

    @Bean
    public Contract useFeignAnnotations() {
        return new Contract.Default();
    }
}
