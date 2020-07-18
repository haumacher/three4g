package org.treblereel.gwt.three4g.geometries;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.core.Geometry;
import org.treblereel.gwt.three4g.geometries.parameters.TetrahedronGeometryParameters;

/**
 * A class for generating a tetrahedron geometries.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 5/3/18.
 */
@JsType(isNative = true, name = "THREE.TetrahedronGeometry", namespace = JsPackage.GLOBAL)
public class TetrahedronGeometry extends Geometry {

    public TetrahedronGeometryParameters parameters;

    /**
     * @param radius — Radius of the tetrahedron. Default is 1.
     * @param detail — Default is 0. Setting this to a value greater than 0 adds vertices making it no longer a tetrahedron.
     */
    public TetrahedronGeometry(float radius, int detail) {

    }
}
