package com.example.demo.HelloWorldPackege;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


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
    	return new Person(name(),age(),address());
    }
    @Bean
    public Person person3Parameter(String name,int age,Address address2) {
    	return new Person(name,age,address2);
    }
    @Bean
    @Primary
    public Person person4Parameter(String name,int age,Address address) {
    	return new Person(name,age,address);
    }
    @Bean
    public Person person5Qualifier(String name,int age,@Qualifier("address3qualifier") Address address) {
    	return new Person(name,age,address);
    }
    

    @Bean(name="address2")
    @Primary
    public Address address() {
        return new Address("bole streat", "addis abeba");
    }
    @Bean(name="address3")
    @Qualifier("address3qualifier")
    public Address address3() {
        return new Address("romanant", "mekele");
    }

}
