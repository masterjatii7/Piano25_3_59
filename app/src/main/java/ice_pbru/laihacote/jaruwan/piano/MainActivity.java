package ice_pbru.laihacote.jaruwan.piano;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.BitSet;

public class MainActivity extends AppCompatActivity {

    // explicit
    private Button DoButton;    //access type name
    private Button ReButton;
    private Button MeButton;
    private Button FaButton;
    private Button SoButton;
    private Button LaButton;
    private Button SiButton;
    private Button DOButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Bind widget
        bindWidget();


    }//Main Method

    private void bindWidget() {
        DoButton = (Button) findViewById(R.id.button);
        ReButton = (Button) findViewById(R.id.button2);
        MeButton = (Button) findViewById(R.id.button3);
        FaButton = (Button) findViewById(R.id.button4);
        SoButton = (Button) findViewById(R.id.button5);
        LaButton = (Button) findViewById(R.id.button6);
        SiButton = (Button) findViewById(R.id.button7);
        DOButton = (Button) findViewById(R.id.button8);

    }//bind widget

}//main class
