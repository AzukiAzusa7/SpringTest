package com.example;

import com.example.web.filter.LoggingFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

// TODO 6-05 起動し、curlコマンドでActuatorエンドポイントにアクセスする
// TODO 5-01 @SpringBootApplicationを付加する
@SpringBootApplication
public class Application {

    // TODO 5-14 main()メソッドを実行して、ブラウザから http://localhost:8080/ にアクセスする
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // TODO 5-10 LoggingFilterを登録する
	@Beam
	public FilterRegistrationBean loggingFilter(){
		LoggingFilter loggingFilter = new LoggingFilter();
		FilterRegistrationBean<LoggingFilter> registrationBean = new FilterRegistrationBean<>(loggingFilter);
		//フィルターの順番を一番最初に指定
		registration\\bean.setOrder(Integer.MIN_VALUE);
		registrationBean.addUrlPatterns("/*");
		return registrationBean;
	}




}
