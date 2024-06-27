/*
 * Copyright 2020-2023 Siphalor
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.kingtux.tms.api

import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment

/**
 * An interface to be used on [net.minecraft.client.option.KeyBinding]s.
 * **This key binding triggers without further conditions before any other checks or conditions.**
 */
@Environment(EnvType.CLIENT)
interface PriorityKeyBinding {
    /**
     * This method gets triggered when this key binding matches on an input event. <br></br>
     * Since there are no other checks before the invocation you need to check yourself for possible open screens.
     *
     * @return Return true to cancel propagation of this event. Return false for normal evaluation.
     */
    fun onPressedPriority(): Boolean

    /**
     * This method gets triggered when this key binding matches on an input release event. <br></br>
     * Since there are no other checks before the invocation you need to check yourself for possible open screens.
     *
     * @return Return true to cancel propagation of this event. Return false for normal evaluation.
     */
    fun onReleasedPriority(): Boolean {
        return false
    }
}
