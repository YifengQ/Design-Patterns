

public interface GPU {
	public String toString();
}

class ARM implements GPU {
	public String toString() {
		return "ARM GPU";
	}
}

class X86 implements GPU {
	public String toString() {
		return "X86 GPU";
	}
}

class X77 implements GPU {
	public String toString() {
		return "X77 GPU";
	}
}