package Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
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
public class First_Fragment extends Fragment {


    private EditText username, password;
    private Button submit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_first_, container, false);

        username = view.findViewById(R.id.etusername);
        password = view.findViewById(R.id.etPassword);
        submit = view.findViewById(R.id.btnlogin);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(username.getText())){
                    username.setError("Please enter username!");
                    return;
                }
                if(TextUtils.isEmpty(password.getText())){
                    password.setError("Please enter password");
                    return;
                }

                Toast.makeText(view.getContext(),username.getText()+" "+password.getText(),Toast.LENGTH_LONG).show();
            }
        });



        return view;

    }

}
