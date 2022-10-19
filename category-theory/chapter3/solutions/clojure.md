# 1
## a

```mermaid
  graph TD
    node((Node))
    node -- id --> node
```

## b
```mermaid
graph TD
 node((Node))
 node -- id --> node
 node -- a --> node
 node -- a o a --> node
 node -- a o id --> node
```

## c 
```mermaid
graph TD
 first-node((firstNode))
 second-node((secondNode))
 first-node -- a --> second-node
 first-node -- id1 --> first-node
 second-node -- id2 --> second-node
 first-node -- a o id1 --> second-node
 first-node -- id2 o a --> second-node
```

## d
will result in infinite arrows (combination of all possibilities for constructing homomorphisms from the single character homorphisms) but they are essentially the same morphism

# 2
## a
* composition works is associative -> preorder
* if A subset B and B subset A -> A = B 
* partial order
* any two objects are in relation with each other -> not neccessarily!

## b



