package cz.istep.javatest.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "JavaScriptFramework not found")
public class JavaScriptFrameworkNotFoundException extends Exception {
	public JavaScriptFrameworkNotFoundException(long id) {
		super("JavaScriptFrameworkNotFoundException with id="+id);
	}
}
