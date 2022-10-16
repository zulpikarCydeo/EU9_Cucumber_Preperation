package cydeo.step_definitions;

import io.cucumber.java.en.*;

public class TestStepDefinition {

    @Given("User go to print page")
    public void user_go_to_print_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am going to print page");
    }
    @When("User enters what he wants to print")
    public void user_enters_what_he_wants_to_print() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am entering the document I want to print");
    }


    @Then("the result should be printed")
    public void the_result_should_be_printed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("The result is printed");
    }

    @Given("run background for one time")
    public void runBackgroundForOneTime() {
        System.out.println("run background for one time");
    }
}
