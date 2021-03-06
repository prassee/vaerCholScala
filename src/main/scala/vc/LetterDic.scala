package vc

object LetterDic {

  val letterToCode = Map(
    "ஂ" -> 2946, "ஃ" -> 2947, "அ" -> 2949, "ஆ" -> 2950,
    "இ" -> 2951, "ஈ" -> 2952, "உ" -> 2953, "ஊ" -> 2954,
    "எ" -> 2958, "ஏ" -> 2959, "ஐ" -> 2960, "ஒ" -> 2962,
    "ஓ" -> 2963, "ஔ" -> 2964, "க" -> 2965, "ங" -> 2969,
    "ச" -> 2970, "ஜ" -> 2972, "ஞ" -> 2974, "ட" -> 2975,
    "ண" -> 2979, "த" -> 2980, "ந" -> 2984, "ன" -> 2985,
    "ப" -> 2986, "ம" -> 2990, "ய" -> 2991, "ர" -> 2992,
    "ற" -> 2993, "ல" -> 2994, "ள" -> 2995, "ழ" -> 2996,
    "வ" -> 2997, "ஶ" -> 2998, "ஷ" -> 2999, "ஸ" -> 3000,
    "ஹ" -> 3001, "ா" -> 3006, "ி" -> 3007, "ீ" -> 3008,
    "ு" -> 3009, "ூ" -> 3010, "ெ " -> 3014, "ே" -> 3015,
    "ை" -> 3016, "ொ" -> 3018, "ோ" -> 3019, "ௌ" -> 3020,
    "்" -> 3021, "ௗ" -> 3031, "௦" -> 3046, "௰" -> 3056,
    "௱" -> 3057, "௲" -> 3058, "௳" -> 3059, "௴" -> 3060,
    "௵" -> 3061, "௶" -> 3062, "௷" -> 3063,
    "௸" -> 3064, "௹" -> 3065, "௺" -> 3066
  )

  val codeToLetter = Map(3021 -> "்", 3008 -> "ீ", 2953 -> "உ", 2947 -> "ஃ",
    2972 -> "ஜ", 2985 -> "ன", 3046 -> "௦", 3061 -> "௵",
    3014 -> "ெ ", 2950 -> "ஆ", 2996 -> "ழ", 2964 -> "ஔ",
    2979 -> "ண", 2965 -> "க", 2954 -> "ஊ", 2969 -> "ங",
    2986 -> "ப", 2958 -> "எ", 3065 -> "௹", 2946 -> "ஂ",
    2990 -> "ம", 3001 -> "ஹ", 3060 -> "௴", 3018 -> "ொ",
    3000 -> "ஸ", 3010 -> "ூ", 3059 -> "௳", 3064 -> "௸",
    2963 -> "ஓ", 2995 -> "ள", 2970 -> "ச", 2991 -> "ய",
    2959 -> "ஏ", 3066 -> "௺", 3006 -> "ா", 2974 -> "ஞ",
    2962 -> "ஒ", 3016 -> "ை", 2999 -> "ஷ", 2984 -> "ந",
    3009 -> "ு", 3031 -> "ௗ", 2952 -> "ஈ", 2994 -> "ல",
    3058 -> "௲", 3019 -> "ோ", 3063 -> "௷", 2992 -> "ர",
    2975 -> "ட", 2949 -> "அ", 3007 -> "ி", 2960 -> "ஐ",
    2997 -> "வ", 3056 -> "௰", 2951 -> "இ", 3062 -> "௶",
    3015 -> "ே", 3057 -> "௱", 3020 -> "ௌ", 2998 -> "ஶ",
    2993 -> "ற", 2980 -> "த")

  val vallinam = Set(letterToCode get "க", letterToCode get "ச்", letterToCode get "ட்",
    letterToCode get "த", letterToCode get "ப்", letterToCode get "ற்").map(x => x.get)

  val mellinam = Set(letterToCode get "ங்", letterToCode get "ஞ", letterToCode get "ந்",
    letterToCode get "ம", letterToCode get "ண்", letterToCode get "ன").map(x => x.get)

  val idaiyinam = Set(letterToCode get "ய", letterToCode get "ர", letterToCode get "ல்",
    letterToCode get "வ", letterToCode get "ழ", letterToCode get "ள").map(x => x.get)

  object IfElseImplicit {

    val compareFn: (Set[Int], Set[Int]) => (Int) => Option[Set[Int]] = (a: Set[Int], b: Set[Int]) => (c: Int) =>
      if (a.contains(c)) Some(a) else if (b.contains(c)) Some(b) else None

    implicit class IfElse(coll: Set[Int]) {
      def >>(anotherColl: Set[Int]) = compareFn(coll, anotherColl)
    }

    implicit class Predicate(x: (Int => Option[Set[Int]])) {
      def |^|(a: Int): Option[Set[Int]] = {
        x(a)
      }
    }

  }

  import IfElseImplicit._

  val x = (vallinam >> mellinam) |^| 23


  def find(letterCode: Int): Set[Int] = {
    val compareFn = (x: Int) => x == letterCode
    if (vallinam.contains(letterCode)) {
      vallinam
    } else if (mellinam.contains(letterCode)) {
      mellinam
    } else {
      idaiyinam
    }
  }
}

