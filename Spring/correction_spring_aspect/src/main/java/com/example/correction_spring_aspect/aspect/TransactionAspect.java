package com.example.correction_spring_aspect.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TransactionAspect {

        SessionFactory sessionFactory;
    @Pointcut("@annotation(com.example.correction_spring_aspect.annotation.Transaction)")
    public void transactionPointCut(){}

    @Around("transactionPointCut()")
    public Object transactionAspect(ProceedingJoinPoint joinPoint) throws Throwable {
        Session session = sessionFactory.openSession();;
        Transaction transac = session.beginTransaction();

        try{
            Object object = joinPoint.proceed();
            transac.commit();
            return object;
        }catch (Throwable e){
            if(transac!=null) {
                transac.rollback();
            }
            throw  e;
        }finally{
           if(session!= null){
               session.close();
           }
        }
    }

}
