/*
* Copyright (c) 2009-2013 Monoidics ltd.
* Copyright (c) 2013- Facebook.
* All rights reserved.
*/

package com.facebook.infer.models;

public class InferArray {

    public static Object[] clone(Object[] arr) {
        return new Object[arr.length];
    }

    public static int[] clone(int[] arr) {
        return new int[arr.length];
    }

    public static short[] clone(short[] arr) {
        return new short[arr.length];
    }

    public static long[] clone(long[] arr) {
        return new long[arr.length];
    }

    public static boolean[] clone(boolean[] arr) {
        return new boolean[arr.length];
    }

    public static char[] clone(char[] arr) {
        return new char[arr.length];
    }

    public static float[] clone(float[] arr) {
        return new float[arr.length];
    }

    public static double[] clone(double[] arr) {
        return new double[arr.length];
    }

}
