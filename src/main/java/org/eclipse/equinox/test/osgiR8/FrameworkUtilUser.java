package org.eclipse.equinox.test.osgiR8;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class FrameworkUtilUser {
	Bundle getBundle(Object o) {
		return FrameworkUtil.getBundle(o.getClass());
	}

	// Compiling this method against Java 7 will fail with missing Optional
//	Bundle getBundleByClassLoader(ClassLoader loader) {
//		return FrameworkUtil.getBundle(loader).get();
//	}
}
