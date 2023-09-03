package cz.istep.javatest.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import cz.istep.javatest.data.JavaScriptFramework;
import cz.istep.javatest.rest.JavaScriptFrameworkNotFoundException;

public interface JavaScriptFrameworkService {
	ResponseEntity<Object> saveJavaScriptFramework(JavaScriptFramework javaScriptFramework);

	List<JavaScriptFramework> getJavaScriptFrameworks();

	ResponseEntity<Object> updateJavaScriptFramework(JavaScriptFramework javaScriptFramework, long id) throws JavaScriptFrameworkNotFoundException;

	ResponseEntity<Object> deleteJavaScriptFramework(long id) throws JavaScriptFrameworkNotFoundException;
}
