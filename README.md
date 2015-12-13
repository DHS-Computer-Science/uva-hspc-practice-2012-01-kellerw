# Practice 2012 - 01: Grading Exams

## Background
Ms. Garrette needs help grading her multiple choice exams. To prevent
cheating, she gave each student an individualized exam. She wants to write
a program that, given an answer key and a particular student’s responses,
calculates the number of incorrect answers. Can you help her?

## Description

### Input
The first line of input is the number of test cases that follow. Each test
case starts with an integer L (0 < L ≤ 100) representing the number of
questions on the exam. The next line contains the answer key, where each
question is represented by a single letter (i.e. a, b, c, or d) corresponding
to the correct answer. The following line contains the student’s responses
in the same format.

### Output
For each case, output the line “Case x:” where x is the case number, on a single line. This is followed by
the number of student responses that did not match the answer key.

## Sample
### Input
```
2
5
abadd
abada
3
cba
abc 
```

### Output
```
Case 1: 1
Case 2: 2
```
