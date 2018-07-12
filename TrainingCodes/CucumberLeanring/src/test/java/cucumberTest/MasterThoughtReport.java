package cucumberTest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class MasterThoughtReport {

	public static File reportOutputDirectory = new File("target");
	public static String buildNumber = "1";
	public static String projectName = "cucumberProject";
	public static boolean runWithJenkins = false;
	public static boolean parallelTesting = false;
	public ReportBuilder reportBuilder;
	public Reportable result;
	public Configuration configuration;
	public List<String> jsonFiles;
	
		public void getReport(){
		jsonFiles = new ArrayList<>();
		jsonFiles.add("target/cucumber/cucumber.json");
		//jsonFiles.add("cucumber-report-2.json");
		configuration = new Configuration(reportOutputDirectory, projectName);
		// optional configuration
		configuration.setParallelTesting(parallelTesting);
		configuration.setRunWithJenkins(runWithJenkins);
		configuration.setBuildNumber(buildNumber);
		// addidtional metadata presented on main page
		configuration.addClassifications("Platform", "Windows");
		configuration.addClassifications("Browser", "Firefox");
		configuration.addClassifications("Branch", "release/1.0");

		// optionally add metadata presented on main page via properties file
		/*List<String> classificationFiles = new ArrayList<>();
		classificationFiles.add("properties-1.properties");
		classificationFiles.add("properties-2.properties");
		configuration.addClassificationFiles(classificationFiles);
		configuration.addClassifications(name, value);*/
		
		
	
		reportBuilder = new ReportBuilder(jsonFiles, configuration);
		result = reportBuilder.generateReports();
		}
}
