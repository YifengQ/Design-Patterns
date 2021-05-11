

public interface Cabinet {
	public String toString();
}

class SmallCabinet implements Cabinet {
	public String toString() {
		return "Small cabinet";
	}
}

class MediumCabinet implements Cabinet {
	public String toString() {
		return "Medium cabinet";
	}
}

class LargeCabinet implements Cabinet {
	public String toString() {
		return "Large cabinet";
	}
}