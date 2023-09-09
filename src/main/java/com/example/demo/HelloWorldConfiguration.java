package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name,int age , Address address) { }
record Address(String firstLine,String city) { }
@Configuration
public class HelloWorldConfiguration {

    public HelloWorldConfiguration() {}
    

    @Bean
    public String name() {
        return "Mengistu";
    }

    @Bean
    public int age() {
        return 25;
    }

    @Bean
    public Person person() {
        return new Person("araya", 100,new Address("megenagna","adama"));
    }
    
    @Bean
    public Person person2MethodCall() {
    	return new Person(name(),age(),address2());
    }
    @Bean
    public Person person3Parameter(String name,int age,Address address3) {
    	return new Person(name,age,address3);
    }
    

    @Bean
    public Address address2() {
        return new Address("bole streat", "addis abeba");
    }
    @Bean
    public Address address3() {
        return new Address("bole streat", "addis abeba");
    }
    @Bean
    public Address address() {
        return new Address("romanant", "mekele");
    }

}
