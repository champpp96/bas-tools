/*
 * Copyright © 2018 Bas Milius <bas@mili.us> - All rights reserved.
 *
 * This file is part of Bas Tools, a plugin for the IntelliJ Platform.
 *
 * For the full copyright and license information, please view the
 * LICENSE file that was distributed with this source code.
 */

package com.basmilius.math.parsertokens

import com.basmilius.math.MathParser

/**
 * Object Function1Arg
 *
 * @author Bas Milius <bas@mili.us>
 * @package com.basmilius.math.parsertokens
 */
object Function1Arg
{

	// UnaryFunction - token type id.
	val TYPE_ID = 4
	val TYPE_DESC = "Unary Function"

	// UnaryFunction - tokens id.
	val SIN_ID = 1
	val COS_ID = 2
	val TAN_ID = 3
	val CTAN_ID = 4
	val SEC_ID = 5
	val COSEC_ID = 6
	val ASIN_ID = 7
	val ACOS_ID = 8
	val ATAN_ID = 9
	val ACTAN_ID = 10
	val LN_ID = 11
	val LOG2_ID = 12
	val LOG10_ID = 13
	val RAD_ID = 14
	val EXP_ID = 15
	val SQRT_ID = 16
	val SINH_ID = 17
	val COSH_ID = 18
	val TANH_ID = 19
	val COTH_ID = 20
	val SECH_ID = 21
	val CSCH_ID = 22
	val DEG_ID = 23
	val ABS_ID = 24
	val SGN_ID = 25
	val FLOOR_ID = 26
	val CEIL_ID = 27
	val NOT_ID = 29
	val ARSINH_ID = 30
	val ARCOSH_ID = 31
	val ARTANH_ID = 32
	val ARCOTH_ID = 33
	val ARSECH_ID = 34
	val ARCSCH_ID = 35
	val SA_ID = 36
	val SINC_ID = 37
	val BELL_NUMBER_ID = 38
	val LUCAS_NUMBER_ID = 39
	val FIBONACCI_NUMBER_ID = 40
	val HARMONIC_NUMBER_ID = 41
	val IS_PRIME_ID = 42
	val PRIME_COUNT_ID = 43
	val EXP_INT_ID = 44
	val LOG_INT_ID = 45
	val OFF_LOG_INT_ID = 46
	val GAUSS_ERF_ID = 47
	val GAUSS_ERFC_ID = 48
	val GAUSS_ERF_INV_ID = 49
	val GAUSS_ERFC_INV_ID = 50
	val ULP_ID = 51
	val ISNAN_ID = 52
	val NDIG10_ID = 53
	val NFACT_ID = 54
	val ARCSEC_ID = 55
	val ARCCSC_ID = 56

	// UnaryFunction - tokens key words.
	val SIN_STR = "sin"
	val COS_STR = "cos"
	val TAN_STR = "tan"
	val TG_STR = "tg"
	val CTAN_STR = "ctan"
	val CTG_STR = "ctg"
	val COT_STR = "cot"
	val SEC_STR = "sec"
	val COSEC_STR = "cosec"
	val CSC_STR = "csc"
	val ASIN_STR = "asin"
	val ARSIN_STR = "arsin"
	val ARCSIN_STR = "arcsin"
	val ACOS_STR = "acos"
	val ARCOS_STR = "arcos"
	val ARCCOS_STR = "arccos"
	val ATAN_STR = "atan"
	val ARCTAN_STR = "arctan"
	val ATG_STR = "atg"
	val ARCTG_STR = "arctg"
	val ACTAN_STR = "actan"
	val ARCCTAN_STR = "arcctan"
	val ACTG_STR = "actg"
	val ARCCTG_STR = "arcctg"
	val ACOT_STR = "acot"
	val ARCCOT_STR = "arccot"
	val LN_STR = "ln"
	val LOG2_STR = "log2"
	val LOG10_STR = "log10"
	val RAD_STR = "rad"
	val EXP_STR = "exp"
	val SQRT_STR = "sqrt"
	val SINH_STR = "sinh"
	val COSH_STR = "cosh"
	val TANH_STR = "tanh"
	val TGH_STR = "tgh"
	val CTANH_STR = "ctanh"
	val COTH_STR = "coth"
	val CTGH_STR = "ctgh"
	val SECH_STR = "sech"
	val CSCH_STR = "csch"
	val COSECH_STR = "cosech"
	val DEG_STR = "deg"
	val ABS_STR = "abs"
	val SGN_STR = "sgn"
	val FLOOR_STR = "floor"
	val CEIL_STR = "ceil"
	val NOT_STR = "not"
	val ASINH_STR = "asinh"
	val ARSINH_STR = "arsinh"
	val ARCSINH_STR = "arcsinh"
	val ACOSH_STR = "acosh"
	val ARCOSH_STR = "arcosh"
	val ARCCOSH_STR = "arccosh"
	val ATANH_STR = "atanh"
	val ARCTANH_STR = "arctanh"
	val ATGH_STR = "atgh"
	val ARCTGH_STR = "arctgh"
	val ACTANH_STR = "actanh"
	val ARCCTANH_STR = "arcctanh"
	val ACOTH_STR = "acoth"
	val ARCOTH_STR = "arcoth"
	val ARCCOTH_STR = "arccoth"
	val ACTGH_STR = "actgh"
	val ARCCTGH_STR = "arcctgh"
	val ASECH_STR = "asech"
	val ARSECH_STR = "arsech"
	val ARCSECH_STR = "arcsech"
	val ACSCH_STR = "acsch"
	val ARCSCH_STR = "arcsch"
	val ARCCSCH_STR = "arccsch"
	val ACOSECH_STR = "acosech"
	val ARCOSECH_STR = "arcosech"
	val ARCCOSECH_STR = "arccosech"
	val SA_STR = "sinc"
	val SA1_STR = "Sa"
	val SINC_STR = "Sinc"
	val BELL_NUMBER_STR = "Bell"
	val LUCAS_NUMBER_STR = "Luc"
	val FIBONACCI_NUMBER_STR = "Fib"
	val HARMONIC_NUMBER_STR = "harm"
	val IS_PRIME_STR = "ispr"
	val PRIME_COUNT_STR = "Pi"
	val EXP_INT_STR = "Ei"
	val LOG_INT_STR = "li"
	val OFF_LOG_INT_STR = "Li"
	val GAUSS_ERF_STR = "erf"
	val GAUSS_ERFC_STR = "erfc"
	val GAUSS_ERF_INV_STR = "erfInv"
	val GAUSS_ERFC_INV_STR = "erfcInv"
	val ULP_STR = "ulp"
	val ISNAN_STR = "isNaN"
	val NDIG10_STR = "ndig10"
	val NFACT_STR = "nfact"
	val ARCSEC_STR = "arcsec"
	val ARCCSC_STR = "arccsc"

	// UnaryFunction - syntax.
	val SIN_SYN = SIN_STR + "(x)"
	val COS_SYN = COS_STR + "(x)"
	val TAN_SYN = TAN_STR + "(x)"
	val TG_SYN = TG_STR + "(x)"
	val CTAN_SYN = CTAN_STR + "(x)"
	val CTG_SYN = CTG_STR + "(x)"
	val COT_SYN = COT_STR + "(x)"
	val SEC_SYN = SEC_STR + "(x)"
	val COSEC_SYN = COSEC_STR + "(x)"
	val CSC_SYN = CSC_STR + "(x)"
	val ASIN_SYN = ASIN_STR + "(x)"
	val ARSIN_SYN = ARSIN_STR + "(x)"
	val ARCSIN_SYN = ARCSIN_STR + "(x)"
	val ACOS_SYN = ACOS_STR + "(x)"
	val ARCOS_SYN = ARCOS_STR + "(x)"
	val ARCCOS_SYN = ARCCOS_STR + "(x)"
	val ATAN_SYN = ATAN_STR + "(x)"
	val ARCTAN_SYN = ARCTAN_STR + "(x)"
	val ATG_SYN = ATG_STR + "(x)"
	val ARCTG_SYN = ARCTG_STR + "(x)"
	val ACTAN_SYN = ACTAN_STR + "(x)"
	val ARCCTAN_SYN = ARCCTAN_STR + "(x)"
	val ACTG_SYN = ACTG_STR + "(x)"
	val ARCCTG_SYN = ARCCTG_STR + "(x)"
	val ACOT_SYN = ACOT_STR + "(x)"
	val ARCCOT_SYN = ARCCOT_STR + "(x)"
	val LN_SYN = LN_STR + "(x)"
	val LOG2_SYN = LOG2_STR + "(x)"
	val LOG10_SYN = LOG10_STR + "(x)"
	val RAD_SYN = RAD_STR + "(x)"
	val EXP_SYN = EXP_STR + "(x)"
	val SQRT_SYN = SQRT_STR + "(x)"
	val SINH_SYN = SINH_STR + "(x)"
	val COSH_SYN = COSH_STR + "(x)"
	val TANH_SYN = TANH_STR + "(x)"
	val TGH_SYN = TGH_STR + "(x)"
	val CTANH_SYN = CTANH_STR + "(x)"
	val COTH_SYN = COTH_STR + "(x)"
	val CTGH_SYN = CTGH_STR + "(x)"
	val SECH_SYN = SECH_STR + "(x)"
	val CSCH_SYN = CSCH_STR + "(x)"
	val COSECH_SYN = COSECH_STR + "(x)"
	val DEG_SYN = DEG_STR + "(x)"
	val ABS_SYN = ABS_STR + "(x)"
	val SGN_SYN = SGN_STR + "(x)"
	val FLOOR_SYN = FLOOR_STR + "(x)"
	val CEIL_SYN = CEIL_STR + "(x)"
	val NOT_SYN = NOT_STR + "(x)"
	val ASINH_SYN = ASINH_STR + "(x)"
	val ARSINH_SYN = ARSINH_STR + "(x)"
	val ARCSINH_SYN = ARCSINH_STR + "(x)"
	val ACOSH_SYN = ACOSH_STR + "(x)"
	val ARCOSH_SYN = ARCOSH_STR + "(x)"
	val ARCCOSH_SYN = ARCCOSH_STR + "(x)"
	val ATANH_SYN = ATANH_STR + "(x)"
	val ARCTANH_SYN = ARCTANH_STR + "(x)"
	val ATGH_SYN = ATGH_STR + "(x)"
	val ARCTGH_SYN = ARCTGH_STR + "(x)"
	val ACTANH_SYN = ACTANH_STR + "(x)"
	val ARCCTANH_SYN = ARCCTANH_STR + "(x)"
	val ACOTH_SYN = ACOTH_STR + "(x)"
	val ARCOTH_SYN = ARCOTH_STR + "(x)"
	val ARCCOTH_SYN = ARCCOTH_STR + "(x)"
	val ACTGH_SYN = ACTGH_STR + "(x)"
	val ARCCTGH_SYN = ARCCTGH_STR + "(x)"
	val ASECH_SYN = ASECH_STR + "(x)"
	val ARSECH_SYN = ARSECH_STR + "(x)"
	val ARCSECH_SYN = ARCSECH_STR + "(x)"
	val ACSCH_SYN = ACSCH_STR + "(x)"
	val ARCSCH_SYN = ARCSCH_STR + "(x)"
	val ARCCSCH_SYN = ARCCSCH_STR + "(x)"
	val ACOSECH_SYN = ACOSECH_STR + "(x)"
	val ARCOSECH_SYN = ARCOSECH_STR + "(x)"
	val ARCCOSECH_SYN = ARCCOSECH_STR + "(x)"
	val SA_SYN = SA_STR + "(x)"
	val SA1_SYN = SA1_STR + "(x)"
	val SINC_SYN = SINC_STR + "(x)"
	val BELL_NUMBER_SYN = BELL_NUMBER_STR + "(n)"
	val LUCAS_NUMBER_SYN = LUCAS_NUMBER_STR + "(n)"
	val FIBONACCI_NUMBER_SYN = FIBONACCI_NUMBER_STR + "(n)"
	val HARMONIC_NUMBER_SYN = HARMONIC_NUMBER_STR + "(n)"
	val IS_PRIME_SYN = IS_PRIME_STR + "(n)"
	val PRIME_COUNT_SYN = PRIME_COUNT_STR + "(n)"
	val EXP_INT_SYN = EXP_INT_STR + "(x)"
	val LOG_INT_SYN = LOG_INT_STR + "(x)"
	val OFF_LOG_INT_SYN = OFF_LOG_INT_STR + "(x)"
	val GAUSS_ERF_SYN = GAUSS_ERF_STR + "(x)"
	val GAUSS_ERFC_SYN = GAUSS_ERFC_STR + "(x)"
	val GAUSS_ERF_INV_SYN = GAUSS_ERF_INV_STR + "(x)"
	val GAUSS_ERFC_INV_SYN = GAUSS_ERFC_INV_STR + "(x)"
	val ULP_SYN = ULP_STR + "(x)"
	val ISNAN_SYN = ISNAN_STR + "(x)"
	val NDIG10_SYN = NDIG10_STR + "(x)"
	val NFACT_SYN = NFACT_STR + "(x)"
	val ARCSEC_SYN = ARCSEC_STR + "(x)"
	val ARCCSC_SYN = ARCCSC_STR + "(x)"

	// UnaryFunction - tokens description.
	val SIN_DESC = "Trigonometric sine function"
	val COS_DESC = "Trigonometric cosine function"
	val TAN_DESC = "Trigonometric tangent function"
	val CTAN_DESC = "Trigonometric cotangent function"
	val SEC_DESC = "Trigonometric secant function"
	val COSEC_DESC = "Trigonometric cosecant function"
	val ASIN_DESC = "Inverse trigonometric sine function"
	val ACOS_DESC = "Inverse trigonometric cosine function"
	val ATAN_DESC = "Inverse trigonometric tangent function"
	val ACTAN_DESC = "Inverse trigonometric cotangent function"
	val LN_DESC = "Natural logarithm function (base e)"
	val LOG2_DESC = "Binary logarithm function (base 2)"
	val LOG10_DESC = "Common logarithm function (base 10)"
	val RAD_DESC = "Degrees to radians function"
	val EXP_DESC = "Exponential function"
	val SQRT_DESC = "Squre root function"
	val SINH_DESC = "Hyperbolic sine function"
	val COSH_DESC = "Hyperbolic cosine function"
	val TANH_DESC = "Hyperbolic tangent function"
	val COTH_DESC = "Hyperbolic cotangent function"
	val SECH_DESC = "Hyperbolic secant function"
	val CSCH_DESC = "Hyperbolic cosecant function"
	val DEG_DESC = "Radians to degrees function"
	val ABS_DESC = "Absolut value function"
	val SGN_DESC = "Signum function"
	val FLOOR_DESC = "Floor function"
	val CEIL_DESC = "Ceiling function"
	val NOT_DESC = "Negation function"
	val ARSINH_DESC = "Inverse hyperbolic sine function"
	val ARCOSH_DESC = "Inverse hyperbolic cosine function"
	val ARTANH_DESC = "Inverse hyperbolic tangent function"
	val ARCOTH_DESC = "Inverse hyperbolic cotangent function"
	val ARSECH_DESC = "Inverse hyperbolic secant function"
	val ARCSCH_DESC = "Inverse hyperbolic cosecant function"
	val SA_DESC = "Sinc function (normalized)"
	val SINC_DESC = "Sinc function (unnormalized)"
	val BELL_NUMBER_DESC = "Bell number"
	val LUCAS_NUMBER_DESC = "Lucas number"
	val FIBONACCI_NUMBER_DESC = "Fibonacci number"
	val HARMONIC_NUMBER_DESC = "Harmonic number"
	val IS_PRIME_DESC = "Prime number test (is number a prime?)"
	val PRIME_COUNT_DESC = "Prime-counting function - Pi(x)"
	val EXP_INT_DESC = "Exponential integral function (non-elementary special function) - usage example: Ei(x)"
	val LOG_INT_DESC = "Logarithmic integral function (non-elementary special function) - usage example: li(x)"
	val OFF_LOG_INT_DESC = "Offset logarithmic integral function (non-elementary special function) - usage example: Li(x)"
	val GAUSS_ERF_DESC = "Gauss error function (non-elementary special function) - usage example: 2 + erf(x)"
	val GAUSS_ERFC_DESC = "Gauss complementary error function (non-elementary special function) - usage example: 1 - erfc(x)"
	val GAUSS_ERF_INV_DESC = "Inverse Gauss error function (non-elementary special function) - usage example: erfInv(x)"
	val GAUSS_ERFC_INV_DESC = "Inverse Gauss complementary error function (non-elementary special function) - usage example: erfcInv(x)"
	val ULP_DESC = "Unit in The Last Place - ulp(0.1)"
	val ISNAN_DESC = "Returns true = 1 if value is a Not-a-Number (NaN), false = 0 otherwise - usage example: isNaN(x)"
	val NDIG10_DESC = "Number of digits in numeral system with base 10"
	val NFACT_DESC = "Prime decomposition - number of distinct prime factors"
	val ARCSEC_DESC = "Inverse trigonometric secant"
	val ARCCSC_DESC = "Inverse trigonometric cosecant"

	// UnaryFunction - tokens description.
	val SIN_SINCE = MathParser.NAMEv10
	val COS_SINCE = MathParser.NAMEv10
	val TAN_SINCE = MathParser.NAMEv10
	val CTAN_SINCE = MathParser.NAMEv10
	val SEC_SINCE = MathParser.NAMEv10
	val COSEC_SINCE = MathParser.NAMEv10
	val ASIN_SINCE = MathParser.NAMEv10
	val ACOS_SINCE = MathParser.NAMEv10
	val ATAN_SINCE = MathParser.NAMEv10
	val ACTAN_SINCE = MathParser.NAMEv10
	val LN_SINCE = MathParser.NAMEv10
	val LOG2_SINCE = MathParser.NAMEv10
	val LOG10_SINCE = MathParser.NAMEv10
	val RAD_SINCE = MathParser.NAMEv10
	val EXP_SINCE = MathParser.NAMEv10
	val SQRT_SINCE = MathParser.NAMEv10
	val SINH_SINCE = MathParser.NAMEv10
	val COSH_SINCE = MathParser.NAMEv10
	val TANH_SINCE = MathParser.NAMEv10
	val COTH_SINCE = MathParser.NAMEv10
	val SECH_SINCE = MathParser.NAMEv10
	val CSCH_SINCE = MathParser.NAMEv10
	val DEG_SINCE = MathParser.NAMEv10
	val ABS_SINCE = MathParser.NAMEv10
	val SGN_SINCE = MathParser.NAMEv10
	val FLOOR_SINCE = MathParser.NAMEv10
	val CEIL_SINCE = MathParser.NAMEv10
	val NOT_SINCE = MathParser.NAMEv10
	val ARSINH_SINCE = MathParser.NAMEv10
	val ARCOSH_SINCE = MathParser.NAMEv10
	val ARTANH_SINCE = MathParser.NAMEv10
	val ARCOTH_SINCE = MathParser.NAMEv10
	val ARSECH_SINCE = MathParser.NAMEv10
	val ARCSCH_SINCE = MathParser.NAMEv10
	val SA_SINCE = MathParser.NAMEv10
	val SINC_SINCE = MathParser.NAMEv10
	val BELL_NUMBER_SINCE = MathParser.NAMEv10
	val LUCAS_NUMBER_SINCE = MathParser.NAMEv10
	val FIBONACCI_NUMBER_SINCE = MathParser.NAMEv10
	val HARMONIC_NUMBER_SINCE = MathParser.NAMEv10
	val IS_PRIME_SINCE = MathParser.NAMEv23
	val PRIME_COUNT_SINCE = MathParser.NAMEv23
	val EXP_INT_SINCE = MathParser.NAMEv23
	val LOG_INT_SINCE = MathParser.NAMEv23
	val OFF_LOG_INT_SINCE = MathParser.NAMEv23
	val GAUSS_ERF_SINCE = MathParser.NAMEv30
	val GAUSS_ERFC_SINCE = MathParser.NAMEv30
	val GAUSS_ERF_INV_SINCE = MathParser.NAMEv30
	val GAUSS_ERFC_INV_SINCE = MathParser.NAMEv30
	val ULP_SINCE = MathParser.NAMEv30
	val ISNAN_SINCE = MathParser.NAMEv41
	val NDIG10_SINCE = MathParser.NAMEv41
	val NFACT_SINCE = MathParser.NAMEv41
	val ARCSEC_SINCE = MathParser.NAMEv41
	val ARCCSC_SINCE = MathParser.NAMEv41

}
