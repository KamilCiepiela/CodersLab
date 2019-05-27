$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/form_feature_test.feature");
formatter.feature({
  "name": "Form Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "a new user can register on the page http://aavtrain.com/",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "there is browser opened with page \"http://aavtrain.com/\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on registration button",
  "keyword": "When "
});
formatter.step({
  "name": "user is on registration page",
  "keyword": "Then "
});
formatter.step({
  "name": "\u003cUser\u003e fills all mandatory fields",
  "keyword": "When "
});
formatter.step({
  "name": "\u003cFields\u003e are taken from table in examples",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Fields",
        "User"
      ]
    },
    {
      "cells": [
        "first_name",
        "Karol"
      ]
    },
    {
      "cells": [
        "last_name",
        "Kowalski"
      ]
    },
    {
      "cells": [
        "email",
        "karol.kowalski@mailinator.com"
      ]
    },
    {
      "cells": [
        "user_name",
        "KKowalski"
      ]
    },
    {
      "cells": [
        "address_1",
        "Prosta\t51"
      ]
    },
    {
      "cells": [
        "city",
        "Warsaw"
      ]
    },
    {
      "cells": [
        "prov",
        "mazowiecki"
      ]
    },
    {
      "cells": [
        "zip",
        "00-020"
      ]
    },
    {
      "cells": [
        "password",
        "Pass123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "a new user can register on the page http://aavtrain.com/",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "there is browser opened with page \"http://aavtrain.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.thereIsBrowserOpenedWithPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on registration button",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClicksOnRegistrationButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on registration page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnRegistrationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Karol fills all mandatory fields",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userFillsAllMandatoryFields(String\u003e)"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Could not convert arguments for step [(.*) fills all mandatory fields] defined at \u0027step_definitions.MyStepdefs.userFillsAllMandatoryFields(String\u003e) in file:/C:/Users/Kamil/Desktop/Tester_Automatyczny/03_Repos/CodersLab/KursCucumber/target/test-classes/\u0027.\nThe details are in the stacktrace below.\r\n\tat cucumber.runner.PickleStepDefinitionMatch.couldNotConvertArguments(PickleStepDefinitionMatch.java:69)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:46)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:44)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:124)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:133)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\nCaused by: io.cucumber.cucumberexpressions.CucumberExpressionException: ParameterType {anonymous} failed to transform [Karol] to java.util.List\u003cjava.lang.String\u003e\r\n\tat io.cucumber.cucumberexpressions.ParameterType.transform(ParameterType.java:190)\r\n\tat io.cucumber.cucumberexpressions.Argument.getValue(Argument.java:64)\r\n\tat io.cucumber.stepexpression.ExpressionArgument.getValue(ExpressionArgument.java:15)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:41)\r\n\t... 29 more\r\nCaused by: java.lang.IllegalArgumentException: Can\u0027t transform \u0027Karol\u0027 to java.util.List\u003cjava.lang.String\u003e\nBuiltInParameterTransformer only supports a limited number of class types\nConsider using a different object mapper or register a parameter type for java.util.List\u003cjava.lang.String\u003e\r\n\tat io.cucumber.cucumberexpressions.BuiltInParameterTransformer.createIllegalArgumentException(BuiltInParameterTransformer.java:84)\r\n\tat io.cucumber.cucumberexpressions.BuiltInParameterTransformer.transform(BuiltInParameterTransformer.java:23)\r\n\tat io.cucumber.cucumberexpressions.ObjectMapperTransformer.transform(ObjectMapperTransformer.java:18)\r\n\tat io.cucumber.cucumberexpressions.ParameterType$TransformerAdaptor.transform(ParameterType.java:215)\r\n\tat io.cucumber.cucumberexpressions.ParameterType.transform(ParameterType.java:186)\r\n\t... 32 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "first_name are taken from table in examples",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "a new user can register on the page http://aavtrain.com/",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "there is browser opened with page \"http://aavtrain.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.thereIsBrowserOpenedWithPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on registration button",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClicksOnRegistrationButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on registration page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnRegistrationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Kowalski fills all mandatory fields",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userFillsAllMandatoryFields(String\u003e)"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Could not convert arguments for step [(.*) fills all mandatory fields] defined at \u0027step_definitions.MyStepdefs.userFillsAllMandatoryFields(String\u003e) in file:/C:/Users/Kamil/Desktop/Tester_Automatyczny/03_Repos/CodersLab/KursCucumber/target/test-classes/\u0027.\nThe details are in the stacktrace below.\r\n\tat cucumber.runner.PickleStepDefinitionMatch.couldNotConvertArguments(PickleStepDefinitionMatch.java:69)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:46)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:44)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:124)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:133)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\nCaused by: io.cucumber.cucumberexpressions.CucumberExpressionException: ParameterType {anonymous} failed to transform [Kowalski] to java.util.List\u003cjava.lang.String\u003e\r\n\tat io.cucumber.cucumberexpressions.ParameterType.transform(ParameterType.java:190)\r\n\tat io.cucumber.cucumberexpressions.Argument.getValue(Argument.java:64)\r\n\tat io.cucumber.stepexpression.ExpressionArgument.getValue(ExpressionArgument.java:15)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:41)\r\n\t... 29 more\r\nCaused by: java.lang.IllegalArgumentException: Can\u0027t transform \u0027Kowalski\u0027 to java.util.List\u003cjava.lang.String\u003e\nBuiltInParameterTransformer only supports a limited number of class types\nConsider using a different object mapper or register a parameter type for java.util.List\u003cjava.lang.String\u003e\r\n\tat io.cucumber.cucumberexpressions.BuiltInParameterTransformer.createIllegalArgumentException(BuiltInParameterTransformer.java:84)\r\n\tat io.cucumber.cucumberexpressions.BuiltInParameterTransformer.transform(BuiltInParameterTransformer.java:23)\r\n\tat io.cucumber.cucumberexpressions.ObjectMapperTransformer.transform(ObjectMapperTransformer.java:18)\r\n\tat io.cucumber.cucumberexpressions.ParameterType$TransformerAdaptor.transform(ParameterType.java:215)\r\n\tat io.cucumber.cucumberexpressions.ParameterType.transform(ParameterType.java:186)\r\n\t... 32 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "last_name are taken from table in examples",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "a new user can register on the page http://aavtrain.com/",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "there is browser opened with page \"http://aavtrain.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.thereIsBrowserOpenedWithPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on registration button",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClicksOnRegistrationButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on registration page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnRegistrationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "karol.kowalski@mailinator.com fills all mandatory fields",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userFillsAllMandatoryFields(String\u003e)"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Could not convert arguments for step [(.*) fills all mandatory fields] defined at \u0027step_definitions.MyStepdefs.userFillsAllMandatoryFields(String\u003e) in file:/C:/Users/Kamil/Desktop/Tester_Automatyczny/03_Repos/CodersLab/KursCucumber/target/test-classes/\u0027.\nThe details are in the stacktrace below.\r\n\tat cucumber.runner.PickleStepDefinitionMatch.couldNotConvertArguments(PickleStepDefinitionMatch.java:69)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:46)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:44)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:124)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:133)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\nCaused by: io.cucumber.cucumberexpressions.CucumberExpressionException: ParameterType {anonymous} failed to transform [karol.kowalski@mailinator.com] to java.util.List\u003cjava.lang.String\u003e\r\n\tat io.cucumber.cucumberexpressions.ParameterType.transform(ParameterType.java:190)\r\n\tat io.cucumber.cucumberexpressions.Argument.getValue(Argument.java:64)\r\n\tat io.cucumber.stepexpression.ExpressionArgument.getValue(ExpressionArgument.java:15)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:41)\r\n\t... 29 more\r\nCaused by: java.lang.IllegalArgumentException: Can\u0027t transform \u0027karol.kowalski@mailinator.com\u0027 to java.util.List\u003cjava.lang.String\u003e\nBuiltInParameterTransformer only supports a limited number of class types\nConsider using a different object mapper or register a parameter type for java.util.List\u003cjava.lang.String\u003e\r\n\tat io.cucumber.cucumberexpressions.BuiltInParameterTransformer.createIllegalArgumentException(BuiltInParameterTransformer.java:84)\r\n\tat io.cucumber.cucumberexpressions.BuiltInParameterTransformer.transform(BuiltInParameterTransformer.java:23)\r\n\tat io.cucumber.cucumberexpressions.ObjectMapperTransformer.transform(ObjectMapperTransformer.java:18)\r\n\tat io.cucumber.cucumberexpressions.ParameterType$TransformerAdaptor.transform(ParameterType.java:215)\r\n\tat io.cucumber.cucumberexpressions.ParameterType.transform(ParameterType.java:186)\r\n\t... 32 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "email are taken from table in examples",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "a new user can register on the page http://aavtrain.com/",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "there is browser opened with page \"http://aavtrain.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.thereIsBrowserOpenedWithPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on registration button",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClicksOnRegistrationButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on registration page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnRegistrationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "KKowalski fills all mandatory fields",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userFillsAllMandatoryFields(String\u003e)"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Could not convert arguments for step [(.*) fills all mandatory fields] defined at \u0027step_definitions.MyStepdefs.userFillsAllMandatoryFields(String\u003e) in file:/C:/Users/Kamil/Desktop/Tester_Automatyczny/03_Repos/CodersLab/KursCucumber/target/test-classes/\u0027.\nThe details are in the stacktrace below.\r\n\tat cucumber.runner.PickleStepDefinitionMatch.couldNotConvertArguments(PickleStepDefinitionMatch.java:69)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:46)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:44)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:124)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:133)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\nCaused by: io.cucumber.cucumberexpressions.CucumberExpressionException: ParameterType {anonymous} failed to transform [KKowalski] to java.util.List\u003cjava.lang.String\u003e\r\n\tat io.cucumber.cucumberexpressions.ParameterType.transform(ParameterType.java:190)\r\n\tat io.cucumber.cucumberexpressions.Argument.getValue(Argument.java:64)\r\n\tat io.cucumber.stepexpression.ExpressionArgument.getValue(ExpressionArgument.java:15)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:41)\r\n\t... 29 more\r\nCaused by: java.lang.IllegalArgumentException: Can\u0027t transform \u0027KKowalski\u0027 to java.util.List\u003cjava.lang.String\u003e\nBuiltInParameterTransformer only supports a limited number of class types\nConsider using a different object mapper or register a parameter type for java.util.List\u003cjava.lang.String\u003e\r\n\tat io.cucumber.cucumberexpressions.BuiltInParameterTransformer.createIllegalArgumentException(BuiltInParameterTransformer.java:84)\r\n\tat io.cucumber.cucumberexpressions.BuiltInParameterTransformer.transform(BuiltInParameterTransformer.java:23)\r\n\tat io.cucumber.cucumberexpressions.ObjectMapperTransformer.transform(ObjectMapperTransformer.java:18)\r\n\tat io.cucumber.cucumberexpressions.ParameterType$TransformerAdaptor.transform(ParameterType.java:215)\r\n\tat io.cucumber.cucumberexpressions.ParameterType.transform(ParameterType.java:186)\r\n\t... 32 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user_name are taken from table in examples",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "a new user can register on the page http://aavtrain.com/",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "there is browser opened with page \"http://aavtrain.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.thereIsBrowserOpenedWithPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on registration button",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClicksOnRegistrationButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on registration page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnRegistrationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Prosta\t51 fills all mandatory fields",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userFillsAllMandatoryFields(String\u003e)"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Could not convert arguments for step [(.*) fills all mandatory fields] defined at \u0027step_definitions.MyStepdefs.userFillsAllMandatoryFields(String\u003e) in file:/C:/Users/Kamil/Desktop/Tester_Automatyczny/03_Repos/CodersLab/KursCucumber/target/test-classes/\u0027.\nThe details are in the stacktrace below.\r\n\tat cucumber.runner.PickleStepDefinitionMatch.couldNotConvertArguments(PickleStepDefinitionMatch.java:69)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:46)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:44)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:124)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:133)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\nCaused by: io.cucumber.cucumberexpressions.CucumberExpressionException: ParameterType {anonymous} failed to transform [Prosta\t51] to java.util.List\u003cjava.lang.String\u003e\r\n\tat io.cucumber.cucumberexpressions.ParameterType.transform(ParameterType.java:190)\r\n\tat io.cucumber.cucumberexpressions.Argument.getValue(Argument.java:64)\r\n\tat io.cucumber.stepexpression.ExpressionArgument.getValue(ExpressionArgument.java:15)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:41)\r\n\t... 29 more\r\nCaused by: java.lang.IllegalArgumentException: Can\u0027t transform \u0027Prosta\t51\u0027 to java.util.List\u003cjava.lang.String\u003e\nBuiltInParameterTransformer only supports a limited number of class types\nConsider using a different object mapper or register a parameter type for java.util.List\u003cjava.lang.String\u003e\r\n\tat io.cucumber.cucumberexpressions.BuiltInParameterTransformer.createIllegalArgumentException(BuiltInParameterTransformer.java:84)\r\n\tat io.cucumber.cucumberexpressions.BuiltInParameterTransformer.transform(BuiltInParameterTransformer.java:23)\r\n\tat io.cucumber.cucumberexpressions.ObjectMapperTransformer.transform(ObjectMapperTransformer.java:18)\r\n\tat io.cucumber.cucumberexpressions.ParameterType$TransformerAdaptor.transform(ParameterType.java:215)\r\n\tat io.cucumber.cucumberexpressions.ParameterType.transform(ParameterType.java:186)\r\n\t... 32 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "address_1 are taken from table in examples",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "a new user can register on the page http://aavtrain.com/",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "there is browser opened with page \"http://aavtrain.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.thereIsBrowserOpenedWithPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on registration button",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClicksOnRegistrationButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on registration page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnRegistrationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Warsaw fills all mandatory fields",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userFillsAllMandatoryFields(String\u003e)"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Could not convert arguments for step [(.*) fills all mandatory fields] defined at \u0027step_definitions.MyStepdefs.userFillsAllMandatoryFields(String\u003e) in file:/C:/Users/Kamil/Desktop/Tester_Automatyczny/03_Repos/CodersLab/KursCucumber/target/test-classes/\u0027.\nThe details are in the stacktrace below.\r\n\tat cucumber.runner.PickleStepDefinitionMatch.couldNotConvertArguments(PickleStepDefinitionMatch.java:69)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:46)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:44)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:124)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:133)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\nCaused by: io.cucumber.cucumberexpressions.CucumberExpressionException: ParameterType {anonymous} failed to transform [Warsaw] to java.util.List\u003cjava.lang.String\u003e\r\n\tat io.cucumber.cucumberexpressions.ParameterType.transform(ParameterType.java:190)\r\n\tat io.cucumber.cucumberexpressions.Argument.getValue(Argument.java:64)\r\n\tat io.cucumber.stepexpression.ExpressionArgument.getValue(ExpressionArgument.java:15)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:41)\r\n\t... 29 more\r\nCaused by: java.lang.IllegalArgumentException: Can\u0027t transform \u0027Warsaw\u0027 to java.util.List\u003cjava.lang.String\u003e\nBuiltInParameterTransformer only supports a limited number of class types\nConsider using a different object mapper or register a parameter type for java.util.List\u003cjava.lang.String\u003e\r\n\tat io.cucumber.cucumberexpressions.BuiltInParameterTransformer.createIllegalArgumentException(BuiltInParameterTransformer.java:84)\r\n\tat io.cucumber.cucumberexpressions.BuiltInParameterTransformer.transform(BuiltInParameterTransformer.java:23)\r\n\tat io.cucumber.cucumberexpressions.ObjectMapperTransformer.transform(ObjectMapperTransformer.java:18)\r\n\tat io.cucumber.cucumberexpressions.ParameterType$TransformerAdaptor.transform(ParameterType.java:215)\r\n\tat io.cucumber.cucumberexpressions.ParameterType.transform(ParameterType.java:186)\r\n\t... 32 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "city are taken from table in examples",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "a new user can register on the page http://aavtrain.com/",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "there is browser opened with page \"http://aavtrain.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.thereIsBrowserOpenedWithPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on registration button",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClicksOnRegistrationButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on registration page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnRegistrationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "mazowiecki fills all mandatory fields",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userFillsAllMandatoryFields(String\u003e)"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Could not convert arguments for step [(.*) fills all mandatory fields] defined at \u0027step_definitions.MyStepdefs.userFillsAllMandatoryFields(String\u003e) in file:/C:/Users/Kamil/Desktop/Tester_Automatyczny/03_Repos/CodersLab/KursCucumber/target/test-classes/\u0027.\nThe details are in the stacktrace below.\r\n\tat cucumber.runner.PickleStepDefinitionMatch.couldNotConvertArguments(PickleStepDefinitionMatch.java:69)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:46)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:44)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:124)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:133)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\nCaused by: io.cucumber.cucumberexpressions.CucumberExpressionException: ParameterType {anonymous} failed to transform [mazowiecki] to java.util.List\u003cjava.lang.String\u003e\r\n\tat io.cucumber.cucumberexpressions.ParameterType.transform(ParameterType.java:190)\r\n\tat io.cucumber.cucumberexpressions.Argument.getValue(Argument.java:64)\r\n\tat io.cucumber.stepexpression.ExpressionArgument.getValue(ExpressionArgument.java:15)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:41)\r\n\t... 29 more\r\nCaused by: java.lang.IllegalArgumentException: Can\u0027t transform \u0027mazowiecki\u0027 to java.util.List\u003cjava.lang.String\u003e\nBuiltInParameterTransformer only supports a limited number of class types\nConsider using a different object mapper or register a parameter type for java.util.List\u003cjava.lang.String\u003e\r\n\tat io.cucumber.cucumberexpressions.BuiltInParameterTransformer.createIllegalArgumentException(BuiltInParameterTransformer.java:84)\r\n\tat io.cucumber.cucumberexpressions.BuiltInParameterTransformer.transform(BuiltInParameterTransformer.java:23)\r\n\tat io.cucumber.cucumberexpressions.ObjectMapperTransformer.transform(ObjectMapperTransformer.java:18)\r\n\tat io.cucumber.cucumberexpressions.ParameterType$TransformerAdaptor.transform(ParameterType.java:215)\r\n\tat io.cucumber.cucumberexpressions.ParameterType.transform(ParameterType.java:186)\r\n\t... 32 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "prov are taken from table in examples",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "a new user can register on the page http://aavtrain.com/",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "there is browser opened with page \"http://aavtrain.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.thereIsBrowserOpenedWithPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on registration button",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClicksOnRegistrationButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on registration page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnRegistrationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "00-020 fills all mandatory fields",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userFillsAllMandatoryFields(String\u003e)"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Could not convert arguments for step [(.*) fills all mandatory fields] defined at \u0027step_definitions.MyStepdefs.userFillsAllMandatoryFields(String\u003e) in file:/C:/Users/Kamil/Desktop/Tester_Automatyczny/03_Repos/CodersLab/KursCucumber/target/test-classes/\u0027.\nThe details are in the stacktrace below.\r\n\tat cucumber.runner.PickleStepDefinitionMatch.couldNotConvertArguments(PickleStepDefinitionMatch.java:69)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:46)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:44)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:124)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:133)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\nCaused by: io.cucumber.cucumberexpressions.CucumberExpressionException: ParameterType {anonymous} failed to transform [00-020] to java.util.List\u003cjava.lang.String\u003e\r\n\tat io.cucumber.cucumberexpressions.ParameterType.transform(ParameterType.java:190)\r\n\tat io.cucumber.cucumberexpressions.Argument.getValue(Argument.java:64)\r\n\tat io.cucumber.stepexpression.ExpressionArgument.getValue(ExpressionArgument.java:15)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:41)\r\n\t... 29 more\r\nCaused by: java.lang.IllegalArgumentException: Can\u0027t transform \u002700-020\u0027 to java.util.List\u003cjava.lang.String\u003e\nBuiltInParameterTransformer only supports a limited number of class types\nConsider using a different object mapper or register a parameter type for java.util.List\u003cjava.lang.String\u003e\r\n\tat io.cucumber.cucumberexpressions.BuiltInParameterTransformer.createIllegalArgumentException(BuiltInParameterTransformer.java:84)\r\n\tat io.cucumber.cucumberexpressions.BuiltInParameterTransformer.transform(BuiltInParameterTransformer.java:23)\r\n\tat io.cucumber.cucumberexpressions.ObjectMapperTransformer.transform(ObjectMapperTransformer.java:18)\r\n\tat io.cucumber.cucumberexpressions.ParameterType$TransformerAdaptor.transform(ParameterType.java:215)\r\n\tat io.cucumber.cucumberexpressions.ParameterType.transform(ParameterType.java:186)\r\n\t... 32 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "zip are taken from table in examples",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "a new user can register on the page http://aavtrain.com/",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "there is browser opened with page \"http://aavtrain.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.thereIsBrowserOpenedWithPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on registration button",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClicksOnRegistrationButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on registration page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnRegistrationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Pass123 fills all mandatory fields",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userFillsAllMandatoryFields(String\u003e)"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Could not convert arguments for step [(.*) fills all mandatory fields] defined at \u0027step_definitions.MyStepdefs.userFillsAllMandatoryFields(String\u003e) in file:/C:/Users/Kamil/Desktop/Tester_Automatyczny/03_Repos/CodersLab/KursCucumber/target/test-classes/\u0027.\nThe details are in the stacktrace below.\r\n\tat cucumber.runner.PickleStepDefinitionMatch.couldNotConvertArguments(PickleStepDefinitionMatch.java:69)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:46)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:44)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:124)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:133)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\nCaused by: io.cucumber.cucumberexpressions.CucumberExpressionException: ParameterType {anonymous} failed to transform [Pass123] to java.util.List\u003cjava.lang.String\u003e\r\n\tat io.cucumber.cucumberexpressions.ParameterType.transform(ParameterType.java:190)\r\n\tat io.cucumber.cucumberexpressions.Argument.getValue(Argument.java:64)\r\n\tat io.cucumber.stepexpression.ExpressionArgument.getValue(ExpressionArgument.java:15)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:41)\r\n\t... 29 more\r\nCaused by: java.lang.IllegalArgumentException: Can\u0027t transform \u0027Pass123\u0027 to java.util.List\u003cjava.lang.String\u003e\nBuiltInParameterTransformer only supports a limited number of class types\nConsider using a different object mapper or register a parameter type for java.util.List\u003cjava.lang.String\u003e\r\n\tat io.cucumber.cucumberexpressions.BuiltInParameterTransformer.createIllegalArgumentException(BuiltInParameterTransformer.java:84)\r\n\tat io.cucumber.cucumberexpressions.BuiltInParameterTransformer.transform(BuiltInParameterTransformer.java:23)\r\n\tat io.cucumber.cucumberexpressions.ObjectMapperTransformer.transform(ObjectMapperTransformer.java:18)\r\n\tat io.cucumber.cucumberexpressions.ParameterType$TransformerAdaptor.transform(ParameterType.java:215)\r\n\tat io.cucumber.cucumberexpressions.ParameterType.transform(ParameterType.java:186)\r\n\t... 32 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "password are taken from table in examples",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("src/test/resources/features/google_search.feature");
formatter.feature({
  "name": "Google Search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user can search any keyword in Google",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "an open browser with Google",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.anOpenBrowserWithGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Selenium\" word has been written into input field and submitted",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.wordHasBeenWrittenIntoInputFieldAndSubmitted(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the first result contains \"Selenium\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.theFirstResultContains(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/features/training.feature");
formatter.feature({
  "name": "training",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "a test without a purpose",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "something is done",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.somethingIsDone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"sample word\" is printed",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.isPrinted(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "22 is printed correctly",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.isPrintedCorrectly(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "we can use a list as well",
  "rows": [
    {
      "cells": [
        "cat"
      ]
    },
    {
      "cells": [
        "dog"
      ]
    },
    {
      "cells": [
        "lion"
      ]
    }
  ],
  "keyword": "But "
});
formatter.match({
  "location": "MyStepdefs.weCanUseAListAsWell(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "singing",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "people trying singing",
  "keyword": "Given "
});
formatter.step({
  "name": "now \u003cperson\u003e trying",
  "keyword": "When "
});
formatter.step({
  "name": "sings \u003chow\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "how",
        "person"
      ]
    },
    {
      "cells": [
        "ugly",
        "me"
      ]
    },
    {
      "cells": [
        "beautiful",
        "you"
      ]
    }
  ]
});
formatter.scenario({
  "name": "singing",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "people trying singing",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.peopleTryingSinging()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "now me trying",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.nowPersonTrying(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sings ugly",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.singsHow(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "singing",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "people trying singing",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.peopleTryingSinging()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "now you trying",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.nowPersonTrying(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sings beautiful",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.singsHow(String)"
});
formatter.result({
  "status": "passed"
});
});