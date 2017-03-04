package css.cis3334.flooring4activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etWidth, etLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etLength = (EditText) findViewById(R.id.editTextLength);
        etWidth = (EditText) findViewById(R.id.editTextWidth);
    }

    public void onSubmitButtonClick(View view) {
        // Do the math
        Double length = Double.parseDouble(etLength.getText().toString());
        Double width = Double.parseDouble(etWidth.getText().toString());
        Double total = length * width;

        // Call the second activity
        Intent secondActionIntent = new Intent(this, Main2Activity.class);
        secondActionIntent.putExtra("MainLength", length);
        secondActionIntent.putExtra("MainWidth", width);
        secondActionIntent.putExtra("MainTotal", total);
        startActivity(secondActionIntent);
    }
}
