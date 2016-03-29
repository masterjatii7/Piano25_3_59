package ice_pbru.laihacote.jaruwan.piano;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

        //Button Controller
        buttonCon();


    }//Main Method

    private void buttonCon() {
        DoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer DoMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.song1);
                DoMediaPlayer.start();

                DoMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });

            }
        });
        ReButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer ReMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.song2);
                ReMediaPlayer.start();

                ReMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        MeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer qMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song3);
                qMediaPlayer.start();

                qMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        FaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer fMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song4);
                fMediaPlayer.start();

                fMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        SoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer SoMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song5);
                SoMediaPlayer.start();

                SoMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        LaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer LaMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song6);
                LaMediaPlayer.start();

                LaMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        SiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer SiMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song7);
                SiMediaPlayer.start();

                SiMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        DOButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com"));
                startActivity(intent);
            }
        });//wec view

    }//buttonCon

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
