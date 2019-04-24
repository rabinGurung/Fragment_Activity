package Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragment_activity.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Second_Fragment extends Fragment {


    private EditText radius;
    private Button calculateArea;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_second_, container, false);
        radius = view.findViewById(R.id.etRadius);
        calculateArea = view.findViewById(R.id.btncalculate);


        calculateArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(radius.getText())){
                    radius.setError("Please enter radius for calculation");
                    return;
                }
                Double r = Double.parseDouble(radius.getText().toString());
                Double area = Math.PI * r * r;
                Toast.makeText(view.getContext(), area.toString(), Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }

}
