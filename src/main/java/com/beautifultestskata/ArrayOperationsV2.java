package com.beautifultestskata;

class ArrayOperationsV2 implements ArrayOperations {

    @Override
    public float[] subtractAverage(float[] ar) {
        if (ar == null || ar.length == 0) {
            throw new IllegalArgumentException();
        }
        // Find average
        var avg = 0f;
        var t = 1;
        for (float f : ar) {
            if (Float.isNaN(f) || f == Float.POSITIVE_INFINITY) {
                throw new IllegalArgumentException();
            }
            avg += (f - avg) / t;
            ++t;
        }
        // Subtract
        var result = new float[ar.length];
        for (int i = 0; i < ar.length; i++) {
            result[i] = ar[i] - avg;
        }
        return result;
    }

}
