package com.grochowski.annsearch;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

public class ViewDatabase extends AppCompatActivity {

    private static final String TAG = "ViewDatabase";

    private FirebaseDatabse mFirebaseDatabase;
    private DatabaseReference dbReference;

    private ListView mListView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_database_layout);

        mListView = (ListView) findViewById(R.id.listview);
        mFirebaseDatabase = FirebaseDatabase.getInstance();

        dbReference.addValueEventListener(new ValueEventListener()) {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                showData(dataSnapshot);
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        }
    }

    private void showData(DataSnapshot dataSnapshot) {
        for(DatabaseSnapshot ds : dataSnapshot.getChildren()) {

        }
    }

    private void toastMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
