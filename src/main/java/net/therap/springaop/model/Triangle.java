package net.therap.springaop.model;

import org.springframework.stereotype.Component;

/**
 * @author adyel.ullahil
 * @since 11/27/21
 */

@Component
public class Triangle {

    private String name;

    public Triangle() {
        this.name = "I am a Triangle";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
