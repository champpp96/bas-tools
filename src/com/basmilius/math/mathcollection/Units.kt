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
 * Class Units
 *
 * @author Bas Milius <bas@mili.us>
 * @package com.basmilius.math.mathcollectionø
 */
object Units
{

	// Prefixes
	val PERC = 0.01
	val PROMIL = 0.001
	val YOTTA = 1.0E24
	val ZETTA = 1.0E21
	val EXA = 1.0E18
	val PETA = 1.0E15
	val TERA = 1.0E12
	val GIGA = 1000000000.0
	val MEGA = 1000000.0
	val KILO = 1000.0
	val HECTO = 100.0
	val DECA = 10.0
	val DECI = 0.1
	val CENTI = 0.01
	val MILLI = 0.001
	val MICRO = 0.000001
	val NANO = 0.000000001
	val PICO = 1.0E-12
	val FEMTO = 1.0E-15
	val ATTO = 1.0E-18
	val ZEPTO = 1.0E-21
	val YOCTO = 1.0E-24

	// Length and Distance
	val METRE = 1.0
	val KILOMETRE = 1000.0 * METRE
	val CENTIMETRE = CENTI * METRE
	val MILLIMETRE = MILLI * METRE
	val INCH = 2.54 * CENTIMETRE
	val YARD = 0.9144 * METRE
	val FEET = 30.48 * CENTIMETRE
	val MILE = 1.609344 * KILOMETRE
	val NAUTICAL_MILE = 1.852 * KILOMETRE

	// Area
	val METRE2 = METRE * METRE
	val CENTIMETRE2 = CENTIMETRE * CENTIMETRE
	val MILLIMETRE2 = MILLIMETRE * MILLIMETRE
	val ARE = (10.0 * METRE) * (10.0 * METRE)
	val HECTARE = (100.0 * METRE) * (100.0 * METRE)
	val KILOMETRE2 = KILOMETRE * KILOMETRE
	val ACRE = (66.0 * FEET) * (660.0 * FEET)

	// Volume
	val MILLIMETRE3 = MILLIMETRE * MILLIMETRE * MILLIMETRE
	val CENTIMETRE3 = CENTIMETRE * CENTIMETRE * CENTIMETRE
	val METRE3 = METRE * METRE * METRE
	val KILOMETRE3 = KILOMETRE * KILOMETRE * KILOMETRE
	val MILLILITRE = CENTIMETRE3
	val LITRE = 1000.0 * MILLILITRE
	val GALLON = 3.78541178 * LITRE
	val PINT = 473.176473 * MILLILITRE

	// Time
	val SECOND = 1.0
	val MILLISECOND = MILLI * SECOND
	val MINUTE = 60.0 * SECOND
	val HOUR = 60.0 * MINUTE
	val DAY = 24.0 * HOUR
	val WEEK = 7.0 * DAY
	val JULIAN_YEAR = 365.25 * DAY

	// Mass
	val KILOGRAM = 1.0
	val GRAM = 0.001 * KILOGRAM
	val MILLIGRAM = MILLI * GRAM
	val DECAGRAM = DECA * GRAM
	val TONNE = 1000.0 * KILOGRAM
	val OUNCE = 28.3495231 * GRAM
	val POUND = 0.45359237 * KILOGRAM

	// Information
	val BIT = 1.0
	val KILOBIT = 1024.0 * BIT
	val MEGABIT = 1024.0 * KILOBIT
	val GIGABIT = 1024.0 * MEGABIT
	val TERABIT = 1024.0 * GIGABIT
	val PETABIT = 1024.0 * TERABIT
	val EXABIT = 1024.0 * PETABIT
	val ZETTABIT = 1024.0 * EXABIT
	val YOTTABIT = 1024.0 * ZETTABIT
	val BYTE = 8.0 * BIT
	val KILOBYTE = 1024.0 * BYTE
	val MEGABYTE = 1024.0 * KILOBYTE
	val GIGABYTE = 1024.0 * MEGABYTE
	val TERABYTE = 1024.0 * GIGABYTE
	val PETABYTE = 1024.0 * TERABYTE
	val EXABYTE = 1024.0 * PETABYTE
	val ZETTABYTE = 1024.0 * EXABYTE
	val YOTTABYTE = 1024.0 * ZETTABYTE

	// Energy
	val JOULE = (KILOGRAM * METRE * METRE) / (SECOND * SECOND)
	val ELECTRONO_VOLT = 1.6021766208E-19 * JOULE
	val KILO_ELECTRONO_VOLT = KILO * ELECTRONO_VOLT
	val MEGA_ELECTRONO_VOLT = MEGA * ELECTRONO_VOLT
	val GIGA_ELECTRONO_VOLT = GIGA * ELECTRONO_VOLT
	val TERA_ELECTRONO_VOLT = TERA * ELECTRONO_VOLT

	// Speed
	val METRE_PER_SECOND = METRE / SECOND
	val KILOMETRE_PER_HOUR = KILOMETRE / HOUR
	val MILE_PER_HOUR = MILE / HOUR
	val KNOT = 0.514444444 * METRE / SECOND

	// Acceleration
	val METRE_PER_SECOND2 = METRE / (SECOND * SECOND)
	val KILOMETRE_PER_HOUR2 = KILOMETRE / (HOUR * HOUR)
	val MILE_PER_HOUR2 = MILE / (HOUR * HOUR)

	// Angle
	val RADIAN_ARC = 1.0
	val DEGREE_ARC = (MathConstants.PI / 180.0) * RADIAN_ARC
	val MINUTE_ARC = DEGREE_ARC / 60.0
	val SECOND_ARC = MINUTE_ARC / 60.0

}
