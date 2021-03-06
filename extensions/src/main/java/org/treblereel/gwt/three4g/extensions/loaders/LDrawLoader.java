package org.treblereel.gwt.three4g.extensions.loaders;

import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.Three4gElement;
import org.treblereel.gwt.three4g.core.Object3D;
import org.treblereel.gwt.three4g.loaders.OnErrorCallback;
import org.treblereel.gwt.three4g.loaders.OnLoadCallback;
import org.treblereel.gwt.three4g.loaders.OnProgressCallback;
import org.treblereel.gwt.three4g.loaders.managers.LoadingManager;
import org.treblereel.gwt.three4g.materials.Material;

/**
 * @author Dmitrii Tikhomirov Created by treblereel 1/19/19
 */
@Three4gElement(paths = {"js/loaders/LDrawLoader.js"})
@JsType(isNative = true, namespace = "THREE")
public class LDrawLoader {

    public Material[] materials;

    public LDrawLoader() {
    }

    public LDrawLoader(LoadingManager manager) {
    }

    /**
     * @param url — A string containing the path/URL of the .mpd file.
     * @param onLoad — A function to be called after loading is successfully completed. The function
     * receives loaded DataTexture as an argument.
     */
    public native void load(String url, OnLoadCallback<Object3D> onLoad);

    /**
     * @param url — A string containing the path/URL of the .mpd file.
     * @param onLoad — A function to be called after loading is successfully completed. The function
     * receives loaded DataTexture as an argument.
     * @param onProgress — A function to be called while the loading is in progress. The argument will
     * be the XMLHttpRequest instance, which contains .total and .loaded bytes.
     */
    public native void load(
            String url, OnLoadCallback<Object3D> onLoad, OnProgressCallback onProgress);

    /**
     * @param url — A string containing the path/URL of the .mpd file.
     * @param onLoad — A function to be called after loading is successfully completed. The function
     * receives loaded DataTexture as an argument.
     * @param onProgress — A function to be called while the loading is in progress. The argument will
     * be the XMLHttpRequest instance, which contains .total and .loaded bytes.
     * @param onError — A function to be called if an error occurs during loading. The function
     * receives the error as an argument.
     */
    public native void load(
            String url,
            OnLoadCallback<Object3D> onLoad,
            OnProgressCallback onProgress,
            OnErrorCallback onError);

    /**
     * @param text — Object to parse.
     * @return instance of Object3D
     */
    public native Object3D parse(Object text);

    /**
     * Set the base path or URL from which to load files. This can be useful if you are loading many
     * models from the same directory.
     * @param path base path or URL
     * @return instance of LDrawLoader
     */
    public native LDrawLoader setPath(String path);
}
