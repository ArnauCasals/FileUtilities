# File Utilities

**Description:**  
This project contains several Java exercises to practice file and directory management, text file reading and writing, object serialization, and deserialization.

## 📌 Exercise Description

The project includes the following exercises:

1. List the contents of a directory alphabetically.
2. Display the complete directory tree recursively, indicating whether each item is a file or directory and showing its last modification date.
3. Save the directory tree into a TXT file.
4. Read any TXT file and display its contents on the console.
5. Serialize a Java object into a `.ser` file and then deserialize it.

## ✨ Features

- Alphabetical directory listing.
- Recursive directory tree traversal.
- Save the directory structure to a TXT file.
- Read any TXT file line by line.
- Serialize and deserialize Java objects.

## 🛠 Technologies

- Java 26
- Maven
- IntelliJ IDEA
- Java IO (`java.io`)

## 🚀 Installation and Execution

### Clone the repository

```bash
git clone https://github.com/ArnauCasals/FileUtilities.git
```

### Navigate to the project folder

```bash
cd FileUtilities
```

### Compile the project

```bash
mvn compile
```

### Run the application

```bash
mvn exec:java
```

### Run the tests

```bash
mvn test
```

## 💻 Manual Compilation

Compile the Java source files:

```bash
javac -d out src/main/java/filesystem/*.java
```

Run the compiled application:

```bash
java -cp out filesystem.DirectoryLister .
```

To run the serialization example:

```bash
java -cp out filesystem.SerializationExample
```

## 📸 Demo

Example output:

```text
D src Mon Jul 13 2026
    D main
        D java
            D filesystem
                F DirectoryLister.java
```

## 🧩 Technical Notes

- The project uses **relative paths** instead of absolute paths.
- `File.separator` is used to ensure compatibility across different operating systems.
- The code is organized into separate classes, each with a single responsibility.