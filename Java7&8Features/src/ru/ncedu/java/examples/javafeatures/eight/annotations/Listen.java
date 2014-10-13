package ru.ncedu.java.examples.javafeatures.eight.annotations;

import java.lang.annotation.Repeatable;

/**
 * @author kolesnikov
 */
@Repeatable(Listens.class)
public @interface Listen {
    String value();
}
