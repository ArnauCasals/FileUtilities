# Exercise 1 - Directory List

## Description

This exercise consists of creating a Java application that lists the contents of a directory in alphabetical order.

The program validates that the directory exists and that the provided path is a valid directory before displaying all files and folders sorted alphabetically.

## Project Structure

```text
Exercise1
├── Main.java
├── DirectoryList.java
└── DirectoryValidator.java
```

## Features

- Validate that the directory exists.
- Verify that the path is a directory.
- List files and folders alphabetically.
- Sort the directory contents using `Arrays.sort()`.

## Example Directory

```text
TestDirectory
├── Documents
├── Photos
├── file1.txt
├── file2.txt
└── file3.txt
```

## Example Output

```text
Documents
Photos
file1.txt
file2.txt
file3.txt
```

## Technologies

- Java 21
- Maven
- IntelliJ IDEA