package com.basmilius.ps.bastools.util.strtotime

import org.apache.commons.lang.StringUtils
import org.apache.commons.lang.time.DateUtils
import java.util.*
import java.util.regex.Pattern

class WeeksMatcher : Matcher
{

	private val weeks = Pattern.compile("[\\-+]?\\d+ weeks")

	override fun tryConvert(input : String, refDateStr : String) : Date?
	{
		val calendar = Calendar.getInstance()

		if (!StringUtils.isEmpty(refDateStr))
		{
			try
			{
				calendar.time = DateUtils.parseDate(refDateStr, Array(1) { "yyyy-MM-dd" })
			}
			catch (e : Exception)
			{
			}
		}

		if (weeks.matcher(input).matches())
		{
			val w = input.split(" ")[0].toInt()
			calendar.add(Calendar.DAY_OF_YEAR, w * 7)
			return calendar.time
		}

		return null
	}

}
