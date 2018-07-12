package cucumberTest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.plexus.util.DirectoryScanner;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class ConsolidateReport {
	private String[] json;
	private static String[] pgfileIncludePattern;
	private static String buildNumber;
	private static List<String> jsonFilesToProcess;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		File reportOutputDirectory=new File("");
		File jsonreportOutputDirectory=new File("");
		String projectName="DFDVFADV";
		pgfileIncludePattern=new String[]{"**/*.json"};
		jsonFilesToProcess = genericFindFiles(jsonreportOutputDirectory,pgfileIncludePattern);
		Configuration configuration = new Configuration(reportOutputDirectory, projectName);
		boolean parallelTesting=false;
		// optional configuration
		configuration.setParallelTesting(parallelTesting);
		boolean runWithJenkins=false;
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
		
		
	
		ReportBuilder reportBuilder = new ReportBuilder(jsonFilesToProcess, configuration);
		Reportable result = reportBuilder.generateReports();
	}
	private static List<String> genericFindFiles(File targetDirectory, String[] fileIncludePattern2) {
		// TODO Auto-generated method stub
		DirectoryScanner scanner=new DirectoryScanner();
		scanner.setIncludes(fileIncludePattern2);
		scanner.setBasedir(targetDirectory);
		scanner.scan();
		String[] files = scanner.getIncludedFiles();
		return fullPathtoFiles(files, targetDirectory);
	}
	private static List<String> fullPathtoFiles(String[] files, File targetDirectory) {
		// TODO Auto-generated method stub
		List<String> fullPathList = new ArrayList<>();
		for(String file:files)
			fullPathList.add(new File(targetDirectory,  file).getAbsolutePath());
		return fullPathList;
	}

}
