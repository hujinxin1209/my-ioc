package com.ugia.ioc.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Autowired {
	// 注入的类类型
	Class<?> value() default Class.class;
	
	// bean名称
	String name() default "";
}
