# BAGS Java Practice Path

This is one Java project arranged as a step-by-step practice course. Start with input and output, then move through decisions, loops, arrays, collections, and object-oriented programming before building the restaurant ordering capstone.

## Start here

Open the [practice guide](practice/README.md) and follow the levels in order. Each task gives you a prompt, a reference example under `src/`, and a checklist. Try the task before reading its reference code.

| Level | Focus |
| --- | --- |
| 1 | Java basics, input, output, strings, and numbers |
| 2 | Conditions, loops, and problem solving |
| 3 | Methods and arrays |
| 4 | Lists and menu driven programs |
| 5 | Classes, objects, and interfaces |
| 6 | Restaurant ordering capstone |

## Compile the examples

Install JDK 17 or newer, then compile all examples from the project root:

```sh
mkdir -p out
javac --release 17 -d out $(find src -name '*.java')
```

Run a packaged example by its package and class name. For example:

```sh
java -cp out Loop.Fibonacci
```

See [individual class repositories](practice/individual-repositories.md) for the one-class GitHub repositories. Some include supporting classes so they compile on their own.
