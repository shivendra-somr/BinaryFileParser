## BinaryFileParser
Using kaitai Struct, parsing the details of hard drive from a binary file.

## Kaitai Struct
Kaitai Struct is a domain-specific language (DSL) that is designed with one particular task in mind: dealing with arbitrary binary formats.

Parsing binary formats is hard, and that’s a reason for that: such formats were designed to be machine-readable, not human-readable. Even when one’s working with a clean, well-documented format, there are multiple pitfalls that await the developer: endianness issues, in-memory structure alignment, variable size structures, conditional fields, repetitions, fields that depend on other fields previously read, etc, etc, to name a few.

Kaitai Struct tries to isolate the developer from all these details and allow to focus on the things that matter: the data structure itself, not particular ways to read or write it.

# Features
Kaitai is supported on Linux and Windows (not sure about Mac).
So far, Kaitai supports generating parsers in following languages
 - C++/STL
 - C#
 - Java
 - JavaScript
 - Perl
 - PHP
 - Python
 - Ruby
If you want you are welcome to add one more language to the list

# How to use this Kaitai?
In short, to use Katai 
  * You use declarative syntax to describe a data source you want to be able to parse, such as file system or image format or whatever you like, in ksy file. 
  * Then using Kaitai Web IDE or Katai Struct compiler you generate a code in one of the relevant supported languages, such as Java, C#, C++ etc.
  * That’s it. Now use the code to get full access to your data source.

# Documentation
https://doc.kaitai.io/
