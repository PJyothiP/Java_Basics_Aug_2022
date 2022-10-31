package Streams;

public interface FunctionalInterfaceDemo {
	public int abstractDummy(String a);
	default void defaultDemo() {
		System.out.println("This  is the default method in FI");
	}
	public static void staticDemo() {
		System.out.println("This is static method in FI");
	}
}
