package co.pts.prc;

public class SystemEnvExample {

	public static void main(String[] args) {
		// JAVA_HOME 환경 변수 값 얻기
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME: " + javaHome);
	}

}
