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

+ **[JMonkeyEngine](https://jmonkeyengine.org)**,
  a code-centric 3-D game engine based on [LWJGL](https://www.lwjgl.org)
  + group ID: [org.jmonkeyengine](https://central.sonatype.com/namespace/org.jmonkeyengine)
  + find the latest release:
    [Central](https://repo1.maven.org/maven2/com/github/jmonkeyengine/jmonkeyengine),
    [GitHub](https://github.com/jmonkeyengine/jmonkeyengine/releases/latest)
  + [browse recent commits](https://github.com/jmonkeyengine/jmonkeyengine/commits/master)

+ Add-on libraries for JMonkeyEngine:
  + **[KK Physics](https://github.com/stephengold/kk-physics)**
    a 3-D physics engine based on [Jolt Physics](https://jrouwe.github.io/JoltPhysics)
    + currently in the proof-of-concept stage (unreleased)
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
