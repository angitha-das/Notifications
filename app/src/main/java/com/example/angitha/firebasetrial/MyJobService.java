package com.example.angitha.firebasetrial;


import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;

/**
 * Created by angitha on 22/4/17.
 */


public class MyJobService extends JobService {

    private static final String TAG = "MyJobService";
    @Override
    public boolean onStartJob(JobParameters params) {
        Log.d(TAG, "Performing long running task in scheduled job");
        // TODO(developer): add long running task here.
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return false;
    }
}
