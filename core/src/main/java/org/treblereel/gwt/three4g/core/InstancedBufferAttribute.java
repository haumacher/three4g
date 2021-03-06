package org.treblereel.gwt.three4g.core;

import elemental2.core.TypedArray;
import jsinterop.annotations.JsType;

/**
 * An instanced version of BufferAttribute.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 4/30/18.
 */
@JsType(isNative = true, namespace = "THREE")
public class InstancedBufferAttribute extends BufferAttribute<Number, InstancedBufferAttribute> {

    /**
     * Default is 1.
     */
    public int meshPerAttribute;

    /**
     * Default is true.
     */
    public boolean isInstancedBufferAttribute;

    public InstancedBufferAttribute(TypedArray array, int itemSize) {

    }

    public InstancedBufferAttribute(TypedArray array, int itemSize, boolean normalized) {

    }

    public InstancedBufferAttribute(TypedArray array, int itemSize, boolean normalized, int meshPerAttribute) {

    }


}
