package io.github.ytam.androidmvp;

public class Presenter implements MainMVP.presenter {

    private final MainMVP.view view;

    public  Presenter(MainMVP.view view){
        this.view = view;
    }

    @Override
    public void clickButton() {

        view.displayMessage();
    }
}
