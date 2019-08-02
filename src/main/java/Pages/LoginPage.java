package Pages;

public class LoginPage {

    public final String username="name||Email";
    public final String password="xpath||//input[@name='Password']";
    public final String LoginBtn="xpath||//input[@class='button-1 login-button']";

    //sample xpath
    public final String Incident_tab="xpath||//li[text()='Incidents']";
    public final String New_Incident_tab="xpath||//img[@alt='Create Incident']";
    public final String LogInc_CAL = "xpath||//img[contains(@src,\"calendar.png\")]";
    public final String LogInc_CAL_Year = "xpath||//*[contains(@class,'pika-select pika-select-year')]";
    public final String LogInc_CAL_Month = "xpath||//*[contains(@class,'pika-select pika-select-month')]";
    public final String LogInc_TBL = "xpath||//table[contains(@class,'pika-table')]";
                                            //strong[contains(@class,'tamil-manual-placement_21')]
    public final String LogInc_BTN_Day = "tagname||button";
    public final String LogInc_Time_Hour_DD = "name||hour";
    public final String LogInc_Time_Min_DD = "name||minute";
    public final String What_Happen="xpath||//td[contains(text(),'What Happened')]/following-sibling::td//li[@class='bit-input']//input";
    public final String What_Happen_Cli="xpath||//td[contains(text(),'What Happened')]/following-sibling::td//div[contains(@style,'opacity: 0.9;')]";
    public final String Where_Inc_Occuer="xpath||//td[contains(text(),'Where did the Incident Occur')]/following-sibling::td//li[@class='bit-input']//input";
    public final String Where_Inc_occur_Cli="xpath||//td[contains(text(),'Where did the Incident Occur')]/following-sibling::td//div[contains(@style,'opacity: 0.9;')]";
    public final String Summary="xpath||//td[contains(text(),'Summary')]/following::textarea";
    public final String Sub_Category="xpath||//td[contains(text(),'Sub-Category')]/following-sibling::td//li[@class='bit-input']//input";
    public final String Sub_Category_Cli="xpath||//td[contains(text(),'Sub-Category')]/following-sibling::td//div[contains(@style,'opacity: 0.9;')]";
    public final String Discovery_Method="xpath||//td[contains(text(),'Discovery Method')]/following-sibling::td//li[@class='bit-input']//input";
    public final String Discovery_Method_Cli="xpath||//td[contains(text(),'Discovery Method')]/following-sibling::td//div[contains(@style,'opacity: 0.9;')]";
    public final String Pri_PointFailure="xpath||//td[contains(text(),'Primary Point')]/following-sibling::td//li[@class='bit-input']//input";
    public final String Pri_PointFailure_Cli="xpath||//td[contains(text(),'Primary Point')]/following-sibling::td//div[contains(@style,'opacity: 0.9;')]";
    public final String BTN_Save = "id||saveButton";
    public final String sub_frame = "xpath||//iframe[contains(@id,'contentPage')]";

    //locators of Attachment_link
    public final String Attach_link="xpath||//a[text()='Attachments']";
    public final String New_Attachment_link="xpath||//span[text()='New']";
    public final String Img_input="xpath||//td[@class='control attachment']//img[@alt='Click to load an attachment']";
    public final String Att_type="xpath||//td[@class='control single_select']//select";
    public final String Save_btn="xpath||//span[text()='Save']";
    //locator of Escalation_procedure_link
    public final String Escalation_Proce="xpath||//a[text()='Escalation Procedure']";
    public final String EP_Complete_Btn="xpath||//span[text()='Complete']";
    //locators of Financial Impact
    public final String  Financial_impact="xpath||//a[text()='Financial Impact']";
    public final String  New_Financial_imp="xpath||//span[text()='New']";
    public final String  Impact_Inp="xpath||//td[contains(text(),'Impact')]/following-sibling::td//li[@class='bit-input']//input";
    public final String  Impact_Inp_Click="xpath||//td[contains(text(),'Impact')]/following-sibling::td//div";
    public final String  Financial_Inp="xpath||//td[contains(text(),'Financial')]/following-sibling::td//li[@class='bit-input']//input";
    public final String  Financial_Inp_Click1="xpath||//td[contains(text(),'Financial')]/following-sibling::td//div[contains(@style,'opacity: 0.9')]";
    //td[contains(text(),'Financial')]/following-sibling::td//div[contains(@style,'opacity: 0.9;')]
    public final String  BU_Function_Inp="xpath||//td[contains(text(),'BU Function')]/following-sibling::td//li[@class='bit-input']//input";
    public final String  BU_Function_Inp_Click="xpath||//td[contains(text(),'BU Function')]/following-sibling::td//div";
    public final String  Value_Inp="xpath||//div[@class='currency-wrapper']//input";
    public final String  Save_Financial_Imp="xpath||//span[text()='Save']";
    public final String  Financial_Impact_Check="xpath||//span[text()='Financial Impact']";
    //locators of Involvement
    public final String Involvement="xpath||//a[text()='Involvements']";
    public final String New_Involvement="xpath||//span[text()='New']";
    public final String Inv_Involved_Entity="xpath||//td[contains(text(),'Involved Entity')]/following::select[contains(@id,'custom_select')]";
    public final String Inv_Individual="xpath||//*[@id=\"anonymous_element_24\"]";
    public final String Inv_Individual_Cli="xpath||//td[contains(text(),'Individual')]/following-sibling::td//div[@style,'opacity: 0.9;']";
    public final String Inv_Status="xpath||//td[contains(text(),'Status')]/following::select";
    public final String Inv_Association="xpath||//td[contains(text(),'Association')]/following::select";
    public final String Inv_Additional_details="xpath||//td[@class='control description']//textarea";
    public final String Save_Involvement_btn="xpath||//span[text()='Save']";
    //locators of Workflow
    public final String Workflow_link="xpath||//a[text()='Workflow']";
    public final String Reallocate_link="xpath||//span[text()='Reallocate']";
    public final String New_Progress_Limk="xpath||//span[text()='New Progress']";
    public final String Transition="xpath||//td[contains(text(),'Transition')]/following-sibling::td//input";
    public final String Responsible_ddn="xpath||//td[contains(text(),'Responsible')]/following-sibling::td//select";
    public final String Progress_inp="xpath||//td[contains(text(),'Progress')]/following-sibling::td//textarea";
    public final String NewProgress_Save_btn="xpath||//span[text()='Save']";
    public final String Reallocate_Save_btn="xpath||//span[text()='Save']";
    public final String Workflow_check="xpath||//span[text()='View Workflow']";
    //locators of Esclation TO Investigation
    public final String  Escalation_investigation="xpath||//span[text()='Escalate To Investigation']";
    public final String Save_Escalation_btn="xpath||//span[text()='Save']";
    public final String Esclation_check="xpath||//span[text()='View Incident']";
    //locators of Rootcause analysis
    public final  String Rootcause_link="xpath||//a[text()='Root Cause and Impact Analysis']";
    public final String Edit_RootcauseLink="xpath||//div[@id='scroller']/preceding::span[text()='Edit']";
    public final String RootCauseAndImpact_Inp="xpath||//*[@id=\"anonymous_element_2\"]";
    public final String Rootcause_Inp="xpath||//td[@class='control description']//textarea";
    public final String ImpactAnalysis_Inp="xpath||//td[contains(text(),'Impact Analysis')]/following::textarea[2]";
    public final String Rootcause_Save_Btn="xpath||//span[text()='Save']";
    public final String Check_RootAnalysis="xpath||//span[text()='View Root Cause and Impact Analysis']";
    //locators of External Reference
    public final String Add_external_ref="xpath||//td[contains(text(),'External Reference')]/following-sibling::td//span[text()='Add']";
    public final String External_Reference="xpath||//td[contains(text(),'External Reference Types')]/following-sibling::td//select";
    public final String Value="xpath||//td[contains(text(),'Value')]/following-sibling::td//input";
    public final String Description="xpath||//td[contains(text(),'Description')]/following-sibling::td//textarea";
    public final String Save_External_Ref="xpath||//span[text()='Save']";
    //loctors of policecase
    public final String Add_Policecase="xpath||//td[contains(text(),'Police Case')]/following::span[text()='Add']";
    public final String Policecase_NO="xpath||//td[contains(text(),'Police Case No')]/following::td[@class='control text']//input[contains(@style,'background-color:#FAAFBE')]";
    public final String Police_Station="xpath||//td[contains(text(),'Police Station')]/following-sibling::td//li[@class='bit-input']//input";
    public final String Police_Station_Cli="xpath||//td[contains(text(),'Police Station')]/following-sibling::td//div[contains(@style,'opacity: 0.9;')]";
    public final String Police_Charge="xpath||//td[contains(text(),'Police Charges')]/following-sibling::td//li[@class='bit-input']//input";
    public final String Police_Charge_Cli="xpath||//td[contains(text(),'Police Charges')]/following-sibling::td//div[contains(@style,'opacity: 0.9;')]";
    public final String Investigation_Off="xpath||//td[contains(text(),'Investigating Officer')]/following-sibling::td[@class='control text']//input";
    public final String Contact_Num="xpath||//td[contains(text(),'Contact Number')]/following-sibling::td[@class='control text']//input";
    public final String Investigation_Unit="xpath||//td[contains(text(),'Investigating Unit')]/following-sibling::td[@class='control text']//input";
    public final String Case_summary="xpath||//td[contains(text(),'Case Summary')]/following-sibling::td[@class='control description']//textarea";
    public final String Save_Policecase="xpath||//span[text()='Save']";

}
