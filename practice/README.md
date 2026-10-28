# Practice Course

Work through the six chapters in order. The tasks are the exercises; the matching Java files under `src/` are worked examples to check after you have tried your own solution. The full course ZIP and a clone both include these chapters and all source examples, so you can study offline.

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

## Chapters

1. [Chapter 1: Foundations](chapters/01-foundations.md): input, output, strings, and arithmetic.
2. [Chapter 2: Decisions and loops](chapters/02-decisions-and-loops.md): conditions, repetition, and numeric problems.
3. [Chapter 3: Methods and arrays](chapters/03-methods-and-arrays.md): reusable methods and structured data.
4. [Chapter 4: Collections](chapters/04-collections.md): resizable lists and interactive menus.
5. [Chapter 5: Object-oriented programming](chapters/05-object-oriented.md): classes, objects, composition, and interfaces.
6. [Chapter 6: Capstone](chapters/06-capstone.md): build and extend a restaurant ordering program.

Download the [full course ZIP](https://github.com/Boatengadams/BAGS/archive/refs/heads/main.zip). It contains the `practice/chapters/` guides and `src/` examples. Keep the extracted folder or clone on your device and use the local chapter links; internet access is not needed to read or compile the course.

Use the [reference repository index](individual-repositories.md) to find the matching public repository for each class.
