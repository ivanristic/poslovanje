package com.sargije.web.poslovanje.views;

import java.util.Locale;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

@Component	
public class PdfViewResolver implements ViewResolver {

	@Override
	public View resolveViewName(String viewName, Locale locale) throws Exception {
		//System.out.println(viewName);
		//return new PdfView();
		return (View) Class.forName(viewName).newInstance();
	}

}
