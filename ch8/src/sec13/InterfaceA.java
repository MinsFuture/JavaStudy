package sec13;

public sealed interface InterfaceA permits InterfaceB {
	void methodA();
}