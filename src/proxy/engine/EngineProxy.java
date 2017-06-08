package proxy.engine;

import proxy.diagnostics.DiagnosticTool;

public class EngineProxy implements Engine {
	
	private Engine engine;

	public EngineProxy(int size, boolean turbo) {
		engine = (turbo) ? new TurboEngine(size) :  new StandardEngine(size);
	}

	@Override
	public int getSize() {
		return engine.getSize();
	}

	@Override
	public boolean isTurbo() {
		return engine.isTurbo();
	}

	@Override
	public void diagnose(DiagnosticTool tool) {
		//The diagnose function is time consuming. We want to run this as a separate thread.
		
		class runthread implements Runnable{

			@Override
			public void run() {
				System.out.println(tool.runDiagnostics(engine));
			}
			
		}
		
		runthread r = new runthread();
		
		Thread t = new Thread(r);
		t.start();
		

	}

}
