package com.mmdworks.dbDemo.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LoggingAspect {

	private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Pointcut("execution(* com.mmdworks.dbDemo.service.*.*(..))")
	public void serviceLayerLoggingPointCut() {}
	
	@Pointcut("execution(* com.mmdworks.dbDemo.jdbc.*.*(..))")
	public void daoLayerLoggingPointCut() {}
	
	@Before("serviceLayerLoggingPointCut()")
	public void serviceLayerLogginAdvice(JoinPoint joinPoint) {
		logger.info("Service Logging  pointcut {}"+joinPoint.toString());
	}
	
	@Before("serviceLayerLoggingPointCut()")
	public void daoLayerLogginAdvice(JoinPoint joinPoint) {
		logger.info("Dao Logging  pointcut {}"+joinPoint.toString());
	}
	
	
	
	
}
