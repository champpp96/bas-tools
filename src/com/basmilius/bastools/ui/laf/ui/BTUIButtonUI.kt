/*
 * Copyright © 2018 Bas Milius <bas@mili.us> - All rights reserved.
 *
 * This file is part of Bas Tools, a plugin for the IntelliJ Platform.
 *
 * For the full copyright and license information, please view the
 * LICENSE file that was distributed with this source code.
 */

package com.basmilius.bastools.ui.laf.ui

import com.intellij.ide.ui.laf.darcula.ui.DarculaButtonUI
import com.intellij.util.ObjectUtils
import java.awt.Color
import javax.swing.UIManager
import javax.swing.plaf.ColorUIResource

/**
 * Class BTUIButtonUI
 *
 * @author Bas Milius <bas@mili.us>
 * @package com.basmilius.bastools.ui.laf.ui
 * @since 1.4.0
 */
class BTUIButtonUI: DarculaButtonUI()
{

	/**
	 * {@inheritdoc}
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.4.0
	 */
	override fun getButtonColor1(): Color
	{
		return ObjectUtils.notNull(UIManager.getColor("Button.darcula.color2"), ColorUIResource(0x414648))
	}

	/**
	 * {@inheritdoc}
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.4.0
	 */
	override fun getButtonColor2(): Color
	{
		return ObjectUtils.notNull(UIManager.getColor("Button.darcula.color2"), ColorUIResource(0x414648))
	}

	/**
	 * {@inheritdoc}
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.4.0
	 */
	override fun getSelectedButtonColor1(): Color
	{
		return ObjectUtils.notNull(UIManager.getColor("Button.darcula.selection.color2"), ColorUIResource(0x233143))
	}

	/**
	 * {@inheritdoc}
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.4.0
	 */
	override fun getSelectedButtonColor2(): Color
	{
		return ObjectUtils.notNull(UIManager.getColor("Button.darcula.selection.color2"), ColorUIResource(0x233143))
	}

}
