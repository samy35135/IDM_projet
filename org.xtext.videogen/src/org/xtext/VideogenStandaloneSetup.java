/*
 * generated by Xtext
 */
package org.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class VideogenStandaloneSetup extends VideogenStandaloneSetupGenerated{

	public static void doSetup() {
		new VideogenStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

