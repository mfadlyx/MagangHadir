package com.juaracoding.utlis;

public enum ScenarioTests {

    //dashboardfeature
    T1("Successfully go to the dashboard page"),
    //laporansemuafeature
    T2("Success view all report data by entering name, department, date"),
    T3("View all report data by not enter name, department, date"),
    T4("View report data by using Input unregistered name"),
    T5("View all report data by entering the start date and end date"),
    T6("Display all report data by entering a start date without an end date"),
    T7("Display all report data by entering end date without start date"),
    T8("Displays report data all with department and date input"),
    T9("Entering dates is not formatted"),
    T10("Reset all inputs using the Reset button"),
    //UserHistoryAbsensi
    T11("Visit the attendance history view via the attendance button"),
    T12("Return to the home view"),
    //UserKoreksiAbsensi
    T13("Visit the view to the correction page"),
    T14("Applying for attendance with the appropriate data"),
    T15("Applying for attendance without filling in data"),
    T16("Return to the home absent view"),
    //ManagementUser
    T17("Displays a list of user data by name"),
    T18("Search users by name with punctuation input");


    private String scenarioTestName;

    ScenarioTests(String value){
        scenarioTestName  = value;
    }

    public String getScenarioTestName(){
        return scenarioTestName;
    }
}
