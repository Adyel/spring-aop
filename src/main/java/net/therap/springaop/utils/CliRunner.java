package net.therap.springaop.utils;

import net.therap.springaop.model.Circle;
import net.therap.springaop.service.ShapeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author adyel.ullahil
 * @since 11/27/21
 */

@Component
public class CliRunner implements CommandLineRunner {

    @Autowired
    private ShapeService shapeService;

    @Override
    public void run(String... args) throws Exception {

        Circle circle = shapeService.getCircle();
        circle.setName("গোল Circle");
        System.out.println(circle.getName());
    }
}
