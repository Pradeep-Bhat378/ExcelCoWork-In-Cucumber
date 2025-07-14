package stepDefination;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.*;

public class Login extends Configuration_Emulator{

	public AndroidDriver driver;
    public  String ApiDemo = "io.appium.android.apis";

	
	@Given("App apk")
	public void app_apk() {
	   
		driver.isAppInstalled(ApiDemo);
		
		driver.activateApp(ApiDemo);
		
	}

	@When("user launch ApiDemo application")
	public void user_launch_api_demo_application() {
	   
	}

	@Then("All module in home page list need to display")
	public void all_module_in_home_page_list_need_to_display() {
	    
	}

	@Then("User click on Accessbility")
	public void user_click_on_accessbility() {
	}

	@Then("{int} Module list need to display")
	public void module_list_need_to_display(Integer int1) {
	    
	}

	@Then("User click on Accessibility node check boxes page need to display")
	public void user_click_on_accessibility_node_check_boxes_page_need_to_display() {
	  
	}

	@Then("validate the enabled and disabled checkboxes")
	public void validate_the_enabled_and_disabled_checkboxes() {
	  
	}

	@Then("Select and unselect checboxes and mention its validation")
	public void select_and_unselect_checboxes_and_mention_its_validation() {
	    
	}

	
}
