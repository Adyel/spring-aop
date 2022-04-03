package net.therap.springaop.service;

import net.therap.springaop.aspect.Log;
import net.therap.springaop.model.Circle;
import net.therap.springaop.model.Triangle;
import org.springframework.stereotype.Service;

/**
 * @author adyel.ullahil
 * @since 11/27/21
 */

@Service
public class ShapeService {

    private final Circle circle;
    private final Triangle triangle;

    public ShapeService(Circle circle, Triangle triangle) {
        this.circle = circle;
        this.triangle = triangle;
    }

    @Log
    public Circle getCircle() {
        return circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }
}
