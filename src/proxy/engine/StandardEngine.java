package proxy.engine;

public class StandardEngine extends AbstractEngine {
	public StandardEngine(int s) {
		super(s,  false);
	}

	@Override
	public String toString() {
		return "Standard";
	}
}
