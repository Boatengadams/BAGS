# Practice Course

Work through each level in order. The tasks are the exercises; the matching Java files under `src/` are worked examples to check after you have tried your own solution.

For each task:

1. Read the question and acceptance checklist.
2. Write your solution before opening the reference file.
3. Try normal, boundary, and invalid input where it applies.
4. Compare your approach with the example, then improve your solution.
5. Tick the task when it works.

Compile the reference programs from the project root with:

```sh
mkdir -p out
javac --release 17 -d out $(find src -name '*.java')
```

## Levels

1. [Foundations](01-foundations.md): input, output, strings, and arithmetic.
2. [Decisions and loops](02-decisions-and-loops.md): conditions, repetition, and numeric problems.
3. [Methods and arrays](03-methods-and-arrays.md): reusable methods and structured data.
4. [Collections](04-collections.md): resizable lists and interactive menus.
5. [Object-oriented programming](05-object-oriented.md): classes, objects, composition, and interfaces.
6. [Capstone](06-capstone.md): build and extend a restaurant ordering program.

Use the [reference repository index](individual-repositories.md) to find the matching public repository for each class.
