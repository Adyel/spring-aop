package net.therap.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author adyel.ullahil
 * @since 11/27/21
 */

@Component
@EnableAspectJAutoProxy
@Aspect
public class LoggingAspect {

    @Before("execution(public String getN*())")
    public void beforeMethodExecutionLoggingAspectAdvice(){
        System.out.println("Get method was called at: " + System.currentTimeMillis());
    }

    @Pointcut("@annotation(net.therap.springaop.aspect.Log)")
    public void logger(){}

    @Around("logger()")
    public Object loggingAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {
        long startingTime = System.currentTimeMillis();
        System.out.println("Get method was called at: " + startingTime);
        Object result = joinPoint.proceed();
        System.out.println("Get method run duration: " + (System.currentTimeMillis() - startingTime) + "ms");

        return result;
    }

    @Pointcut("args(value)")
    public void stringArg(String value){}

    @Before("logger() && stringArg(value)")
    public void beforeStringParamMethod(String value){
        System.out.println("We are setting value to " + value);
    }
}
