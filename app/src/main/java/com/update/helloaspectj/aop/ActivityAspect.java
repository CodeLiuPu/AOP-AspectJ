package com.update.helloaspectj.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ActivityAspect {

    @Before("execution(* android.app.Activity.onCreate(..))")
    public void onCreateMethodBefore(org.aspectj.lang.JoinPoint joinPoint) throws Throwable {
        System.out.println("Update onCreateMethod_Before Point = " + joinPoint.getSignature());
    }

    @After("execution(* android.app.Activity.onCreate(..))")
    public void onCreateMethodAfter(org.aspectj.lang.JoinPoint joinPoint) throws Throwable {
        System.out.println("Update onCreateMethod_After Point = " + joinPoint.getSignature());
    }

}