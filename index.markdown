---
layout: home
---

Stephen Gold is a computer hobbyist
who creates, collects, maintains, and publishes open-source
[JVM](https://en.wikipedia.org/wiki/Java_virtual_machine) libraries.
He lives in California and holds an advanced degree in Electrical Engineering.
At the present time, he is not seeking donations or employment.

His current software interests include:
+ [3-D graphics](https://en.wikipedia.org/wiki/3D_computer_graphics)
+ [physics simulation](https://en.wikipedia.org/wiki/Physics_engine)
+ [skeletal animation](https://en.wikipedia.org/wiki/Skeletal_animation)
+ [build automation](https://en.wikipedia.org/wiki/Build_automation)
+ [evolutionary algorithms](https://en.wikipedia.org/wiki/Evolutionary_algorithm)
+ [procedural generation of textures and meshes](https://en.wikipedia.org/wiki/Procedural_generation)
+ [approximate convex decomposition](http://masc.cs.gmu.edu/wiki/ACD)

You can follow [his devblog at Tumblr](https://www.tumblr.com/frog707).

### [Projects at GitHub](https://github.com/stephengold?tab=repositories)

While Stephen publishes source code and build instructions for his libraries,
users aren't expected to build them from source.
Pre-built artifacts (including JARs) are available from the
[Maven Central Repository](https://www.cloudrepo.io/articles/public-maven-repositories-maven-central-and-more.html#article),
under the
[com.github.stephengold](https://central.sonatype.com/namespace/com.github.stephengold) group ID.
Instead of explicitly downloading archives or building from source,
most users simply refer to libraries
by Maven coordinates (group ID, artifact ID, and version) in their buildscripts.

+ **[Libbulletjme](https://stephengold.github.io/Libbulletjme)**,
  a 3-D physics library for JVM applications,
  based on [Bullet](https://pybullet.org)
  and [V-HACD](https://github.com/kmammou/v-hacd)
  + artifact ID: Libbulletjme
  + find the latest release:
    [Central](https://repo1.maven.org/maven2/com/github/stephengold/Libbulletjme),
    [GitHub](https://github.com/stephengold/Libbulletjme/releases/latest)
  + [browse recent commits](https://github.com/stephengold/Libbulletjme/commits/master)
  + **[LbjExamples](https://github.com/stephengold/LbjExamples)**,
    example applications using Libbulletjme
    + [browse recent commits](https://github.com/stephengold/LbjExamples/commits/master)
  + **[V-Sport](https://github.com/stephengold/V-Sport)**,
    a 3-D graphics engine for JVM applications,
    based on [LWJGL](https://www.lwjgl.org/)
    and [Vulkan](https://www.vulkan.org/)
    + [browse recent commits](https://github.com/stephengold/V-Sport/commits/master)

+ **[JMonkeyEngine](https://jmonkeyengine.org)**,
  a code-centric 3-D game engine based on [LWJGL](https://www.lwjgl.org)
  + group ID: org.jmonkeyengine
  + find the latest release:
    [Central](https://repo1.maven.org/maven2/com/github/jmonkeyengine/jmonkeyengine),
    [GitHub](https://github.com/jmonkeyengine/jmonkeyengine/releases/latest)
  + [browse recent commits](https://github.com/jmonkeyengine/jmonkeyengine/commits/master)

+ Add-on libraries for JMonkeyEngine:
  + **[Minie](https://stephengold.github.io/Minie)**,
    a physics engine based on Libbulletjme
    + artifact ID: Minie
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/Minie),
      [GitHub](https://github.com/stephengold/Minie/releases/latest)
    + [browse recent commits](https://github.com/stephengold/Minie/commits/master)
  + **[Acorus](https://stephengold.github.io/Acorus)**,
    a simple user interface for demo/test desktop applications
    + artifact ID: Acorus
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/Acorus),
      [GitHub](https://github.com/stephengold/Acorus/releases/latest)
    + [browse recent commits](https://github.com/stephengold/Acorus/commits/master)
  + **[Garrett](https://github.com/stephengold/Garrett)**,
    a suite of camera controllers based on Acorus and Minie
    + artifact ID: Garrett
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/Garrett),
      [GitHub](https://github.com/stephengold/Garrett/releases/latest)
    + [browse recent commits](https://github.com/stephengold/Garrett/commits/master)
  + **[Heart](https://github.com/stephengold/Heart)**,
    a general-purpose add-on library
    + artifact ID: Heart
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/Heart),
      [GitHub](https://github.com/stephengold/Heart/releases/latest)
    + [browse recent commits](https://github.com/stephengold/Heart/commits/master)
  + **[jme3-utilities-nifty](https://github.com/stephengold/jme3-utilities)**,
    a graphical user interface
    based on [NiftyGUI](https://nifty-gui.github.io/nifty-gui)
    + artifact ID: jme3-utilities-nifty
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/jme3-utilities-nifty),
      [GitHub](https://github.com/stephengold/jme3-utilities/releases)
  + **[jme3-utilities-x](https://github.com/stephengold/jme3-utilities)**,
    an experimental add-on library
    + artifact ID: jme3-utilities-x
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/jme3-utilities-x),
      [GitHub](https://github.com/stephengold/jme3-utilities/releases)
  + **[JmePower](https://github.com/stephengold/JmePower)**,
    a loading animation
    + artifact ID: JmePower
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/JmePower),
      [GitHub](https://github.com/stephengold/JmePower/releases/latest)
    + [browse recent commits](https://github.com/stephengold/JmePower/commits/master)
  + **[jME-TTF](https://github.com/stephengold/jME-TTF)**,
    a renderer for TrueType fonts
    + artifact ID: jme-ttf
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/jme-ttf),
      [GitHub](https://github.com/stephengold/jME-TTF/releases/latest)
    + [browse recent commits](https://github.com/stephengold/jME-TTF/commits/master)
  + **[More Advanced Vehicles](https://github.com/stephengold/jme-vehicles)**,
    a vehicle simulator based on Minie
    + artifact ID: MaVehicles
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/MaVehicles),
      [GitHub](https://github.com/stephengold/jme-vehicles/releases)
    + [browse recent commits](https://github.com/stephengold/jme-vehicles/commits/master)
  + **[SkyControl](https://github.com/stephengold/SkyControl)**,
    a sky simulator
    + artifact ID: SkyControl
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/SkyControl),
      [GitHub](https://github.com/stephengold/SkyControl/releases/latest)
    + [browse recent commits](https://github.com/stephengold/SkyControl/commits/master)
  + **[tonegodgui](https://github.com/stephengold/tonegodgui)**,
    another graphical user interface
    + artifact ID: tonegodgui
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/tonegodgui),
      [GitHub](https://github.com/stephengold/tonegodgui/releases/latest)
    + [browse recent commits](https://github.com/stephengold/tonegodgui/commits/master)
  + **[Wes](https://github.com/stephengold/Wes)**,
    edits and retargets skeletal animations
    + artifact ID: Wes
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/Wes),
      [GitHub](https://github.com/stephengold/Wes/releases/latest)
    + [browse recent commits](https://github.com/stephengold/Wes/commits/master)

+ JMonkeyEngine applications:
  + **[Archer-Game-Template2](https://github.com/capdevon/Archer-Game-Template2)**,
    a first-person shooter game
    + [browse recent commits](https://github.com/capdevon/Archer-Game-Template2/commits/main)
  + **[Banana](https://github.com/stephengold/Banana)**,
    a test suite for physics libraries
    + [browse recent commits](https://github.com/stephengold/Banana/commits/master)
  + **[BasicGame-on-Gradle](https://github.com/stephengold/BasicGame-on-Gradle)**,
    a template for building JMonkeyEngine applications
    using [Gradle](https://gradle.org)
    + [browse recent commits](https://github.com/stephengold/BasicGame-on-Gradle/commits/master)
  + **[DacWizard](https://github.com/stephengold/Minie)**,
    a tool for configuring ragdoll physics
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

+ Ancient JVM libraries:
  + **[asm 3.1](https://github.com/stephengold/asm)**,
    a framework for manipulating JVM bytecodes
    + artifact ID: asm-all
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/asm-all),
      [GitHub](https://github.com/stephengold/asm/releases/latest)
    + [browse recent commits](https://github.com/stephengold/asm/commits/master)
  + **[jbullet](https://github.com/stephengold/jbullet)**,
    a 3-D physics library written entirely in Java
    + artifact ID: jbullet
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/jbullet),
      [GitHub](https://github.com/stephengold/jbullet/releases/latest)
    + [browse recent commits](https://github.com/stephengold/jbullet/commits/master)
  + **[j-ogg-all](https://github.com/stephengold/j-ogg-all)**,
    reads [Ogg](https://www.xiph.org/ogg/) bitstreams and decodes the media they contain
    + artifact IDs: j-ogg-all and j-ogg-vorbis
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold),
      [GitHub](https://github.com/stephengold/j-ogg-all/releases/latest)
    + [browse recent commits](https://github.com/stephengold/j-ogg-all/commits/master)
  + **[stack-alloc](https://github.com/stephengold/stack-alloc)**,
    allocates JVM objects on the stack instead of on the heap
    + artifact ID: stack-alloc
    + find the latest release:
      [Central](https://repo1.maven.org/maven2/com/github/stephengold/stack-alloc),
      [GitHub](https://github.com/stephengold/stack-alloc/releases/latest)
    + [browse recent commits](https://github.com/stephengold/stack-alloc/commits/master)

+ **[antora-ui-bundle](https://github.com/stephengold/antora-ui-bundle)**,
  an [Antora](https://antora.org/) user-interface bundle
    + find the latest release:
      [GitHub](https://github.com/stephengold/antora-ui-bundle/releases/latest)
    + [browse recent commits](https://github.com/stephengold/antora-ui-bundle/commits/master)

+ **[stephengold.guihub.io](https://github.com/stephengold/stephengold.github.io)**,
  this website
  + [browse recent commits](https://github.com/stephengold/stephengold.github.io/commits/master)
