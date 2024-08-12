---
layout: home
---

Stephen Gold is a computer hobbyist
who creates, collects, maintains, and publishes open-source
[JVM](https://en.wikipedia.org/wiki/Java_virtual_machine) software,
including apps, libraries, and documentation.

He holds an advanced degree in Electrical Engineering.
He resides in California with his (long-term) sweetheart.
At the present time, he seeks neither employment nor funding nor romance.

His current software interests include:
+ [3-D graphics](https://en.wikipedia.org/wiki/3D_computer_graphics)
+ [physics simulation](https://en.wikipedia.org/wiki/Physics_engine)
+ [skeletal animation](https://en.wikipedia.org/wiki/Skeletal_animation)
+ [software build automation](https://en.wikipedia.org/wiki/Build_automation)
+ [evolutionary algorithms](https://en.wikipedia.org/wiki/Evolutionary_algorithm)
+ [procedural generation of shapes, meshes, and textures](https://en.wikipedia.org/wiki/Procedural_generation)
+ [approximate convex decomposition](http://masc.cs.gmu.edu/wiki/ACD)

You can follow [his devlog at Tumblr](https://www.tumblr.com/frog707).


## Computer jargon

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
in the belief that buyer needs only the numeric software
that runs on their device.
That might be true if the software
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


## [Stephen's open-source software projects at GitHub](https://github.com/stephengold?tab=repositories)

Stephen publishes source code and build instructions
for his open-source software projects at [GitHub](https://github.com).
He also releases artifacts to
[the Maven Central Repository](https://www.cloudrepo.io/articles/public-maven-repositories-maven-central-and-more.html#article),
under the
[com.github.stephengold](https://central.sonatype.com/namespace/com.github.stephengold) group ID.

+ **[Libbulletjme](https://stephengold.github.io/Libbulletjme)**,
  a 3-D physics library for JVM applications,
  based on [Bullet](https://pybullet.org)
  and [V-HACD](https://github.com/kmammou/v-hacd)
  + Maven artifact ID: "Libbulletjme"
  + find the latest release:
    [Central](https://repo1.maven.org/maven2/com/github/stephengold/Libbulletjme),
    [GitHub](https://github.com/stephengold/Libbulletjme/releases/latest)
  + [browse recent commits](https://github.com/stephengold/Libbulletjme/commits/master)

+ Add-on projects for Libbulletjme:
  + **[LbjExamples](https://github.com/stephengold/LbjExamples)**,
    a tutorial for Libbulletjme, with simple example applications
    + [browse recent commits](https://github.com/stephengold/LbjExamples/commits/master)
  + **[SPORT](https://github.com/stephengold/sport)**,
    an [OpenGL](https://www.khronos.org/opengl/)-based graphics engine for Libbulletjme,
    with demo applications
    + Maven artifact ID: "sport"
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/sport),
      [GitHub](https://github.com/stephengold/sport/releases/latest)
    + [browse recent commits](https://github.com/stephengold/sport/commits/master)
  + **[Macana](https://github.com/stephengold/macana)**,
    integrates [Obsidian](https://github.com/MyWorldLLC/Obsidian) user interfaces into SPORT
    + currently in the testbed stage (unreleased)
    + [browse recent commits](https://github.com/stephengold/macana/commits/master)
  + **[V-Sport](https://github.com/stephengold/V-Sport)**,
    a [Vulkan](https://www.vulkan.org/)-based graphics engine for Libbulletjme,
    with demo applications and simple example applications
    + Maven artifact ID: "V-Sport"
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/V-Sport),
      [GitHub](https://github.com/stephengold/V-Sport/releases/latest)
    + [browse recent commits](https://github.com/stephengold/V-Sport/commits/master)

+ **[jolt-jni](https://github.com/stephengold/jolt-jni)**,
  [JVM](https://en.wikipedia.org/wiki/Java_virtual_machine) bindings
  for [Jolt Physics](https://jrouwe.github.io/JoltPhysics)
  + Maven artifact IDs: "jolt-jni-Linux64", "jolt-jni-Linux_ARM32hf",
    "jolt-jni-Linux_ARM64", "jolt-jni-MacOSX64", "jolt-jni-MacOSX_ARM64", and
    "jolt-jni-Windows64"
  + find the latest release:
    [Central](https://repo1.maven.org/maven2/com/github/stephengold),
    [GitHub](https://github.com/stephengold/jolt-jni/releases/latest)
  + [browse recent commits](https://github.com/stephengold/jolt-jni/commits/master)

+ **[JMonkeyEngine](https://jmonkeyengine.org)**,
  a code-centric 3-D game engine based on [LWJGL](https://www.lwjgl.org)
  + Maven group ID: [org.jmonkeyengine](https://central.sonatype.com/namespace/org.jmonkeyengine)
  + find the latest release:
    [Central](https://repo1.maven.org/maven2/com/github/jmonkeyengine/jmonkeyengine),
    [GitHub](https://github.com/jmonkeyengine/jmonkeyengine/releases/latest)
  + [browse recent commits](https://github.com/jmonkeyengine/jmonkeyengine/commits/master)

+ Add-on libraries for JMonkeyEngine:
  + **[KK Physics](https://github.com/stephengold/kk-physics)**,
    a 3-D physics engine based on jolt-jni
    + Maven artifact ID: "kk-physics"
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/kk-physics/),
      [GitHub](https://github.com/stephengold/kk-physics/releases/latest)
    + [browse recent commits](https://github.com/stephengold/kk-physics/commits/master)
  + **[Minie](https://stephengold.github.io/Minie)**,
    a 3-D physics engine based on Libbulletjme
    + Maven artifact ID: "Minie"
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/Minie),
      [GitHub](https://github.com/stephengold/Minie/releases/latest)
    + [browse recent commits](https://github.com/stephengold/Minie/commits/master)
  + **[Acorus](https://stephengold.github.io/Acorus)**,
    a simple user interface for demo/test desktop applications
    + Maven artifact ID: "Acorus"
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/Acorus),
      [GitHub](https://github.com/stephengold/Acorus/releases/latest)
    + [browse recent commits](https://github.com/stephengold/Acorus/commits/master)
  + **[Garrett](https://github.com/stephengold/Garrett)**,
    a suite of camera controllers based on Acorus and Minie
    + Maven artifact ID: "Garrett"
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/Garrett),
      [GitHub](https://github.com/stephengold/Garrett/releases/latest)
    + [browse recent commits](https://github.com/stephengold/Garrett/commits/master)
  + **[Heart](https://github.com/stephengold/Heart)**,
    a general-purpose add-on library
    + Maven artifact ID: "Heart"
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/Heart),
      [GitHub](https://github.com/stephengold/Heart/releases/latest)
    + [browse recent commits](https://github.com/stephengold/Heart/commits/master)
  + **[jme3-utilities-nifty](https://github.com/stephengold/jme3-utilities)**,
    a graphical user interface
    based on [NiftyGUI](https://nifty-gui.github.io/nifty-gui)
    + Maven artifact ID: "jme3-utilities-nifty"
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/jme3-utilities-nifty),
      [GitHub](https://github.com/stephengold/jme3-utilities/releases)
  + **[jme3-utilities-x](https://github.com/stephengold/jme3-utilities)**,
    an experimental add-on library
    + Maven artifact ID: "jme3-utilities-x"
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/jme3-utilities-x),
      [GitHub](https://github.com/stephengold/jme3-utilities/releases)
  + **[JmePower](https://github.com/stephengold/JmePower)**,
    a loading animation
    + Maven artifact ID: "JmePower"
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/JmePower),
      [GitHub](https://github.com/stephengold/JmePower/releases/latest)
    + [browse recent commits](https://github.com/stephengold/JmePower/commits/master)
  + **[jME-TTF](https://github.com/stephengold/jME-TTF)**,
    a renderer for TrueType fonts
    + Maven artifact ID: "jme-ttf"
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/jme-ttf),
      [GitHub](https://github.com/stephengold/jME-TTF/releases/latest)
    + [browse recent commits](https://github.com/stephengold/jME-TTF/commits/master)
  + **[MonkeyWrench](https://github.com/stephengold/MonkeyWrench)**,
    a model loader based on [the Open Asset Importer Library](https://www.assimp.org/)
    + Maven artifact ID: "MonkeyWrench"
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/MonkeyWrench),
      [GitHub](https://github.com/stephengold/MonkeyWrench/releases)
    + [browse recent commits](https://github.com/stephengold/MonkeyWrench/commits/master)
  + **[More Advanced Vehicles](https://github.com/stephengold/jme-vehicles)**,
    a vehicle simulator based on Minie
    + Maven artifact ID: "MaVehicles"
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/MaVehicles),
      [GitHub](https://github.com/stephengold/jme-vehicles/releases)
    + [browse recent commits](https://github.com/stephengold/jme-vehicles/commits/master)
  + **[SkyControl](https://github.com/stephengold/SkyControl)**,
    a sky simulator
    + Maven artifact ID: "SkyControl"
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/SkyControl),
      [GitHub](https://github.com/stephengold/SkyControl/releases/latest)
    + [browse recent commits](https://github.com/stephengold/SkyControl/commits/master)
  + **[tonegodgui](https://github.com/stephengold/tonegodgui)**,
    another graphical user interface
    + Maven artifact ID: "tonegodgui"
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/tonegodgui),
      [GitHub](https://github.com/stephengold/tonegodgui/releases/latest)
    + [browse recent commits](https://github.com/stephengold/tonegodgui/commits/master)
  + **[Wes](https://github.com/stephengold/Wes)**,
    edits and retargets skeletal animations
    + Maven artifact ID: "Wes"
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/Wes),
      [GitHub](https://github.com/stephengold/Wes/releases/latest)
    + [browse recent commits](https://github.com/stephengold/Wes/commits/master)

+ JMonkeyEngine apps:
  + **[Archer-Game-Template2](https://github.com/capdevon/Archer-Game-Template2)**,
    a first-person shooter game
    + [browse recent commits](https://github.com/capdevon/Archer-Game-Template2/commits/main)
  + **[Banana](https://github.com/stephengold/Banana)**,
    a test suite for physics libraries
    + [browse recent commits](https://github.com/stephengold/Banana/commits/master)
  + **[BasicGame-on-Gradle](https://github.com/stephengold/BasicGame-on-Gradle)**,
    a template for building JMonkeyEngine applications
    using [Gradle](https://gradle.org) and [Java](https://en.wikipedia.org/wiki/Java_(programming_language))
    + [browse recent commits](https://github.com/stephengold/BasicGame-on-Gradle/commits/master)
  + **[BasicGame-on-Kotlin](https://github.com/stephengold/BasicGame-on-Kotlin)**,
    a template for building JMonkeyEngine applications
    using [Gradle](https://gradle.org) and [Kotlin](https://en.wikipedia.org/wiki/Kotlin_(programming_language))
    + [browse recent commits](https://github.com/stephengold/BasicGame-on-Kotlin/commits/master)
  + **[DacWizard](https://github.com/stephengold/DacWizard)**,
    a GUI app for configuring Minie ragdoll physics
    + [browse recent commits](https://github.com/stephengold/DacWizard/commits/master)
  + **[FuzeCreek](https://github.com/stephengold/FuzeCreek)**,
    a real-time river-rafting game
    + [browse recent commits](https://github.com/stephengold/FuzeCreek/commits/master)
  + **[Georg](https://github.com/stephengold/Georg)**,
    a suite of procedurally generated textures
    + [browse recent commits](https://github.com/stephengold/Georg/commits/master)
  + **[jme3-maze](https://github.com/stephengold/jme3-maze)**, a 3-D maze game
    + [browse recent commits](https://github.com/stephengold/jme3-maze/commits/master)
  + **[Maud](https://github.com/stephengold/Maud)**,
    an editor for animated 3-D models
    + [browse recent commits](https://github.com/stephengold/Maud/commits/master)
  + **[RyzomConverter](https://github.com/stephengold/RyzomConverter)**,
    imports assets from
    [the Ryzom Asset Repository](https://bitbucket.org/ccxvii/ryzom-assets)
    + [browse recent commits](https://github.com/stephengold/RyzomConverter/commits/master)
  + **[RyzomDemos](https://github.com/stephengold/RyzomDemos)**,
    example applications using assets imported by RyzomConverter
    + [browse recent commits](https://github.com/stephengold/RyzomDemos/commits/master)
  + **[VhacdTuner](https://github.com/stephengold/VhacdTuner)**,
    a GUI app to tune the V-HACD algorithm for a specific mesh
    + [browse recent commits](https://github.com/stephengold/VhacdTuner/commits/master)

+ Ancient JVM libraries:
  + **[asm 3.1](https://github.com/stephengold/asm)**,
    a framework for manipulating JVM bytecodes
    + Maven artifact ID: "asm-all"
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/asm-all),
      [GitHub](https://github.com/stephengold/asm/releases/latest)
    + [browse recent commits](https://github.com/stephengold/asm/commits/master)
  + **[jbullet](https://github.com/stephengold/jbullet)**,
    a 3-D physics library written entirely in Java
    + Maven artifact ID: "jbullet"
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/jbullet),
      [GitHub](https://github.com/stephengold/jbullet/releases/latest)
    + [browse recent commits](https://github.com/stephengold/jbullet/commits/master)
  + **[j-ogg-all](https://github.com/stephengold/j-ogg-all)**,
    reads [Ogg](https://www.xiph.org/ogg/) bitstreams and decodes the media they contain
    + Maven artifact IDs: "j-ogg-all" and "j-ogg-vorbis"
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold),
      [GitHub](https://github.com/stephengold/j-ogg-all/releases/latest)
    + [browse recent commits](https://github.com/stephengold/j-ogg-all/commits/master)
  + **[stack-alloc](https://github.com/stephengold/stack-alloc)**,
    allocates JVM objects on the stack instead of on the heap
    + Maven artifact ID: "stack-alloc"
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/stack-alloc),
      [GitHub](https://github.com/stephengold/stack-alloc/releases/latest)
    + [browse recent commits](https://github.com/stephengold/stack-alloc/commits/master)

+ Documentation projects:
  + **[antora-ui-bundle](https://github.com/stephengold/antora-ui-bundle)**,
    an [Antora](https://antora.org/) user-interface bundle
      + find the latest release:
        [GitHub](https://github.com/stephengold/antora-ui-bundle/releases/latest)
      + [browse recent commits](https://github.com/stephengold/antora-ui-bundle/commits/master)
  + **[Minie-site-it](https://github.com/stephengold/Minie-site-it)**,
    an Italian translation of the Minie project website
      + [browse recent commits](https://github.com/stephengold/Minie-site-it/commits/master)
  + **[stephengold.guihub.io](https://github.com/stephengold/stephengold.github.io)**,
    this website
    + [browse recent commits](https://github.com/stephengold/stephengold.github.io/commits/master)
