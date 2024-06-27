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
package dev.kingtux.tms.api.input

import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.client.MinecraftClient

/**
 * This interface is used for input event handling and is (un-)registered in [InputHandlerManager]
 *
 * @see .handleInput
 *
 * @see InputHandlerManager
 */
@Environment(EnvType.CLIENT)
interface InputEventHandler {
    /**
     * This method is called from [InputHandlerManager.handleInputEvents]
     *
     * @see InputHandlerManager.handleInputEvents
     * @param client
     */
    fun handleInput(client: MinecraftClient?)
}
