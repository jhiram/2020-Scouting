package com.sparx1126.a2020_scouting.ui.rankings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.sparx1126.a2020_scouting.R;

public class RankingsFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_rankings, container, false);

        View rank_layout = inflater.inflate(R.layout.rank_custom_layout, container, false);

        if(rank_layout != null) {
            TextView team = rank_layout.findViewById(R.id.team);
            team.setText("1126");

            TextView rank = rank_layout.findViewById(R.id.rank);
            team.setText("1");

            TextView team_name = rank_layout.findViewById(R.id.team_name);
            team.setText("Sparx");

            TextView record = rank_layout.findViewById(R.id.record);
            team.setText("1-1-1");

            TextView details = rank_layout.findViewById(R.id.details);
            team.setText("Jaren was Here");
        }

        ((ConstraintLayout)root).addView(rank_layout);

        return root;
    }
}