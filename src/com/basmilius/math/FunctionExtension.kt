/*
 * Copyright © 2018 Bas Milius <bas@mili.us> - All rights reserved.
 *
 * This file is part of Bas Tools, a plugin for the IntelliJ Platform.
 *
 * For the full copyright and license information, please view the
 * LICENSE file that was distributed with this source code.
 */

package com.basmilius.math

/**
 * Interface FunctionExtension
 *
 * @author Bas Milius <bas@mili.us>
 * @package com.basmilius.math
 */
interface FunctionExtension
{

	/**
	 * Gets parameters number.
	 *
	 * @return Int
	 *
	 * @author Bas Milius <bas@mili.us>
	 */
	fun getParametersNumber(): Int

	/**
	 * Sets value of function parameter.
	 *
	 * @param parameterIndex Int
	 * @param parameterValue Double
	 *
	 * @author Bas Milius <bas@mili.us>
	 */
	fun setParameterValue(parameterIndex: Int, parameterValue: Double)

	/**
	 * Gets parameter name.
	 *
	 * @param parameterIndex Int
	 *
	 * @return String
	 *
	 * @author Bas Milius <bas@mili.us>
	 */
	fun getParameterName(parameterIndex: Int): String

	/**
	 * Actual algorithm implementation.
	 *
	 * @return Double
	 *
	 * @author Bas Milius <bas@mili.us>
	 */
	fun calculate(): Double

	/**
	 *
	 *
	 * @author Bas Milius <bas@mili.us>
	 */
	fun clone(): FunctionExtension

}
