package fragments;


import android.content.Intent;
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
public class ThirdFragment extends Fragment {

    EditText etNumber;
    Button btnFind;

    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_third, container, false);

        etNumber = view.findViewById(R.id.etNumber);
        btnFind = view.findViewById(R.id.btnFind);

        btnFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(etNumber.getText().toString());
                if(num%2==0){
                    Toast.makeText(getActivity(),"Your entered number is even.", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getActivity(),"Your entered number is odd.", Toast.LENGTH_LONG).show();
                }
            }
        });

        return view;
    }

}
