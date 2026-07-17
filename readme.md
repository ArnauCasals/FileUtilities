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

## Exercise 2 - Recursive Directory Tree

### Description

This exercise extends the previous directory listing functionality.
The program now displays a complete directory tree recursively, showing all levels of the directory structure.

The output is ordered alphabetically at each level and indicates:
- `D` for directories
- `F` for files
- The last modification date of each element

### Implementation

The solution is divided into:

- `Main.java`: Starts the program and validates the directory.
- `DirectoryValidator.java`: Checks if the directory exists and is valid.
- `DirectoryList.java`: Recursively explores the directory tree and displays the information.

### Example

#### Directory Structure

```text
TestDirectory
├── Documents
│   ├── document1
│   └── document2
├── Photos
│   ├── image1
│   └── image2
├── file1.txt
├── file2.text
└── file3.txt
```

### Output

```text
D Documents - 16/07/2026 11:05
    F document1 - 16/07/2026 11:05
    F document2 - 16/07/2026 11:05
D Photos - 16/07/2026 11:05
    F image1 - 16/07/2026 11:05
    F image2 - 16/07/2026 11:05
F file1.txt - 16/07/2026 11:05
F file2.text - 16/07/2026 11:05
F file3.txt - 16/07/2026 11:05
```

## Exercise 3 - Save Directory Tree to a TXT File

### Description

This exercise extends the previous one. Instead of displaying the directory tree on the console, the program saves the result to a TXT file.

### Implementation

The solution is divided into:

- `Main.java`: Starts the program, validates the directory and writes the result to a TXT file.
- `DirectoryValidator.java`: Checks if the directory exists and is valid.
- `DirectoryList.java`: Recursively traverses the directory tree and stores the output in a `StringBuilder`.
- `FileWriterUtil.java`: Creates and writes the TXT file.

### Example

#### Directory Structure

```text
TestDirectory
├── Documents
│   ├── document1
│   └── document2
├── Photos
│   ├── image1
│   └── image2
├── file1.txt
├── file2.text
└── file3.txt
```

#### Generated TXT File (`directoryTree.txt`)

```text
D Documents - 16/07/2026 11:05
    F document1 - 16/07/2026 11:05
    F document2 - 16/07/2026 11:05
D Photos - 16/07/2026 11:05
    F image1 - 16/07/2026 11:05
    F image2 - 16/07/2026 11:05
F file1.txt - 16/07/2026 11:05
F file2.text - 16/07/2026 11:05
F file3.txt - 16/07/2026 11:05
```

### Features

- ✅ Output saved to a TXT file


## Exercise 4 - Read a TXT File

### Description

This exercise adds the functionality to read any TXT file and display its content on the console.

The program validates that the selected file exists, checks that it is a TXT file, reads all its lines, and prints them to the console.

### Implementation

The solution is divided into:

- `Main.java`: Starts the program and selects the TXT file to read.
- `FileValidator.java`: Checks if the file exists, is a file, and has the `.txt` extension.
- `FileReaderUtil.java`: Reads the TXT file and displays its content line by line on the console.

### Example

#### TXT File (`example.txt`)

```text
Hello,
This is a text file.
Exercise 4.
```

#### Console Output

```text
Hello,
This is a text file.
Exercise 4.
```

### Features

- ✅ Reads any TXT file
- ✅ Validates the selected file
- ✅ Displays the file content on the console
- ✅ Handles reading errors using exception handling


## Exercise 5 - Object Serialization and Deserialization

### Description

This exercise demonstrates how to serialize a Java object into a `.ser` file and then deserialize it back into an object.

The program creates a `Person` object, saves it to a binary file, reads it again, and displays the recovered object on the console.

### Implementation

The solution is divided into:

- `Main.java`: Creates the object, serializes it, deserializes it, and displays the result.
- `Person.java`: Represents the object to be serialized. It implements the `Serializable` interface.
- `Serializer.java`: Handles the serialization and deserialization processes using `ObjectOutputStream` and `ObjectInputStream`.

### Example

#### Serialized Object

```text
Person
- Name: Arnau
- Age: 33
```

#### Console Output

```text
Person{name='Arnau', age=33}
```

### Features

- ✅ Creates a serializable Java object
- ✅ Serializes the object into a `.ser` file
- ✅ Deserializes the object from the `.ser` file
- ✅ Displays the recovered object on the console
- ✅ Handles serialization and deserialization exceptions

## Technologies

- Java 21
- Maven
- IntelliJ IDEA

## Project Structure

```text
FileUtilities
├── TestDirectory
│   ├── Documents
│   │   ├── document1
│   │   └── document2
│   ├── Photos
│   │   ├── image1
│   │   └── image2
│   ├── file1.txt
│   ├── file2.text
│   └── file3.txt
├── directoryTree.txt
├── example.txt
├── pom.xml
├── README.md
└── src
    └── main
        └── java
            └── Level1
                ├── Exercise1
                │   ├── DirectoryList.java
                │   ├── DirectoryValidator.java
                │   └── Main.java
                ├── Exercise2
                │   ├── DirectoryList.java
                │   ├── DirectoryValidator.java
                │   └── Main.java
                ├── Exercise3
                │   ├── DirectoryList.java
                │   ├── DirectoryValidator.java
                │   ├── FileWriterUtil.java
                │   └── Main.java
                ├── Exercise4
                │   ├── FileReaderUtil.java
                │   ├── FileValidator.java
                │   └── Main.java
                └── Exercise5
                    ├── Main.java
                    ├── Person.java
                    └── Serializer.java
```