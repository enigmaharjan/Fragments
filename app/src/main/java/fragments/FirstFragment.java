package fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {
    EditText etRadius;
    Button btnArea;


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        etRadius = view.findViewById(R.id.etRadius);
        btnArea = view.findViewById(R.id.btnCalculate);

        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result = Double.parseDouble(etRadius.getText().toString())*2*3.14;

                Toast.makeText(getActivity(),"Area is: "+ result,Toast.LENGTH_LONG).show();
            }
        });



        return view;



    }

}
