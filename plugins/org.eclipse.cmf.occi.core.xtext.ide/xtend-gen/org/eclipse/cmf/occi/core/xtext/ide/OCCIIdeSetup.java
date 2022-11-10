/**
 * generated by Xtext 2.11.0
 */
package org.eclipse.cmf.occi.core.xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.cmf.occi.core.xtext.OCCIRuntimeModule;
import org.eclipse.cmf.occi.core.xtext.OCCIStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class OCCIIdeSetup extends OCCIStandaloneSetup {
  @Override
  public Injector createInjector() {
    OCCIRuntimeModule _oCCIRuntimeModule = new OCCIRuntimeModule();
    OCCIIdeModule _oCCIIdeModule = new OCCIIdeModule();
    return Guice.createInjector(Modules2.mixin(_oCCIRuntimeModule, _oCCIIdeModule));
  }
}
