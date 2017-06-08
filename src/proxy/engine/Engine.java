package proxy.engine;

import proxy.diagnostics.DiagnosticTool;

public interface Engine {
	//Intrinsic method, shared.
	public int getSize();
	public boolean isTurbo(); 
	
	//Extrinsic state. Passed as argument, not shared
	public void diagnose(DiagnosticTool tool);
	public String toString();

}
