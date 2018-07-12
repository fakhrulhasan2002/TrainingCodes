package cucumberTest;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
//import cucumber.api.junit.Cucumber;




//@RunWith(Cucumber.class)
@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
		jsonReport="/target/cucumber/cucumber.json",
		//retryCount=3,
		detailedReport=true,
		overviewReport=true,
		//customTemplatesPath = "templates/overview.ftlh",
		coverageReport=true,
		detailedAggregatedReport=true,
		jsonUsageReport="/target/cucumber/cucumber-usage.json",
		usageReport=true,
		//benchmarkReport=true,
		//benchmarkReportConfig="target/cucumber/benchmarkReport-Config.json",
		//threadsCount=3,
		toPDF=true,
		pdfPageSize = "auto",
		includeCoverageTags={"@tag1,@tag2"},
		//excludeCoverageTags={""},
		outputFolder="/target/cucumber/",
		//outputFolder = "${user.dir}/DATE(dd-MM-yyyy)",
        //reportPrefix = "results-${user}",
        //screenShotLocation="target/cucumber/",
        screenShotSize="300px",
        systemInfoReport=true
        //,
        //consolidatedReport=true,
       // consolidatedReportConfig="target/cucumber/consolidateReport_config.json",
       // knownErrorsReport=true,
       // knownErrorsConfig="target/cucumber/knownError_config.json",
       // featureMapReport=true,
       // featureMapConfig="target/cucumber/featureMap_config.json",
      //  breakdownReport=true,
      //  breakdownConfig = "target/cucumber/breakdown_config.json"
        //,
       // overviewChartsReport=true,
      //  featureOverviewChart=true
        
		)
@CucumberOptions(
		//features = "Feature/LogIn_Test.feature",
		features = "Feature/",
		glue = {"stepDefinition"},
		plugin={"pretty:STDOUT","pretty",
				"json:target/cucumber-json-report.json", 
				"html:cucumberLearning/html",
				"json:target/cucumber/cucumber-usage.json",
				"json:target/cucumber/cucumber-result.xml",
				"rerun:target/cucumber/rerun.txt"
				},
		format={"pretty:target/pretty"},
		tags={"~@tag"}
		)

public class TestRunners {
/*@After
	public static void teardownMain(){
		
	MasterThoughtReport mt= new MasterThoughtReport();
	mt.buildNumber="20";
	mt.getReport();
	
	}
@AfterClass
public static void teardownMainClass() throws Exception{
	
	CucumberResultsOverview results = new CucumberResultsOverview();
	results.setOutputDirectory("target/cucumber/");
	results.setOutputName("target/cucumber/cucumber-resultsOverview.html");
	results.setSourceFile("target/cucumber/cucumber.json");
	results.executeFeaturesOverviewReport();
	ConsolidateReport cr= new ConsolidateReport();
    cr.main(null);
	CucumberUsageReporting report = new CucumberUsageReporting();
	report.setOutputDirectory("target/cucumber/");
	
	report.setJsonUsageFile("target/cucumber/cucumber-usage.json");
	report.executeReport();
	
}*/
	@AfterClass
    public static void generateReport() throws IOException, InterruptedException{
		
		
		String curDir=System.getProperty("user.dir");
		String source = curDir+"\\target\\cucumber-json-report.json";
		String target=curDir+"\\target\\cucumber-json-report.json";
		String srcEncoding = "ANSI";
		String tgtEncoding="UTF-8";
		FileInputStream fis = new FileInputStream(source);
        InputStreamReader isr = new InputStreamReader(fis);//, "ANSI");
        Reader in = new BufferedReader(isr);
        FileOutputStream fos = new FileOutputStream(target);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        Writer out = new BufferedWriter(osw);

        int ch;
        while ((ch = in.read()) > -1) {
            out.write(ch);
        }

        out.close();
        in.close();	
		
		Thread.sleep(4000);
       File reportOutputDirectory = new File(curDir+"\\target\\cucumber\\");
       List<String> jsonFiles = new ArrayList<>();
       //jsonFiles.add(curDir+"\\target\\cucumber\\cucumber-json-report.json");
       //jsonFiles.add(curDir+"\\target\\*.json");
       jsonFiles.add(curDir+"\\target\\cucumber-json-report.json");
       System.out.print(jsonFiles);
       String jenkinsBasePath = "";
       String buildNumber = "100";
       String projectName = "Cucumber Project";
       boolean skippedFails = true;
       boolean pendingFails = false;
       boolean undefinedFails = true;
       boolean missingFails = true;
       boolean runWithJenkins = false;
       boolean parallelTesting = false;

       Configuration configuration = new Configuration(reportOutputDirectory, projectName);
       // optionally only if you need
       //configuration.setStatusFlags(skippedFails, pendingFails, undefinedFails, missingFails);
       configuration.setParallelTesting(parallelTesting);
       //configuration.setJenkinsBasePath(jenkinsBasePath);
       configuration.setRunWithJenkins(runWithJenkins);
       configuration.setBuildNumber(buildNumber);
       configuration.addClassifications("ABCD", "XYZZZ");
       configuration.addClassifications("Platform", "Windows");
       configuration.addClassifications("Browser", "Firefox");
       configuration.addClassifications("Branch", "release/1.0");
       ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
       reportBuilder.generateReports();
   }
}
