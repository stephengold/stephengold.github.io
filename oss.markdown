---
layout: default
---

# Computer jargon

Digital devices (such as computers and phones)
combine *hardware* and *software*.
Hardware refers to the tangible parts,
such as chips, circuit boards, buttons, and cables.
Software is information,
especially instructions that tell hardware what to do.

For example, a computer's software determines what it does
when the Enter key is pressed.
Depending what software is running,
the same hardware might respond differently to identical keystrokes.

### Source code and open-source

Software, in its finished form, consists of long strings of numbers
suitable for controlling a particular kind of device.
Because strings of numbers are difficult for humans to understand,
most software is authored in the form of *source code*
(human-readable text) which is then translated (by a computer)
into the desired numbers.

*Open-source* software refers to software
whose source code is readily available.

Plenty of software is sold without its source code,
in the belief that the buyer needs only the numeric software
that runs on their device.
That might be true if software
were perfectly versatile and never became obsolete.
But in order to substantially adapt or maintain a piece of software,
one needs the source code.
Lacking source code,
buyers must rely on the vendor for customization and updates.

Software without its source code is like a pre-cooked meal.
If the meal is too salty, you can't do much
except ask the cook to use less salt next time or try a different cook.
Acquiring source code is like collecting recipes,
so you can cook dishes at home and adapt them to your taste.

### Apps and libraries

There are many kinds of software projects, including apps and libraries.

*App* is short for "application software."
An app is a piece of software whose function is clear to the end user,
such as a word game, a web browser, or a video mixer.

A [library](https://en.wikipedia.org/wiki/Library_%28computing%29)
is a software building block, used in other (larger) projects.
Libraries matter greatly to people who create and maintain software,
but are mostly invisible to end users.

For instance, a web browser app might use a library
to render images to a screen.
Doing so would free the app developer from dealing with
the quirks of every image format and type of screen.
Writing software is time-consuming and painstaking work.
A good library might get re-used in thousands of apps,
resulting in huge savings of effort.

Pursuing the food analogy, apps are dishes ready to be eaten,
and libraries are ingredients ready to be cooked.
The availability of mass-produced ingredients like flour and cheese
frees cooks from needing to grow their own wheat or raise their own livestock.

### Repositories and commits

Software projects often involve collaboration,
with hundreds of people making thousands of changes
to the source code over many years.
To help manage all this activity,
most projects keep a history of all changes (and who made them, and why)
in a special-purpose database called a *repository*.
The individual changes are called *commits*.

Projects also use repositories
to keep a history of all their officially-published products.

### Artifacts and coordinates

In the world of JVM software, libraries
are distributed in the form of pre-built software *artifacts*.
Software developers needn't build libraries from source code
or explicitly download the artifacts.
Instead, they can simply refer to them by their
[Maven coordinates](https://www.educative.io/courses/build-java-projects-with-maven/coordinates).

Maven coordinates consist of three parts:
a group ID, an artifact ID, and a version string.
Given the coordinates of a library,
software build tools automatically download the corresponding artifacts
from the repositories that hold them.
