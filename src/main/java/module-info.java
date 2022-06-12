module com.mchindwhite.onboardingchecklistfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mchindwhite.onboardingchecklistfx to javafx.fxml;
    exports com.mchindwhite.onboardingchecklistfx;
}