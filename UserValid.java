package RegexJava;

@FunctionalInterface
public interface UserValid {
	boolean matchPattern(String pattern, String name);

}
