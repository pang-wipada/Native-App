package fooddelivery.wipada.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;

public class RestaurantList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_list);
    }

    public void menuClick(View view){
        Button btn = (Button)findViewById(R.id.menubtn);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent ResList = new Intent(RestaurantList.this,RestaurantDetail.class);
                startActivity(ResList);

            }
        });

    }
}
