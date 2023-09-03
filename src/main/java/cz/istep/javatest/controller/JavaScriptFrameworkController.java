package cz.istep.javatest.controller;

import javax.validation.Valid;

import cz.istep.javatest.data.JavaScriptFramework;
import cz.istep.javatest.service.JavaScriptFrameworkService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaScriptFrameworkController {

	private JavaScriptFrameworkService javaScriptFrameworkService;

	public JavaScriptFrameworkController(JavaScriptFrameworkService javaScriptFrameworkService) {
		this.javaScriptFrameworkService = javaScriptFrameworkService;
	}

	@GetMapping("/frameworks")
	public Iterable<JavaScriptFramework> frameworks() {
		return javaScriptFrameworkService.getJavaScriptFrameworks();
	}

	@PostMapping("/frameworks")
	public ResponseEntity<Object> frameworkAdd(@Valid @RequestBody JavaScriptFramework javaScriptFramework) {
		return javaScriptFrameworkService.saveJavaScriptFramework(javaScriptFramework);
	}

	@PostMapping("/frameworks/{id}")
	public ResponseEntity<Object> frameworkUpdate(@Valid @RequestBody JavaScriptFramework javaScriptFramework, @PathVariable long id) throws Exception {
		return javaScriptFrameworkService.updateJavaScriptFramework(javaScriptFramework, id);
	}

	@DeleteMapping("/frameworks/{id}")
	public ResponseEntity<Object> frameworkRemove(@PathVariable("id") Long id) throws Exception {
		return javaScriptFrameworkService.deleteJavaScriptFramework(id);
	}
}
