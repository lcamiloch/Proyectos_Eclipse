$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/BusquedaGoogle.feature");
formatter.feature({
  "name": "Google search",
  "description": "  I want to search a word in Google",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "successful search in google",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Arthur am on the Google home page",
  "keyword": "Given "
});
formatter.match({
  "location": "BuscarEnGoogleStepDefinition.arthur_am_on_the_Google_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he does the search",
  "keyword": "When "
});
formatter.match({
  "location": "BuscarEnGoogleStepDefinition.he_does_the_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he validates the result success.",
  "keyword": "Then "
});
formatter.match({
  "location": "BuscarEnGoogleStepDefinition.he_validates_the_result_success()"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
});