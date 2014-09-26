package org.micro.module.testmodule;

import org.micro.module.meta.SubModule;
import org.micro.module.testmodule.domain.BusinessBean;

/**
 * @author dmitry.mamonov
 *         Created: 2014-09-26 10:49 PM
 */
@SubModule("business.logic")
public class BusinessService {
    class BusinessParam {

    }
    BusinessBean findBusinessBean(final BusinessParam param) {
        return new BusinessBean();
    }
}
