INSTRUCTIONS:
===================================
You have been presented with a description and purpose of the
Dependency Inversion Principle (DIP). You will need to understand this
principle to successfully complete the lab work.

DIP RULES:
    A. HIGH LEVEL MODULES SHOULD NOT DEPEND UPON LOW
       LEVEL MODULES. BOTH SHOULD DEPEND UPON ABSTRACTIONS.

    B. ABSTRACTIONS SHOULD NOT DEPEND UPON DETAILS. DETAILS
       SHOULD DEPEND UPON ABSTRACTIONS.

DIP OBJECTIVES:
    1. Reduce rigidity and fragility.
    2. Improve portability (code reuse, flexibility)

THE CHALLENGE (DO NOT START UNTIL LABS #1 AND #2 ARE COMPLETED):
------------------------------------------------------------------------
In this lab #3 you are building a program from scratch that uses the 
design principles specified by the DIP. To succeed follow these instructions:

Use the OOA/D goals that you memorized:

    * Generic Analysis: Define the problem and its requirements:

      This can be accomplished by reading the project specification below.

    * Object-Oriented Analysis: Find the conceptual objects in
      the problem domain:

      After reading the project specification, look for, or think of nouns
      that represent the objects you will need. There should be six key
      nouns and these should be fairly obvious.

    * Generic Design: Find a conceptual solution:

      Create a Domain Model as follows...
      Using pencil and paper, draw boxes containing conceptual object names,
      connected by association lines, labeled to describe the association.
      You should have one box for each of six key conceptual objects.

    * Object-oriented Design: Skillfully Assigning Responsibilities to Objects:

      Now that you have a good idea of the objects you will need and how
      they will collaborate (communicate) with each other, apply the DIP and
      all best practices learned so far to write code that follows your 
      Domain Model and skillfully assigns the right responsibilities to the
      right objects. Ask yourself, what should this object do, and what
      should it not do?


PROJECT SPECIFICATIONS:
----------------------
We need a simple messaging system that is flexible enough to provide
messages in different ways and render those messages in different ways.

For example a message provider might be needed for error messages, or
random tip of the day messages, or welcome messages. Message rendering is the
act of outputting the provided message to various destinations: the
console or a GUI, for example. So you might need a console renderer and a
GUI renderer to start, but be able to added other message renderers (file
renderer, e.g.) in the future. Switching message providers or message
renderers should be easy and should not break code.

The actual wording of the messages is not important for this first version,
however, you will need to support at least two different ways of providing
a message and at least two different ways of rendering a message. And we want
as much code as possible to be portable and flexible so that changes don't
require much editing. For example, in the IndependentCopy sample, it was the
Copier class and Reader and Writer interfaces that were portable. Further,
you need a high-level class that delegates the work of getting a message 
(a message provider) and outputting a message (a message renderer) to various
low-level classes. For example, in the Copier example the Copier class 
relied on various readers and writers.

In addition to the code for managing your providers and renderers, you will
need a Startup class with a main method to start the program and do some
basic initialization. But remember, input comes from the provider components
and output goes to the renderer components. And your Startup class must ONLY
talk to the high-level class -- never to the low-level classes. That means your 
program should have at least 6 classes: one startup, one high-level service
class, two providers (input classes) and two renderers (output classes). And
the way you provide input and output should vary.

For those of you who don't know how to do simple input/output GUIs, here's
some sample code:

For an output GUI, just use a JOptionPane.showMessageDialog() method, but you
must remember to do an import first, above your class declaration, but below
the package reference:

package dip.lab3;

import javax.swing.JOptionPane;

public class MyClass { ...

... then to use it just do this:

JOptionPane.showMessageDialog(null,"My Message");

... then to do input, if necessary, do this:

String response =
       JOptionPane.showInputDialog(null, "A Prompt, like enter message here:");

For more information, see the online JavaDoc for the JOptionPane class in
Java SE 6.
 