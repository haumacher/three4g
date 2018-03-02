package org.treblereel.gwt.three4g.core;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 * Created by treblereel on 2/28/18.
 */
@JsType(isNative = true, namespace = "THREE")
public class Color {

    /**
     * Used to check whether this or derived classes are Colors. Default is true.
     * You should not change this, as it used internally for optimisation.
     */
    public boolean isColor;

    /**
     * Red channel value between 0 and 1. Default is 1.
     */
    public float r;

    /**
     * Green channel value between 0 and 1. Default is 1.
     */
    public float g;

    /**
     * Blue channel value between 0 and 1. Default is 1.
     */
    public float b;

    @JsConstructor
    public Color(float r, float g, float b ){

    }

    /**
     * Adds the RGB values of color to the RGB values of this color.
     *
     * @param color
     * @return Color
     */
    public native Color add(Color color);

    /**
     * Sets this color's RGB values to the sum of the RGB values of color1 and color2.
     *
     * @param color1
     * @param color2
     * @return Color
     */
    public native Color adds(Color color1, Color color2);

    /**
     * Adds s to the RGB values of this color.
     *
     * @param s
     * @return Color
     */
    public native Color addScalar(Number s);

    /**
     * Returns a new Color with the same r, g and b values as this one.
     * @return Color
     */
    public native Color clone();

    /**
     * Copies the r, g and b parameters from color in to this color.
     *
     * @param color
     * @return Color
     */
    public native Color copy(Color color);

    /**
     * Converts this color from gamma to linear space by squaring the values of r, g and b ).
     *
     * @return Color
     */
    public native Color convertGammaToLinear();

    /**
     * Converts this color from linear to gamma space by taking the square root of r, g and b).
     *
     * @return Color
     */
    public native Color convertLinearToGamma();

    /**
     * color — Color to copy.
     *
     * Copies the given color into this color while converting it from gamma to linear space by
     * taking r, g and b to the power of gammaFactor.
     *
     * @param color
     * @return Color
     */
    public native Color copyGammaToLinear(Color color);

    /**
     * color — Color to copy.
     * gammaFactor - Default is 2.0.
     *
     * Copies the given color into this color while converting it from gamma to linear space by
     * taking r, g and b to the power of gammaFactor.
     *
     * @param color
     * @param gammaFactor
     * @return Color
     */
    public native Color copyGammaToLinear(Color color, float gammaFactor);

    /**
     * color — Color to copy.
     *
     * Copies the given color into this color while converting it from linear to gamma space by taking r, g and b to the power of 1 / gammaFactor.
     *
     * @param color
     * @return Color
     */
    public native Color copyLinearToGamma(Color color);

    /**
     * color — Color to copy.
     * gammaFactor - Default is 2.0.
     *
     * Copies the given color into this color while converting it from linear to gamma space by taking r, g and b to the power of 1 / gammaFactor.
     *
     * @param color
     * @param gammaFactor
     * @return Color
     */
    public native Color copyLinearToGamma(Color color, float gammaFactor);

    /**
     * Compares the RGB values of color with those of this object. Returns true if they are the same, false otherwise.
     *
     * @param color
     * @return boolean
     */
    public native boolean equals(Color color);

    /**
     * array - Array of floats in the form [ r, g, b ].
     *
     * Sets this color's components based on an array formatted like [ r, g, b ].
     *
     * @param array
     * @return Color
     */
    public native Color fromArray(float[] array);

    /**
     * array - Array of floats in the form [ r, g, b ].
     * offset - An optional offset into the array.
     *
     * Sets this color's components based on an array formatted like [ r, g, b ].
     *
     * @param array
     * @param offset
     * @return Color
     */
    public native Color fromArray(float[] array, int offset);

    /**
     * Returns the hexadecimal value of this color
     *
     * @return int
     */
    public native int getHex();

    /**
     * Returns the hexadecimal value of this color as a string (for example, 'FFFFFF').
     *
     * @return int
     */
    public native String getHexString();

    /**
     * Convert this Color's r, g and b values to HSL format and returns an object of the form:
     * { h: 0, s: 0, l: 0 }
     * @param obj
     * @return Object
     */
    public native Object getHSL(Object obj); //TODO

    /**
     * Returns the value of this color as a CSS style string. Example: 'rgb(255,0,0)'.
     * @return String
     */
    public native String getStyle();


    /**
     * color - color to converge on.
     * alpha - interpolation factor in the closed interval [0, 1].
     * Linearly interpolates this color's RGB values toward the RGB values of the passed argument.
     * The alpha argument can be thought of as the ratio between the two colors, where 0.0 is this color
     * and 1.0 is the first argument.
     *
     * @param color
     * @param alfa
     * @return Color
     */
    public native Color lerp(Color color, float alfa);

    /**
     * Multiplies this color's RGB values by the given color's RGB values.
     *
     * @param color
     * @return
     */
    public native Color multiply(Color color);

    /**
     * Multiplies this color's RGB values by s.
     *
     * @param scalar
     * @return Color
     */
    public native Color multiplyScalar(Number scalar);

    /**
     * Adds the given h, s, and l to this color's values. Internally, this converts the color's r, g and b values to
     * HSL, adds h, s, and l, and then converts the color back to RGB.
     *
     * @param h
     * @param s
     * @param l
     * @return Color
     */
    public native Color offsetHSL(float h, float s, float l);

    /**
     * value - Value to set this color to.
     *
     * Color, Hex or String
     *
     * See the Constructor above for full details of what value can be. Delegates to .copy,
     * .setStyle, or .setHex depending on input type.
     *
     * @param value
     * @return Color
     */
    public native Color set(Object value);

    /**
     * hex — hexadecimal triplet format.
     *
     * Sets this color from a hexadecimal value.
     * @param value
     * @return Color
     */
    public native Color setHex(int value);

    /**
     * Sets color from HSL values.
     *
     * @param h
     * @param s
     * @param l
     * @return Color
     */
    public native Color setHSL(float h, float s, float l);

    /**
     * r — Red channel value between 0.0 and 1.0.
     * g — Green channel value between 0.0 and 1.0.
     * b — Blue channel value between 0.0 and 1.0.
     *
     * Sets this color from RGB values.
     *
     * @param r
     * @param g
     * @param b
     * @return Color
     */
    public native Color setRGB(float r, float g, float b);

    /**
     * style — color as a CSS-style string.
     *
     * Sets this color from a CSS-style string. For example, "rgb(250, 0,0)", "rgb(100%, 0%, 0%)", "hsl(0, 100%, 50%)", "#ff0000", "#f00", or "red" ( or any X11 color name - all 140 color names are supported ).
     * Translucent colors such as "rgba(255, 0, 0, 0.5)" and "hsla(0, 100%, 50%, 0.5)" are also accepted, but the alpha-channel coordinate will be discarded.
     *
     * Note that for X11 color names, multiple words such as Dark Orange become the string 'darkorange' (all lowercase).
     *
     * @param style
     * @return Color
     */
    public native Color setStyle(String style);

    /**
     * Subtracts the RGB components of the given color from the RGB components of this color. If this results in a negative component, that component is set to zero.
     *
     * @param color
     * @return Color
     */
    public native Color sub(Color color);

    /**
     * array - An optional array to store the color to.
     *
     * Returns an array of the form [ r, g, b ].
     *
     * @param array
     * @return Color
     */
    public native float[] toArray (float[] array);

    /**
     * array - An optional array to store the color to.
     * offset - An optional offset into the array.
     *
     * Returns an array of the form [ r, g, b ].
     *
     * @param array
     * @param offset
     * @return Color
     */
    public native float[] toArray (float[] array, int offset);

}
