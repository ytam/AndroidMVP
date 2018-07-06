package io.github.ytam.androidmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainMVP.view {

    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new Presenter(this);


    }

    @OnClick(R.id.btnClickMe) void btnClickMe(){

        presenter.clickButton();
    }

    @Override
    public void displayMessage() {

        Toast.makeText(this, "You clicked me, bravoo ", Toast.LENGTH_SHORT).show();
    }
}
