$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/featurefiles/comments.feature");
formatter.feature({
  "name": "Getting comments details and verifying them",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify the user details with his name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I set valid GET users service api end point \"EndPoint\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I should see valid response code",
  "keyword": "Then "
});
formatter.step({
  "name": "I should see \"\u003cname\u003e\" and \"\u003cid\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "id"
      ]
    },
    {
      "cells": [
        "odio adipisci rerum aut animi",
        "4"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the user details with his name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I set valid GET users service api end point \"EndPoint\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinations.StepValidationTypiCode.i_set_valid_GET_users_service_api_end_point(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see valid response code",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinations.StepValidationTypiCode.i_should_see_valid_response_code()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"odio adipisci rerum aut animi\" and \"4\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepdefinations.StepValidationTypiCode.i_should_see_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/com/featurefiles/posts.feature");
formatter.feature({
  "name": "Getting Posts details and verifying them",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify the user posts details with his id",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I set valid GET users service api end point \"posts_EndPoint\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I should see valid response code",
  "keyword": "Then "
});
formatter.step({
  "name": "I should see title \"\u003ctitle\u003e\" and \"\u003cid\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "title",
        "id"
      ]
    },
    {
      "cells": [
        "eum et est occaecati",
        "4"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the user posts details with his id",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I set valid GET users service api end point \"posts_EndPoint\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinations.StepValidationTypiCode.i_set_valid_GET_users_service_api_end_point(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see valid response code",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinations.StepValidationTypiCode.i_should_see_valid_response_code()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see title \"eum et est occaecati\" and \"4\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepdefinations.StepValidationTypiCode.i_should_see_title_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/com/featurefiles/users.feature");
formatter.feature({
  "name": "Getting users details and verifying them",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify the user details with his name",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I set valid GET users service api end point \"users_EndPoint\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinations.StepValidationTypiCode.i_set_valid_GET_users_service_api_end_point(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see valid response code",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinations.StepValidationTypiCode.i_should_see_valid_response_code()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the username \"Bret\" in response",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepdefinations.StepValidationTypiCode.i_should_see_the_username_in_response(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should verify address details",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinations.StepValidationTypiCode.i_should_verify_address_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should verify company details",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepdefinations.StepValidationTypiCode.i_should_verify_company_details()"
});
formatter.result({
  "status": "passed"
});
});