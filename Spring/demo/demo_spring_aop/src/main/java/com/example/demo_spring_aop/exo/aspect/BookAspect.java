package com.example.demo_spring_aop.exo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BookAspect {
    @Pointcut("@annotation(com.example.demo_spring_aop.exo.annotation.CustomAnnotation)")
    public void customAnnotationPointCut() {

    }


    @After("customAnnotationPointCut()")
    public void methodAspectWithAnnotation() {

        System.out.println("Temps d'execution" + System.currentTimeMillis());
    }

    @Around("customAnnotationPointCut()")
    public Object addLogAroundMethods(ProceedingJoinPoint joinPoint){
        try{
            System.out.println("Enter method");

           Object object =  joinPoint.proceed();

            System.out.println("Exit Method");
            return object;
        }catch (Throwable e){
            throw new RuntimeException(e);
        }
    }

}
