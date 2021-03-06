/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.routines;


import com.oneops.crawler.jooq.cms.Kloopzcm;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NsDeleteNamespace extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -1067160655;

    /**
     * The parameter <code>kloopzcm.ns_delete_namespace.p_ns_path</code>.
     */
    public static final Parameter<String> P_NS_PATH = createParameter("p_ns_path", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * Create a new routine call instance
     */
    public NsDeleteNamespace() {
        super("ns_delete_namespace", Kloopzcm.KLOOPZCM);

        addInParameter(P_NS_PATH);
    }

    /**
     * Set the <code>p_ns_path</code> parameter IN value to the routine
     */
    public void setPNsPath(String value) {
        setValue(P_NS_PATH, value);
    }
}
