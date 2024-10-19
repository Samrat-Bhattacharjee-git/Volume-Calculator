package shapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.volume_calculater.R;

public class sphere extends AppCompatActivity {

    EditText ed1;
    Button btn2;
    TextView val1;
    double num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        ed1=findViewById(R.id.sphere_edittext);
        btn2=findViewById(R.id.button_sphere);
        val1=findViewById(R.id.sphere_value);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt=ed1.getText().toString();
                if(txt.equals("")){
                    Toast.makeText(sphere.this, "Enter Some Value", Toast.LENGTH_SHORT).show();
                    val1.setText("_____");
                }
                else {
                    num=Integer.parseInt(txt);
                    double num2=(4*3.14*Math.pow(num,3))/3;
                    String str=String.format("%.2f", num2)+" m3";
                    val1.setText(str);
                }
            }
        });
    }
}