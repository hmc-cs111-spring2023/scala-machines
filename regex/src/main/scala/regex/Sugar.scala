// package regex

// import scala.util.matching.Regex

// extension (r: RegularLanguage) {
//   def ⋅(that: RegularLanguage) = Concat(r, that)
//   def ∪(that: RegularLanguage) = Union(r, that)
// }

// val ∅ = Empty
// val ε = Epsilon

// trait RegexConversions {
//   // char to Character
//   given char2Character: Conversion[Char, RegularLanguage] = Character(_)
// }

// trait RegexProgram extends App with RegexConversions
