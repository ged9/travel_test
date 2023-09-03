package cz.istep.javatest.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import cz.istep.javatest.data.JavaScriptFramework;
import cz.istep.javatest.repository.JavaScriptFrameworkRepository;
import cz.istep.javatest.rest.JavaScriptFrameworkNotFoundException;

@Service
public class JavaScriptFrameworkServiceImpl implements JavaScriptFrameworkService {
	private JavaScriptFrameworkRepository javaScriptFrameworkRepository;

	public JavaScriptFrameworkServiceImpl(JavaScriptFrameworkRepository javaScriptFrameworkRepository) {
		this.javaScriptFrameworkRepository = javaScriptFrameworkRepository;
	}

	@Override
	public ResponseEntity<Object> saveJavaScriptFramework(JavaScriptFramework javaScriptFramework) {
		javaScriptFrameworkRepository.save(javaScriptFramework);

		return ResponseEntity.ok("JavaScriptFramework added");
	}

	@Override
	public List<JavaScriptFramework> getJavaScriptFrameworks() {
		return (List<JavaScriptFramework>) javaScriptFrameworkRepository.findAll();
	}

	@Override
	public ResponseEntity<Object> updateJavaScriptFramework(JavaScriptFramework javaScriptFramework, long id) throws JavaScriptFrameworkNotFoundException {
		if (!javaScriptFrameworkRepository.existsById(id)) {
			throw new JavaScriptFrameworkNotFoundException(id);
		}

		javaScriptFramework.setId(id);

		javaScriptFrameworkRepository.save(javaScriptFramework);

		return ResponseEntity.ok("JavaScriptFramework " + id + " updated");
	}

	@Override
	public ResponseEntity<Object> deleteJavaScriptFramework(long id) throws JavaScriptFrameworkNotFoundException{
		if (!javaScriptFrameworkRepository.existsById(id)) {
			throw new JavaScriptFrameworkNotFoundException(id);
		}

		javaScriptFrameworkRepository.deleteById(id);

		return ResponseEntity.ok("JavaScriptFramework " + id + " deleted");
	}
}
