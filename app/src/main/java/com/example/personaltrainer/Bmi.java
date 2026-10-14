package com.example.personaltrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Bmi extends AppCompatActivity {
    private EditText height;
    private EditText weight;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        height =  findViewById(R.id.height);
        weight =  findViewById(R.id.Weight);
        result =  findViewById(R.id.result);
    }

    public void calculateBMI(View v) {
        String heightStr = height.getText().toString().trim();
        String weightStr = weight.getText().toString().trim();

        if (heightStr.isEmpty()) {
            height.setError(getString(R.string.height_required));
            height.requestFocus();
            return;
        }
        if (weightStr.isEmpty()) {
            weight.setError(getString(R.string.weight_required));
            weight.requestFocus();
            return;
        }

        final float heightCentimeters;
        try {
            heightCentimeters = Float.parseFloat(heightStr);
        } catch (NumberFormatException exception) {
            height.setError(getString(R.string.enter_valid_measurements));
            height.requestFocus();
            return;
        }

        final float weightKilograms;
        try {
            weightKilograms = Float.parseFloat(weightStr);
        } catch (NumberFormatException exception) {
            weight.setError(getString(R.string.enter_valid_measurements));
            weight.requestFocus();
            return;
        }

        if (!isPositiveFinite(heightCentimeters)) {
            height.setError(getString(R.string.enter_valid_measurements));
            height.requestFocus();
            return;
        }
        if (!isPositiveFinite(weightKilograms)) {
            weight.setError(getString(R.string.enter_valid_measurements));
            weight.requestFocus();
            return;
        }

        float heightMeters = heightCentimeters / 100f;
        float bmi = weightKilograms / (heightMeters * heightMeters);
        if (!isPositiveFinite(bmi)) {
            height.setError(getString(R.string.enter_valid_measurements));
            height.requestFocus();
            return;
        }
        displayBMI(bmi);
    }

    private boolean isPositiveFinite(float value) {
        return value > 0 && !Float.isNaN(value) && !Float.isInfinite(value);
    }

    private void displayBMI(float bmi) {
        String bmiLabel = "";

        if (Float.compare(bmi, 15f) <= 0) {
            bmiLabel = getString(R.string.very_severely_underweight);
        } else if (Float.compare(bmi, 15f) > 0  &&  Float.compare(bmi, 16f) <= 0) {
            bmiLabel = getString(R.string.severely_underweight);
        } else if (Float.compare(bmi, 16f) > 0  &&  Float.compare(bmi, 18.5f) <= 0) {
            bmiLabel = getString(R.string.underweight);
        } else if (Float.compare(bmi, 18.5f) > 0  &&  Float.compare(bmi, 25f) <= 0) {
            bmiLabel = getString(R.string.normal);
        } else if (Float.compare(bmi, 25f) > 0  &&  Float.compare(bmi, 30f) <= 0) {
            bmiLabel = getString(R.string.overweight);
        } else if (Float.compare(bmi, 30f) > 0  &&  Float.compare(bmi, 35f) <= 0) {
            bmiLabel = getString(R.string.obese_class_i);
        } else if (Float.compare(bmi, 35f) > 0  &&  Float.compare(bmi, 40f) <= 0) {
            bmiLabel = getString(R.string.obese_class_ii);
        } else {
            bmiLabel = getString(R.string.obese_class_iii);
        }

        result.setText(getString(R.string.bmi_result, bmi, bmiLabel));
    }
}
