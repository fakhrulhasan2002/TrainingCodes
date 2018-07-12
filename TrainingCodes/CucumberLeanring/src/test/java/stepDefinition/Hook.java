package stepDefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class Hook {
	
	@Before
	public void setup(){
		
		
		
	}
	@After
	public void teardown(){
		/*reportBuilder = new ReportBuilder(jsonFiles, configuration);
		result = reportBuilder.generateReports();*/
	}
}
