![Logo](https://www.browserstack.com/images/static/header-logo.jpg)

# Manual To Automation @ <a href="https://sky.co.uk/"><img src="https://logos-world.net/wp-content/uploads/2021/02/Sky-Logo.png" alt="sky" height="27" /></a> - Lesson 1 - Introduction <a href="https://developer.android.com/"><img src="https://developer.android.com/static/images/training/testing/espresso.png" alt="sky" height="22" /></a>

## Introduction

This example code is the base App and Test code from Lesson 1. It contains all of the source code for the application and the test files. And the Gradle configuration is in place already.

---

## Installation

There are a few things that you will need before you can get started.

* Android Studio - You can download this from [here](https://developer.android.com/studio). The page contains installers for Windows and Mac.
* Git for pulling down the code - follow [this](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git) guide for installing Git on all platforms. There are other useful guides on the website mentioned previously. Start [here](https://github.com/git-guides) anad follow through to the various links to learn more about Git. It will be very useful on your automation journey. If you have any issues with tokens or user credentials, let me know as this can trip a lot of people up.
* Java JDK - you will need the JDK to do anything with Java. It can be downloaded from [here](https://www.oracle.com/ie/java/technologies/downloads/)
* Gradle - you will need Gradle to build your app and tests. You can download it from [here](https://gradle.org/install/)
* Android SDK - The Android SDK can be downloaded from the SDK manager within Android Studio. A guide on this can be found [here](https://developer.android.com/about/versions/12/setup-sdk#:~:text=Install%20the%20SDK,-Within%20Android%20Studio&text=Click%20Tools%20%3E%20SDK%20Manager.,OK%20to%20install%20the%20SDK.)

Once you have these installed, you are good to go to the next step.

Follow the below steps to get the code onto your local machine.

* Open a terminal. (Terminal on Mac, Command Prompt on Windows)
* Go to the directory where you want to place the code using [cd](https://docs.microsoft.com/en-us/windows-server/administration/windows-commands/cd) for Windows, and it functions mostly the same for Mac. You just use "cd" but the folder structure on Mac is different (/Users/username/Documents instead of C:/Users/username/Documents)
* Copy the following command into the terminal, (remember, you must have [Git](https://git-scm.com/downloads) installed)
```sh
git clone https://github.com/Manual-To-Automation-Sky/Espresso-Lesson-1-Introduction.git.
```
* Open Android Studio
* Click Open
* Navigate to the Folder of the project you just grabbed from Git and Open

## Running the tests

To run the tests you can set up a Run configuration you can either:

* Set up a Run configuration (more info [here](https://developer.android.com/studio/run/rundebugconfig))
* Simply right click anywhere in the file and click on "Run <InsertFileName>"