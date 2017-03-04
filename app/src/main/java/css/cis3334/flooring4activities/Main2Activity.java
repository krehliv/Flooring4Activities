package css.cis3334.flooring4activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textViewDisplayResult;
    Double length, width, total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewDisplayResult = (TextView) findViewById(R.id.textViewDisplayResult);

        Bundle extras = getIntent().getExtras();
        length = extras.getDouble("MainLength");
        width = extras.getDouble("MainWidth");
        total = extras.getDouble("MainTotal");

        textViewDisplayResult.setText(length + " is the length of the room and " + width + " is the width of the room. " + total + " is the total amount of flooring needed.");
    }
}
