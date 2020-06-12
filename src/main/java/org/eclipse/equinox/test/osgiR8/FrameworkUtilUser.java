package org.eclipse.equinox.test.osgiR8;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class FrameworkUtilUser {
	Bundle getBundle(Object o) {
		return FrameworkUtil.getBundle(o.getClass());
	}
}
