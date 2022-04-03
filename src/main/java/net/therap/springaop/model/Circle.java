package net.therap.springaop.model;

import net.therap.springaop.aspect.Log;
import org.springframework.stereotype.Component;

/**
 * @author adyel.ullahil
 * @since 11/27/21
 */
@Component
public class Circle {

    public Circle() {
        this.name = "I am Circle";
    }

    private String name;

    public String getName() {
        return name;
    }

    @Log
    public void setName(String name) {
        this.name = name;
    }
}
