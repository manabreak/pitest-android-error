package me.manabreak.pitesting;

import android.util.Log;

public class TestTarget {

    public int add(int left, int right) {
        Log.d("TEST", "Testing...");
        return left + right;
    }
}
