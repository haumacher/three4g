package org.treblereel.gwt.three4g.loaders;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.core.JsObject;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 6/10/18.
 */

@JsType(namespace = JsPackage.GLOBAL, isNative = true, name = "Object")
public class OnProgressEvent extends JsObject {

    public boolean lengthComputable;

    public int loaded;

    public int total;

}
