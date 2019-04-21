package fragments;


import android.app.Activity;
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
public class SecondFragment extends Fragment {
    Button btnCalculate;
    EditText etFirst, etSecond;


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_second, container,false);
        etFirst = view.findViewById(R.id.fstNumber);
        etSecond = view.findViewById(R.id.secNumber);
        btnCalculate = view.findViewById(R.id.btnSum);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = Integer.parseInt(etFirst.getText().toString())+Integer.parseInt(etSecond.getText().toString());
                Toast.makeText(getActivity(),"Sum is: "+ result, Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

}
