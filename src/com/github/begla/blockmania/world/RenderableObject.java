/*
 * Copyright 2011 Benjamin Glatzel <benjamin.glatzel@me.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.begla.blockmania.world;

import com.github.begla.blockmania.utilities.VectorPool;
import org.lwjgl.util.vector.Vector3f;

/**
 * The base class of all renderable objects.
 *
 * @author Benjamin Glatzel <benjamin.glatzel@me.com>
 */
public abstract class RenderableObject {

    /**
     * The position of this renderable object.
     */
    protected Vector3f _position = VectorPool.getVector();

    /**
     * Rendering operations have to be placed here.
     */
    public abstract void render();

    /**
     * Updating operations have to be placed here.
     */
    public abstract void update();

    /**
     * Returns the position of the object.
     *
     * @return The position
     */
    public Vector3f getPosition() {
        return _position;
    }

    /**
     * Sets the position of the object.
     *
     * @param position The position
     */
    public void setPosition(Vector3f position) {
        _position.set(position);
    }
}