package cucumberTest;

import org.junit.runner.RunWith;


import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
		jsonReport="C:\\Users\\fakhr\\eclipse-workspace\\ExtendedCucumberProject/cucumber/cucumber-usage.json",
		jsonUsageReport="C:\\Users\\fakhr\\eclipse-workspace\\ExtendedCucumberProject/cucumber/cucumber-usage.json",
		
		detailedReport=true,
		overviewReport=true,
		coverageReport=true,
		detailedAggregatedReport=true,
		overviewChartsReport=true,
		featureOverviewChart=true,
		
		toPDF=false,
		pdfPageSize = "auto",
		includeCoverageTags={"@tag1,@tag2"},
		//excludeCoverageTags={""},
		//outputFolder="./target",
		/*outputFolder = "${user.dir}/target/DATE(dd-MM-yyyy)",*/
		outputFolder = "./target/DATE(dd-MM-yyyy)",
        //reportPrefix = "results-${user}",
        screenShotLocation="./target/screenshot",
        screenShotSize="300px",
        systemInfoReport=true
        //usageReport=true,
        //benchmarkReport=true,
        //benchmarkReportConfig="C:\\Users\\fakhr\\eclipse-workspace\\ExtendedCucumberProject/cucumber/cucumber-usage.json",
        //threadsCount=3,
        //retryCount=3,
        //consolidatedReport=true
        //consolidatedReportConfig="C:\\Users\\fakhr\\eclipse-workspace\\ExtendedCucumberProject/cucumber/cucumber-usage.json",
        //knownErrorsReport=true,
        //knownErrorsConfig="C:\\Users\\fakhr\\eclipse-workspace\\ExtendedCucumberProject/cucumber/cucumber-usage.json",
        
        //featureMapConfig="C:\\Users\\fakhr\\eclipse-workspace\\ExtendedCucumberProject/cucumber/cucumber-usage.json",
        //breakdownReport=true,
        //breakdownConfig ="C:\\Users\\fakhr\\eclipse-workspace\\ExtendedCucumberProject/cucumber/cucumber-usage.json",
        //featureMapReport=true
         
        
		)
@CucumberOptions(
		//features = "Feature/LogIn_Test.feature",
		features = "Feature/LogIn_Test.feature",
		glue = {"stepDefinition"},
		plugin={"pretty:STDOUT","pretty",
				"html:output/cucumber.html",
				"json:cucumber/cucumber-usage.json",
				//"json:cucumber/cucumber.json",
				"junit:output/cucumber-result.xml",
				"rerun:output/rerun.txt"
				},
		format={"pretty:target/pretty"},
		tags={"~@tag"}
		)

public class TestRunner {

}
