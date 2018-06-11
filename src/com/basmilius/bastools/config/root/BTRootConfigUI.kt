/*
 * Copyright © 2018 Bas Milius <bas@mili.us> - All rights reserved.
 *
 * This file is part of Bas Tools, a plugin for the IntelliJ Platform.
 *
 * For the full copyright and license information, please view the
 * LICENSE file that was distributed with this source code.
 */

package com.basmilius.bastools.config.root

import com.basmilius.bastools.config.IBTConfigUI
import com.intellij.ui.components.JBTextField
import java.awt.GridBagLayout
import javax.swing.JComponent
import javax.swing.JPanel

/**
 * Class BTRootConfigUI
 *
 * @author Bas Milius <bas@mili.us>
 * @package com.basmilius.bastools.config.root
 * @since 1.4.0
 */
class BTRootConfigUI: IBTConfigUI
{

	val root: JPanel = JPanel(GridBagLayout())

	/**
	 * {@inheritdoc}
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.4.0
	 */
	override fun initialize()
	{
		this.root.add(JBTextField("Hello world!"))
	}

	/**
	 * {@inheritdoc}
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.4.0
	 */
	override fun getComponent(): JComponent
	{
		return this.root
	}

	/**
	 * {@inheritdoc}
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.4.0
	 */
	override fun dispose()
	{
	}

}
