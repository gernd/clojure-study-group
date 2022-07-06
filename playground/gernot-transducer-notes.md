Notes for Rich Hickey Talk

https://www.youtube.com/watch?v=6mTbuzafcII&t=1576s
TODO link

* what are they?
 * extract the essence of map/filter ...

* processes that can be modelled this way
 * where each steps ingests an input 
 * building a collection is just one instance
 * seeded left reduce is the generalization

* transducers carry inputs across a series of transformations

* conveyances, sources and sinks are irrelevant for the rules

* map filter mapcat are functions sequence -> sequence

* problem: no reuse
* every new collection defines its own version of map/filter...
 * streams, channels, observables, my Collection...
 
* mapcatting /filtering .. create transducers

* transducers can be composed
* transducers modify a process by transforming its reducing function

* into, sequence, transduce ... all accept transducers
* use the transducer to transform their (internal, encapsulated) reducing function
* do their job with the transformed reducing function

* many list fns can be defined in terms of foldr

* definitions of map/filter..
  * transducers want to eliminate the step of combining (i.e. conj)
  * is abstracted away (could be different for different collections)

* -> modify a process by transforming its reducing function
* transducer gets the "step" as an argument


TODO Gernot: reread about left folding vs. right folding

* we stopped at 31:20


 
