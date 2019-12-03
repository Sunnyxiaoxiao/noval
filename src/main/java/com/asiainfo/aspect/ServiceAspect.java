package com.asiainfo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 针对service层的切面
 * 作者:wangkejie
 * 日期:2019-12-02
 * 时间:17:08
 */
//省略导入包

@Aspect
@Service("logAspect")
public class ServiceAspect {

    private final static Logger logger = LoggerFactory.getLogger(ServiceAspect.class);
        @Pointcut("execution(* com.asiainfo.services.*.*(..))")
        public void serviceMethod(){
        }

        @Before("serviceMethod()")
        public void before(JoinPoint joinPoint){
            String name=joinPoint.getSignature().getName();
            logger.info(name+"方法的前置通知");
        }

        @AfterReturning("serviceMethod()")
        public void afterMethod(){
            logger.info("后置通知!");
        }

        @AfterThrowing("serviceMethod()")
        public void afterThrowing()throws Throwable{
            logger.info("异常通知");
        }

        @After("serviceMethod()")
        public void finalMethod(){
            logger.info("最终通知");
        }


        @Around("serviceMethod()")
        public Object aroundMethod(ProceedingJoinPoint pjp)throws Throwable{
            logger.info("环绕通知");
            return  pjp.proceed();
        }
}
