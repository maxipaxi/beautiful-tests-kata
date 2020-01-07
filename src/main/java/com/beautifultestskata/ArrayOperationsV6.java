package com.beautifultestskata;

class ArrayOperationsV6 implements ArrayOperations {

    @Override
    public float[] subtractAverage(float[] ar) {
        if (ar == null || ar.length == 0) {
            throw new IllegalArgumentException();
        }
        // Find average
        var sum = 0f;
        for (float f : ar) {
            if (Float.isNaN(f) || Float.isInfinite(f)) {
                throw new IllegalArgumentException();
            }
            sum += f;
        }
        float avg = sum / ar.length;
        // Subtract
        var result = new float[ar.length];
        for (int i = 0; i < ar.length; i++) {
            result[i] = ar[i] - avg;
        }
        return result;
    }

}
