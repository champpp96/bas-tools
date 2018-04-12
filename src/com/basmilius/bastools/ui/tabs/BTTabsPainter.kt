/*
 * Copyright © 2018 Bas Milius <bas@mili.us> - All rights reserved.
 *
 * This file is part of Bas Tools, a plugin for the IntelliJ Platform.
 *
 * For the full copyright and license information, please view the
 * LICENSE file that was distributed with this source code.
 */

package com.basmilius.bastools.ui.tabs

import com.intellij.ui.JBColor
import com.intellij.ui.tabs.impl.DefaultEditorTabsPainter
import com.intellij.ui.tabs.impl.JBEditorTabs
import com.intellij.util.ui.JBUI
import java.awt.BasicStroke
import java.awt.Color
import java.awt.Graphics2D
import java.awt.Rectangle

/**
 * Open Class BTTabsPainter
 *
 * @author Bas Milius <bas@mili.us>
 * @package com.basmilius.bastools.ui.tabs
 * @since 1.0.0
 */
open class BTTabsPainter: DefaultEditorTabsPainter
{

	private fun Int.scale() = JBUI.scale(this)

	/**
	 * Companion Object BTTabsPainter
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @package com.basmilius.bastools.ui.tabs
	 * @since 1.4.0
	 */
	companion object
	{

		val BackgroundColor = JBColor(Color(25, 26, 28), Color(25, 26, 28))
		val FocusColor = JBColor(Color(32, 33, 36), Color(32, 33, 36))
		val OutlineColor = JBColor(Color(42, 43, 49), Color(42, 43, 49))

	}

	/**
	 * BTTabsPainter Constructor.
	 *
	 * Suppress unused, because we need this in Reflection.
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.0.0
	 */
	@Suppress("unused")
	constructor(): super(null)

	/**
	 * BTTabsPainter Constructor.
	 *
	 * @param tabs Editor tabs.
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.0.0
	 */
	constructor(tabs: JBEditorTabs): super(tabs)

	/**
	 * Paints the inactive.
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.0.0
	 */
	override fun doPaintInactive(g: Graphics2D, effectiveBounds: Rectangle?, x: Int, y: Int, w: Int, h: Int, color: Color?, row: Int, column: Int, vertical: Boolean)
	{
		g.color = color ?: BackgroundColor
		g.fillRect(x - 1.scale(), y - 1.scale(), w + 2.scale(), h + 2.scale())

		g.color = OutlineColor
		g.stroke = BasicStroke(1f)
		g.drawLine(x, y + h, x + w, y + h)
	}

	/**
	 * Paints the background.
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.0.0
	 */
	override fun doPaintBackground(g: Graphics2D, clip: Rectangle, vertical: Boolean, rectangle: Rectangle)
	{
		g.color = BackgroundColor
		g.fillRect(rectangle.x - 1.scale(), rectangle.y - 1.scale(), rectangle.width + 2.scale(), rectangle.height + 2.scale())

		g.color = OutlineColor
		g.stroke = BasicStroke(1f)
		g.drawLine(rectangle.x, rectangle.y + rectangle.height, rectangle.x + rectangle.width, rectangle.y + rectangle.height)
	}

	/**
	 * Fills the selection and border.
	 *
	 * @param g Graphics2D
	 * @param x Int
	 * @param y Int
	 * @param width Int
	 * @param height Int
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.0.0
	 */
	fun fillSelectionAndBorder(g: Graphics2D, x: Int, y: Int, width: Int, height: Int)
	{
		g.color = FocusColor
		g.fillRect(x, y, width, height + 1.scale())

		g.color = OutlineColor
		g.stroke = BasicStroke(JBUI.scale(1f))
		g.drawLine(x - 1.scale(), y + height, x - 1.scale(), y)
		g.drawLine(x - 1.scale(), y, x + width, y)
		g.drawLine(x + width, y + height, x + width, y)
	}

	/**
	 * Gets the background color.
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.0.0
	 */
	override fun getBackgroundColor(): Color
	{
		return BackgroundColor
	}

	/**
	 * Gets the empty space color.
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.0.0
	 */
	override fun getEmptySpaceColor(): Color
	{
		return BackgroundColor
	}

	/**
	 * Gets the default tab color.
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.0.0
	 */
	override fun getDefaultTabColor(): Color
	{
		return BackgroundColor
	}

	/**
	 * Gets the inactive mask color.
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.0.0
	 */
	override fun getInactiveMaskColor(): Color
	{
		return BackgroundColor
	}

	/**
	 * Gets the textEditor tabs.
	 *
	 * @return JBEditorTabs
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.0.0
	 */
	val tabsComponent: JBEditorTabs get() = this.myTabs

}
