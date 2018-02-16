/*
 * Copyright © 2018 Bas Milius <bas@mili.us> - All rights reserved.
 *
 * This file is part of Bas Tools, a plugin for the IntelliJ Platform.
 *
 * For the full copyright and license information, please view the
 * LICENSE file that was distributed with this source code.
 */

package com.basmilius.bastools.language.cappuccino

import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory
import org.jetbrains.annotations.NotNull

/**
 * Class CappuccinoFileTypeFactory
 *
 * @author Bas Milius <bas@mili.us>
 * @package com.basmilius.bastools.language.cappuccino
 */
class CappuccinoFileTypeFactory: FileTypeFactory()
{

	/**
	 * {@inheritdoc}
	 *
	 * @author Bas Milius <bas@mili.us>
	 */
	override fun createFileTypes(@NotNull consumer: FileTypeConsumer)
	{
		consumer.consume(CappuccinoFileType.Instance, CappuccinoFileType.Instance.defaultExtension)
	}

}
