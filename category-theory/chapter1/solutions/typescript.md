> Write an identity function

```ts
function identity<T>(value: T): T {
    return value;
}
```

> Write a binary composition function
> Test that the composition function respects identity

```ts
const compose = function <A, B, C>(
    outerFunc: (arg0: B) => C,
    innerFunc: (arg0: A) => B
) {
    return function (arg0: A): C {
        return outerFunc(innerFunc(arg0));
    };
};

function sum(args: [number, number]): number {
    const [a, b] = args;
    return a + b;
}

const compositeFunc1 = compose(identity, sum);

const compositeFunc2 = compose(sum, identity);
```

> Is the worldwide web a category in any sense? Are hyperlinks morphisms?

If pages are objects and hyperlinks are arrows, yes. Every page can be interpreted as having an arrow to itself. And a hyperlink from page A to page B composed with a hyperlink from page B to page C is equivalent to a hyperlink from page A to page C.

> Are Facebook profiles and Facebook friendships a category?

Nope.

> When is a directed graph a category?

-   Must be directed
-   Must be unweighted
-   Can be cyclical or acyclical
