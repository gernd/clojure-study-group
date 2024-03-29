* universal construction: defining objects in terms of their relationships
* pick a pattern (particular shape constructed from objects and morphisms) and look for all its occurences in the category
* establish some kind of ranking among those hits and pick, what would be considered the best fit

# Initial object
* simplest shape is a single object -> there are as many instances of that shape as there are objects in the category
* -> needed: a ranking: an object that tops the hierarchy
* in partial orders and ordered categories in general: over net flow of arrows (morphisms) from one end of the catetory to the other
* generalized: Object a is more initial than b if there is an arrow from a to b
* initial objects: has arrows to all other objects
* is is not guaranteed, that this object exists (or if there is only one)
* better definition: the inital object is the object that has one and only one morphism going to any object in the category
** even that does not guarantee uniqueness of the object (but uniqueness up to isomorphism)
* examples
  * initial object in a partially ordered set (a poset) is its least element
    * some posets do not have an initial object (like the set of all integers, positive and negative with less-than or equal relation for morphisms)
  * in the category of sets and functions, the initial object is the empty set


# Terminal object
* definition: object a is "more terminal" than object b, if there is a morphism going from b to a
* definition terminal object: the object with one and only one morphism coming to it from any other object in the category
* in a poset: biggest object
* category of sets: singleton set

# Duality
* definition of the opposite category for a category C: just reverse all arrows
* the new category automatically satisfies all the requirements of a category, if composition is redefined
  accordingly.
* the construction of the opposite category are often prefixed with co
  * comonads
  * coproducts
  ...
* the initial object in one category becomes the terminal object in the other category

# Isomorphisms
* in general: a definition of equality
* intuition: isomorphic objects look the same - "they have the same shape"
  * every part of one object corresponds to some part of another object in a one-to-one mapping
  * mathematically: mapping exists from a to b and from b to a
  * in category theory: mappings are replaced with morphisms
  * isomorphism: invertible morphism: pair of morphisms, one being the inverse of the other
  * f is the inverse of g (and vice versa) if:
    * f o g = id
    * g o f = id
* read on: page 57 bottom


# Next up: products

