# Notes Gernot
## Who needs types?
* Thought experiment: random bytes produced by monkey using typewriters
  * machine language: any combination of bytes would be accepted
  * higher level languages: lexical and grammatical errors can be detected before
  * types: introduce another barrier against nonsensical programs
    * statically typed languages: type errors are caught at compile time
    * dynamically typed languages: type errors are caught at runtime
## Types are about Composability
* Category Theory: composing arrows - target object of the one arrow has to be the source object of the other arrow
* in programming: result of one function is passed to another function
* the stronger the type system, the better this match can be described and mechanically verified
* arguments against strong static type checking
  * might eliminate programs, that are semantically correct
  * imposes too much burden on the programmer (counter argument: use type inference)
* in Haskell: common approach to start with the type definitions
* strong static typing is often used as an excuse for not testing the code (if it compiles, then it must be correct)
  * does not necessarily result in better code quality
* vice versa: unit testing is not a replacement for types 
## What are Types?
* simplest intuition: sets of values (e.g. type Bool is a set of two values: True and False, Char is a set of all Unicode Characters..)
  * sets can be finite or infinite (example of an infinite set: String)
  * problems: polymorphic functions that involve circular definitions and the fact that you can't have a set of all sets
* Category of sets: Set
  * Objects are sets, arrows (morphisms) are functions
  * Set Category is special: we can peek inside the objects (e.g. an empty set has no elements)
    * there are special one element sets
    * functions map elements from one set to elements of another set
    * they can map two elements to one, but not one element to two 
    * identity functions maps every element to itself
    
* in an ideal world: Haskell types are sets and Haskell functions are mathematical functions between them
  * problem: computation takes place, which might involve recursion or might not terminate
  * solution: bottom type (indicating, that it does not terminate) - $\bot$
  * treat every runtime error as $\bot$  (in Haskell: undefined)
  * functions that may return bottom are called partial (as opposed to total functions, which return valid results
  for every possible argument)
## Why do we need a mathematical model?
* syntax and grammar of a programming language is usually described using formal notation at the very beginning of the language spec
* meaning/semantics is much harder to describe
  * formal tools for describing semantics: operational semantic
  * semantics of industrial languages like C++ are is usually described using an abstract machine
  * problem: hard to prove things about programs using operational semantics (you have to "run" it through the idealized interpreter)
* denotational semantics
  * based on math
  * every programming construct is given its mathematical interpretation
  * if you want to prove a property of a program, you prove a mathematical theorem
  * question: what is the mathematical model for reading a character from the keyboard?
    * -> computational effects can be mapped to monads!
* having a mathematical model allows for formal proofs of software
## Pure and Dirty Functions
* mathematical function: mapping of values to values
* function having no side effects (e.g. computation of square root) can be easily modelled as a mathematical function
* in a purely functional programming language like Haskell: all functions are pure -> easier to give them denotational semantics and model them using category theory
* for other languages: always possible to restrict yourself to a pure subset
* monads let us model all kind of affects using only pure functions
## Examples of types
* exotic types: empty set (not inhabited by any values)
    * in Haskell: void
    * Void -> a : polymorphic function in its return type, can never be called
    * Void represents falsity
    * in C++ there is no such type "no type"
  * type that represents a singleton sets, has only one value
    * just value
    * in C++: void
    * in Haskell: () (Unit)
    * function int () {return 44}; : Unit -> Int
      ```mermaid
        graph TD
        a(("{Unit}")) -->b((Int))
      ```
      * every call of the function is a different way of picking one element from the target type (in tthis case 44)
      * -> call of the function is a different way of describing the element 44 from the int type
      * pure functions that return Unit (or Void) discard their arguemnt (as they are not allowed to have side effects)
    * unit: A -> Void
    * unit x = ()
      * maps every element of A to the element "Void" of the single set
      * implementation does not depend on the type of the argument -> "parametrically polymorphic"
    ```mermaid
      graph TD
          a((String)) -->b(("{Unit}"))
          c((Integer)) -->b(("{Unit}"))
          d((Float)) -->b(("{Unit}"))
    ```
  * two-element set: $Bool = {True, False}$
  * functions to Bool are called predicates
## Challenges

    



