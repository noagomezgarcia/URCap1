package com.noa.lightUp.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.ur.urcap.api.contribution.program.swing.SwingProgramNodeService;

public class Activator implements BundleActivator {
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("LightUp registering");

		bundleContext.registerService(SwingProgramNodeService.class, new LightUpProgramNodeService(), null);
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Activator says Goodbye World!");
	}
}