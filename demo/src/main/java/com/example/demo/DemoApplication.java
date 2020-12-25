package com.example.demo;

import io.github.yedaxia.apidocs.Docs;
import io.github.yedaxia.apidocs.DocsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws MalformedURLException {

		DocsConfig config = new DocsConfig();
		config.setProjectPath("/Users/fangzhengwei/Desktop/demo"); // 项目根目录
		config.setProjectName("Test-Demo"); // 项目名称
		config.setApiVersion("V1.0");       // 声明该API的版本
		config.setDocsPath("/Users/fangzhengwei/Desktop/demo/docs"); // 生成API 文档所在目录
		config.setAutoGenerate(Boolean.TRUE);  // 配置自动生成
		Docs.buildHtmlDocs(config); // 执行生成文档
		SpringApplication.run(DemoApplication.class, args);
	}

}
