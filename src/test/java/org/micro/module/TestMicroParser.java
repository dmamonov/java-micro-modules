package org.micro.module;

import org.micro.module.model.MicroClass;
import org.micro.module.parser.MicroParser;
import org.micro.module.parser.MicroParserJavassist;
import org.micro.module.testmodule.domain.BusinessBean;
import org.testng.annotations.Test;

/**
 * @author dmitry.mamonov
 *         Created: 2014-09-26 10:47 PM
 */
public class TestMicroParser {

    @Test
    public void testClassParser() throws Exception {
        final MicroParser parser = new MicroParserJavassist();
        final MicroClass microClass = parser.parseClass(BusinessBean.class.getName());
        System.out.println(microClass);

    }
}
