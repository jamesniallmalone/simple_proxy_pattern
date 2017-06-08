package proxy.engine;

import proxy.diagnostics.DiagnosticTool;

public abstract class AbstractEngine implements Engine {
	
	private int size;
	private boolean isturbo;
	
	public AbstractEngine(int s, boolean t){
		size = s;
		isturbo = t;
	}

	public int getSize(){
		return size;
	}

	public boolean isTurbo(){
		return isturbo;
	}
	@Override
	public void diagnose(DiagnosticTool tool) {
		System.out.println(tool.runDiagnostics(this));
	}
	
	@Override
	public abstract String toString();

}
