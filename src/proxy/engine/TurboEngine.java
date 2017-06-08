package proxy.engine;

public class TurboEngine extends AbstractEngine {

	public TurboEngine(int s) {
		super(s, true);
	}

	@Override
	public String toString() {
		return "Turbo";
	}
}
