package com.havelsan.intern;

import com.havelsan.intern.JaxbXml.JaxbXmlToObject;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RequiredArgsConstructor
public class InternApplication {

	private final JaxbXmlToObject jaxbXmlToObject;

	public static void main(String[] args) {

		SpringApplication.run(InternApplication.class, args);
	}

	@PostConstruct
	public void initJaxb() { jaxbXmlToObject.xmlToObject(); }

}
