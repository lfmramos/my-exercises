# Word Histogram Generator

A Java application that generates word frequency histograms from text input, demonstrating two different implementation approaches: composition and inheritance.

## Overview

This project implements a word histogram generator using two different design patterns to showcase object-oriented programming concepts in Java. The program counts the frequency of words in a given text string and provides an iterable interface to access the results.

## Implementation Approaches

### 1. Composition (WordHistogramComp)
- Implements the `Iterable<String>` interface
- Uses a `HashMap` as an internal data structure
- Follows the composition design pattern by containing a Map instance
- Provides encapsulation of the underlying data structure

### 2. Inheritance (WordHistogramInheritance)
- Extends `HashMap<String, Integer>`
- Implements the `Iterable<String>` interface
- Directly inherits HashMap functionality
- More concise implementation but tighter coupling

## Key Features

- Word frequency counting
- Case-sensitive word matching
- Iterable interface implementation
- Two different design pattern implementations
- Space-delimited word parsing

## Usage

```java
// Using Composition approach
WordHistogramComp histogram1 = new WordHistogramComp("your text here");

// Using Inheritance approach
WordHistogramInheritance histogram2 = new WordHistogramInheritance("your text here");

// Get number of unique words
int uniqueWords = histogram1.size();

// Iterate through words
for (String word : histogram1) {
    int frequency = histogram1.get(word);
    System.out.println(word + ": " + frequency);
}
```

## Class Structure

### Main.java
- Contains the main entry point
- Demonstrates usage of both histogram implementations
- Includes a sample text string for testing

### WordHistogramComp.java
- Implements histogram using composition
- Methods:
  - `WordHistogramComp(String)`: Constructor that processes input text
  - `iterator()`: Returns iterator for words
  - `size()`: Returns number of unique words
  - `get(String)`: Returns frequency of specific word

### WordHistogramInheritance.java
- Implements histogram using inheritance
- Methods:
  - `WordHistogramInheritance(String)`: Constructor that processes input text
  - `iterator()`: Returns iterator for words
- Inherits all HashMap methods

## Design Considerations

### Composition vs. Inheritance
- **Composition** provides better encapsulation and looser coupling
- **Inheritance** offers a more concise implementation but tighter coupling
- Both approaches demonstrate valid object-oriented design patterns

### Performance
- Both implementations use HashMap for O(1) lookup time
- Space complexity is O(n) where n is the number of unique words

## Technical Requirements

- Java 8 or higher
- No external dependencies required

## Limitations

- Words are separated by single spaces only
- Case-sensitive word matching
- No punctuation handling
- No special character processing

## Future Improvements

1. Add case-insensitive option
2. Implement punctuation handling
3. Add support for different word separators
4. Include text file input support
5. Add statistical analysis features

## Contributing

Feel free to submit issues and enhancement requests.
