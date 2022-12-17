* in imperative programming, often global state is mutated
* this leads to non-pure functions (functions can't be memoized)
* example: function that computes something and also writes a log
* solution: pass variable explicitly
  * memoization still difficult depending on the states, that all the variable can have 
* how can the concerns be separated -> aggregating the logs inbetween calls
* generic way for "piggybacking" values on top of their regular return vales: "embellishing" functions
 -> generic functions to return an additional return type for a certain value
* question: how to compose embellished functions?

# The Writer category
* types stay as objects
* morphisms are redefined to be embellished functions
* example: isEven function: int -> pair(bool, string)
  * considered as a morphism from  int -> bool, even it also returns a string in addition
* howto compose embellished functions?
  * problem: input/output does not match
  * definition of composition
    * execute first embellished functions
    * extract first part of the result and pass it to the second embellished function
    * return a pair with the first part of the second computation and the second parts combined of the two computations
* definition of the identity function
  * pass the argument and retuns an empty additional result

# Kleisli Categories
* Kleisli Categories are categories based on monads
* every Kleisli Category has a unique way of defining identity functions and compositions using the embellished functions as morphisms
* in this examples, the writer monad was used
* Kleisli Categories have as objects the types of the underlying programming language
* Morphisms from type A to type B are functions that go from A to a type derived from B using the particular embellishment
* Each Kleisli Category defines its own way of composing such morphisms, as well as the identity morphisms with respect to that composition
* in this category: morphisms (functions) do more than just pass the output from one function to another function
