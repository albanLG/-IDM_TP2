/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.jppjson.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.jppjson.ui.internal.JppjsonActivator;

public class MyDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return JppjsonActivator.getInstance().getInjector("org.xtext.example.jppjson.MyDsl");
	}

}
