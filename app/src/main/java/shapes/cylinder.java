package shapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.volume_calculater.R;

public class cylinder extends AppCompatActivity {

    EditText ed1,ed2;
    Button btn4;
    TextView val1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        ed1=findViewById(R.id.cylinder_edittext);
        ed2=findViewById(R.id.cylinder_edittext2);
        btn4=findViewById(R.id.button_cylinder);
        val1=findViewById(R.id.cylinder_value);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt=ed1.getText().toString();
                String txt2=ed2.getText().toString();
                if(txt.equals("") || txt2.equals("")){
                    Toast.makeText(cylinder.this, "Enter Some Value", Toast.LENGTH_SHORT).show();
                    val1.setText("_____");
                }
                else {
                    double num=Integer.parseInt(txt);
                    double num3=Integer.parseInt(txt2);
                    double num2=3.14*num*num*num3;
                    String str=String.format("%.2f", num2)+" m3";
                    val1.setText(str);
                }
            }
        });
    }
}