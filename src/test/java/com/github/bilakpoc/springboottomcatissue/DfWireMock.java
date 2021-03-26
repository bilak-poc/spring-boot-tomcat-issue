package com.github.bilakpoc.springboottomcatissue;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface DfWireMock {
  int port() default -1;
  
  String portProvider() default "";
  
  String uriProperty() default "";
  
  String portProperty() default "";
}
