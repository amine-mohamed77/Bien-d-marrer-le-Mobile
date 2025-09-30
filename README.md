# Getting-started-Mobile


> **A small Android project (Jetpack Compose)** — quick start, useful Git commands, and troubleshooting.

---

## Description

This project is an Android application built with **Jetpack Compose**. This README explains how to set up the environment, run the app, and fix common Git errors (e.g., `not a git repository` or `src refspec main does not match any`).

## Prerequisites

- Android Studio (Arctic Fox or newer recommended)
- JDK 11 or 17 installed
- Android SDK (installed via Android Studio)
- Internet connection (for Gradle/SDK)

## Project Structure


## Essential Commands

### Open the Project

- Open Android Studio → *Open an existing project* → select the root folder.
- Let Gradle sync.

### Build and Run

- Run on emulator or connected device: click `Run` in Android Studio.
- Command line (example):
  ```bash
  ./gradlew assembleDebug
  adb install -r app/build/outputs/apk/debug/app-debug.apk
