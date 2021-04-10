

public interface Display {
	public String toString();
}

class LCDDisplay implements Display {
	public String toString() {
		return "LCD display";
	}
}

class CRTDisplay implements Display {
	public String toString() {
		return "CRT display";
	}
}

class VGADisplay implements Display {
	public String toString() {
		return "VGA display";
	}
}

class ReelsDisplay implements Display {
	public String toString() {
		return "Reels display";
	}
}