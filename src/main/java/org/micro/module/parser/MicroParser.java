package org.micro.module.parser;

import org.micro.module.model.MicroClass;

/**
 * @author dmitry.mamonov
 *         Created: 2014-09-26 10:53 PM
 */
public interface MicroParser {
    MicroClass parseClass(String className);
}
