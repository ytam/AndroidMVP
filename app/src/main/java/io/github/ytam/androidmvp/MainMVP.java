package io.github.ytam.androidmvp;

public interface MainMVP {

    interface view{
        void displayMessage();
    }

    interface presenter{
        void clickButton();
    }
}
