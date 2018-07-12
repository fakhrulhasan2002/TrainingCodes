<#assign Math=statics['java.lang.Math'] >
<html>
<head>
	<title>${title}</title>
	<style type="text/css">
.passed {background-color:lightgreen;font-weight:bold;color:darkgreen}
.skipped {background-color:silver;font-weight:bold;color:darkgray}
.failed {background-color:tomato;font-weight:bold;color:darkred}
.undefined {background-color:gold;font-weight:bold;color:goldenrod}
.known {background-color:goldenrod;font-weight:bold;color:darkred}
	</style>
</head>
<body>
<table>
	<tr><th></th><th>Passed</th><th>Failed</th><th>Known</th><th>Undefined</th><th>Total</th><th>%Passed</th></tr>
	<tr><th>Features</th>
		<td class="passed" id="features_passed">${overallStats.getFeaturesPassed()}</td>
		<td class="failed" id="features_failed">${overallStats.getFeaturesFailed()}</td>
		<td class="known" id="features_known">${overallStats.getFeaturesKnown()}</td>
		<td class="undefined" id="features_undefined">${overallStats.getFeaturesUndefined()}</td>
		<td id="features_total">${overallStats.getFeaturesTotal()}</td>
		<td id="features_rate">
			<#if stats.getFeaturesTotal() == 0>
			NaN
			<#else>
				#{100 * (stats.getFeaturesPassed() + stats.getFeaturesKnown()) / stats.getFeaturesTotal() ;M0}%
			</#if>
		</td>
	</tr>
	<tr><th>Scenarios</th>
		<td class="passed" id="scenarios_passed">${overallStats.getScenariosPassed()}</td>
		<td class="failed" id="scenarios_failed">${overallStats.getScenariosFailed()}</td>
		<td class="known" id="scenarios_known">${overallStats.getScenariosKnown()}</td>
		<td class="undefined" id="scenarios_undefined">${overallStats.getScenariosUndefined()}</td>
		<td id="scenarios_total">${overallStats.getScenariosTotal()}</td>
		<td id="scenarios_rate">
			<#if stats.getScenariosTotal() == 0>
			NaN
			<#else>
				#{100 * (stats.getScenariosPassed() + stats.getScenariosKnown()) / stats.getScenariosTotal() ;M0}%
			</#if>
		</td>
	</tr>
	<tr><th>Steps</th>
		<td class="passed" id="steps_passed">${overallStats.getStepsPassed()}</td>
		<td class="failed" id="steps_failed">${overallStats.getStepsFailed()}</td>
		<td class="known" id="steps_known">${overallStats.getStepsKnown()}</td>
		<td class="undefined" id="steps_undefined">${overallStats.getStepsUndefined()}</td>
		<td id="steps_total">${overallStats.getStepsTotal()}</td>
		<td id="steps_rate">
			<#if stats.getStepsTotal() == 0>
			NaN
			<#else>
				#{100 * (overallStats.getStepsPassed() + overallStats.getStepsKnown()) / overallStats.getStepsTotal() ;M0}%
			</#if>
		</td>
	</tr>
</table>
<div><b>Overall Duration: ${(overallStats.overallDuration/3600)?string["0"]}h ${((overallStats.overallDuration % 3600) / 60)?string["00"]}m ${((overallStats.overallDuration % 3600) % 60)?string["00"]}s</b></div>

</body>
</html>