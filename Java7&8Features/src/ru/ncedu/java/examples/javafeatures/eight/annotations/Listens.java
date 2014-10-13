package ru.ncedu.java.examples.javafeatures.eight.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author kolesnikov
 */

@Target(TYPE)
@Retention(RUNTIME)
public @interface Listens {
    Listen[] value();
}
