package cz.istep.javatest.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class JavaScriptFramework {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Size(min = 3, max = 30)
	@NotEmpty
	private String name;

	private String version;

	private int hypeLevel;

	public JavaScriptFramework() {
	}

	public JavaScriptFramework(String name) {
		this.name = name;
	}

	public JavaScriptFramework(String name, String version, int hypeLevel) {
		this.name = name;
		this.version = version;
		this.hypeLevel = hypeLevel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getHypeLevel() {
		return hypeLevel;
	}

	public void setHypeLevel(int hypeLevel) {
		this.hypeLevel = hypeLevel;
	}

	@Override
	public String toString() {
		return "JavaScriptFramework [" +
				"id=" + id +
				", name=" + name +
				", version=" + version+
				", hypeLevel=" + hypeLevel +
				"]";
	}
}
