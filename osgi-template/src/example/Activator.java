package example;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Activator.start()");

		// TODO: Bundle startup code here
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Activator.stop()");
		
		// TODO: Bundle stopping code here
	}
}
