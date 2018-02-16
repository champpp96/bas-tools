/*
 * Copyright © 2018 Bas Milius <bas@mili.us> - All rights reserved.
 *
 * This file is part of Bas Tools, a plugin for the IntelliJ Platform.
 *
 * For the full copyright and license information, please view the
 * LICENSE file that was distributed with this source code.
 */

package com.basmilius.math.mathcollection

/**
 * Object AstronomicalConstants
 *
 * @author Bas Milius <bas@mili.us>
 * @package com.basmilius.math.mathcollection
 */
object AstronomicalConstants
{

	val LIGHT_YEAR = PhysicalConstants.LIGHT_SPEED * Units.JULIAN_YEAR
	val ASTRONOMICAL_UNIT = 149597870700.0 * Units.METRE
	val PARSEC = 206264.806247096 * ASTRONOMICAL_UNIT
	val KILOPARSEC = Units.KILO * PARSEC
	val EARTH_RADIUS_EQUATORIAL = 6378.1370 * Units.KILOMETRE
	val EARTH_RADIUS_POLAR = 6356.7523 * Units.KILOMETRE
	val EARTH_RADIUS_MEAN = 6371.0088 * Units.KILOMETRE
	val EARTH_MASS = 5.9722 * Units.YOTTA * Units.KILOGRAM
	val EARTH_SEMI_MAJOR_AXIS = 1.000001018 * ASTRONOMICAL_UNIT
	val MOON_RADIUS_MEAN = 1737.1 * Units.KILOMETRE
	val MOON_MASS = 0.012300037 * EARTH_MASS
	val MONN_SEMI_MAJOR_AXIS = 384399 * Units.KILOMETRE
	val SOLAR_RADIUS = 695700 * Units.KILOMETRE
	val SOLAR_MASS = 332946.0487 * EARTH_MASS
	val MERCURY_RADIUS_MEAN = 2439.7 * Units.KILOMETRE
	val MERCURY_MASS = 0.0553 * EARTH_MASS
	val MERCURY_SEMI_MAJOR_AXIS = 0.387098 * ASTRONOMICAL_UNIT
	val VENUS_RADIUS_MEAN = 6051.8 * Units.KILOMETRE
	val VENUS_MASS = 0.815 * EARTH_MASS
	val VENUS_SEMI_MAJOR_AXIS = 0.723332 * ASTRONOMICAL_UNIT
	val MARS_RADIUS_MEAN = 3389.5 * Units.KILOMETRE
	val MARS_MASS = 0.107 * EARTH_MASS
	val MARS_SEMI_MAJOR_AXIS = 1.523679 * ASTRONOMICAL_UNIT
	val JUPITER_RADIUS_MEAN = 69911 * Units.KILOMETRE
	val JUPITER_MASS = 317.8 * EARTH_MASS
	val JUPITER_SEMI_MAJOR_AXIS = 5.20260 * ASTRONOMICAL_UNIT
	val SATURN_RADIUS_MEAN = 58232 * Units.KILOMETRE
	val SATURN_MASS = 95.159 * EARTH_MASS
	val SATURN_SEMI_MAJOR_AXIS = 9.5549 * ASTRONOMICAL_UNIT
	val URANUS_RADIUS_MEAN = 25362 * Units.KILOMETRE
	val URANUS_MASS = 14.536 * EARTH_MASS
	val URANUS_SEMI_MAJOR_AXIS = 19.2184 * ASTRONOMICAL_UNIT
	val NEPTUNE_RADIUS_MEAN = 24622 * Units.KILOMETRE
	val NEPTUNE_MASS = 17.147 * EARTH_MASS
	val NEPTUNE_SEMI_MAJOR_AXIS = 30.110387 * ASTRONOMICAL_UNIT

}
