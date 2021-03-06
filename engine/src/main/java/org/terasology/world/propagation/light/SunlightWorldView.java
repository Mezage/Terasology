/*
 * Copyright 2013 MovingBlocks
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
package org.terasology.world.propagation.light;

import org.joml.Vector3ic;
import org.terasology.math.JomlUtil;
import org.terasology.world.chunks.ChunkProvider;
import org.terasology.world.chunks.LitChunk;
import org.terasology.world.propagation.AbstractFullWorldView;

/**
 * Gets the sunlight from the chunk.
 * <p>
 * Simply delegates to the provided chunk for values
 */
public class SunlightWorldView extends AbstractFullWorldView {

    public SunlightWorldView(ChunkProvider chunkProvider) {
        super(chunkProvider);
    }

    @Override
    protected byte getValueAt(LitChunk chunk, Vector3ic pos) {
        return chunk.getSunlight(JomlUtil.from(pos));
    }

    @Override
    protected void setValueAt(LitChunk chunk, Vector3ic pos, byte value) {
        chunk.setSunlight(JomlUtil.from(pos), value);
    }

}
