package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringIoCDemo {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("projectbeans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        Engine engine = (Engine) beanFactory.getBean("engine4");
        System.out.println(engine.getName());
        System.out.println(engine.getCc());
    }
}
