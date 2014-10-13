package ru.ncedu.java.examples.javafeatures.eight.annotations;

import java.util.Arrays;

/**
 * @author kolesnikov
 */
public class Test {

    public static void main(String[] agrs) {
        AnnotatedClass annotated = new AnnotatedClass();

        Listen[] annotations = annotated.getClass().getAnnotationsByType(Listen.class);
        Arrays.asList(annotations).forEach(listen -> System.out.println(listen.value()));
    }

}
