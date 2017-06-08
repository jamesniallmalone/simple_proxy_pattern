package proxy.diagnostics;

public class EngineDiagnosticTool implements DiagnosticTool {

	@Override
	public String runDiagnostics(Object obj) {
		System.out.println("Start engine diagnostic tool for " + obj.toString());
		
		try{
			Thread.sleep(5000);
			return "Engine diagnosis complete";
		} catch(InterruptedException ex){
			return "Engine diagnosis failed.";
		}
	}

}
