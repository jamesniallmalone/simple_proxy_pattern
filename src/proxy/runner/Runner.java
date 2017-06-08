package proxy.runner;

import proxy.diagnostics.DiagnosticTool;
import proxy.diagnostics.EngineDiagnosticTool;
import proxy.engine.Engine;
import proxy.factory.EngineFlyweightFactory;

public class Runner {
	
	/*
	 * Separate intrinsic and extrinsic functionality. Intrinsic functionality (objects which return the same info regardless of instance)
	 * can be called on from a hashmap. Extrinsic functionality will need to be included separately. Particularly useful for 
	 * scenarios where many instances of the one thing get called.
	 */

	public static void main(String[] args) {
		EngineFlyweightFactory eff = new EngineFlyweightFactory();
		
		DiagnosticTool tool = new EngineDiagnosticTool();
		
		Engine standard1 = eff.getStandardEngine(1300);
		standard1.diagnose(tool);
		
		Engine standard2 = eff.getStandardEngine(1300);
		standard2.diagnose(tool);
		
		Engine standard3 = eff.getStandardEngine(1300);
		standard3.diagnose(tool);
		
		Engine standard4 = eff.getTurboEngine(1600);
		standard4.diagnose(tool);
		
		Engine standard5 = eff.getTurboEngine(1600);
		standard5.diagnose(tool);
		
		
	}

}
