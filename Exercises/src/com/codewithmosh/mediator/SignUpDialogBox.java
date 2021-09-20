package com.codewithmosh.mediator;

public class SignUpDialogBox {
    private TextBox usernameTextBox = new TextBox();
    private TextBox passwordTextBox = new TextBox();
    private CheckBox termsCheckBox = new CheckBox();
    private Button signUpButton = new Button();

    public SignUpDialogBox() {
        usernameTextBox.addObserver(this::controlChanged);
        passwordTextBox.addObserver(this::controlChanged);
        termsCheckBox.addObserver(this::controlChanged);
    }

    public void simulateUserAction() {
        usernameTextBox.setContent("");
        passwordTextBox.setContent("pw");
        termsCheckBox.setChecked(true);

        System.out.println("Username: " + usernameTextBox.getContent());
        System.out.println("Passowrd: " + passwordTextBox.getContent());
        System.out.println("Terms: " + termsCheckBox.isChecked());
        System.out.println("Signup: " + signUpButton.isEnabled());
    }

    public void controlChanged() {
        signUpButton.setEnabled(isFormValid());
    }

    private boolean isFormValid() {
        return !isEmpty(usernameTextBox.getContent()) && !isEmpty(passwordTextBox.getContent()) && termsCheckBox.isChecked();
    }

    private boolean isEmpty(String text) {
        return text == null || text.isEmpty();
    }
}
