package io.protostuff;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Specify rpc response qualifier.
 *
 * @author Kostiantyn Shchepanovskyi
 */
@Documented
@Target(METHOD)
@Retention(RUNTIME)
public @interface Response
{
    String value();
}
