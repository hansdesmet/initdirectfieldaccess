package be.vdab.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// enkele imports
public class Initializer extends
		AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { CreateControllerBeans.class };
	}
}