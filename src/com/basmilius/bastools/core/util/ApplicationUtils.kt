/*
 * Copyright © 2018 Bas Milius <bas@mili.us> - All rights reserved.
 *
 * This file is part of Bas Tools, a plugin for the IntelliJ Platform.
 *
 * For the full copyright and license information, please view the
 * LICENSE file that was distributed with this source code.
 */

package com.basmilius.bastools.core.util

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.components.BaseComponent
import kotlin.reflect.KClass

/**
 * Object ApplicationUtils
 *
 * @author Bas Milius <bas@mili.us>
 * @package com.basmilius.bastools.core.util
 * @since 1.1.0
 */
object ApplicationUtils
{

	/**
	 * Gets an ApplicationComponent instance.
	 *
	 * @param cls KClass
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.4.0
	 */
	fun <T: BaseComponent> getComponent(cls: KClass<T>): T?
	{
		return ApplicationManager.getApplication().getComponent(cls.java)
	}

	/**
	 * Invokes {@see func} later.
	 *
	 * @param func Closure
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.4.0
	 */
	fun invokeLater(func: () -> Unit)
	{
		ApplicationManager.getApplication().invokeLater(func)
	}

	/**
	 * Does something with an Application Component instance.
	 *
	 * @param cls KClass
	 * @param func Closure
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.4.0
	 */
	fun <T: BaseComponent> withComponent(cls: KClass<T>, func: (T) -> Unit)
	{
		val component = getComponent(cls) ?: return
		func(component)
	}

}
