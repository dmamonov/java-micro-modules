package org.micro.module.meta;

/**
 * @author dmitry.mamonov
 *         Created: 2014-09-26 10:41 PM
 */
public @interface SubModule {
    String value();

    String sub() default "";
}
