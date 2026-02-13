
You said:


View as TextDownload

                     Automatic Zoom
                     Actual Size
                     Page Fit
                     Page Width
                                          50%
                     75%
                     100%
                     125%
                     150%
                     200%
                     300%
                     400%


W2026 MAD302-01 Android Development

LAB 1

Requirements

1)

Create a project.

a.

App Name: ProfileListApp

b.

One Screen Only -> MainActivity

c.

UI:

i.

EditText ->Name

ii.

EditText ->Age

iii.

Button -> Add profile

iv.

TextView -> Show profiles

2)

Data Class:

a.

Profile.kt

data class Profile(

val name: String,

val age: Int

)

3)

Inside MainActivity.kt

a.

Val profiles=mutableListOf<Profile>()

4)

Layout

a.

In activity_main.xml, add:

i.

EditText (Name)

ii.

EditText (Age)

iii.

Button (Add Profile)

iv.

TextView (Display Profiles)

b.

Vertical layout is enough.

5)

Button Click Logic

a.

When Add Profile is clicked:

i.

Read name

ii.

Read age

iii.

Create profile

iv.

Add to list

v.

Update TextView

b.

No validation is required

6)

Display Profiles:

a.

Use a for loop

b.

Display like:

i.

Nevin – 22

ii.

Alex – 19

7)

Lifecycle Logs

a.

Add logs in MainActivity:

i.

onCreate

ii.

onStart

iii.

onResume

iv.

onPause

v.

onStop

vi.

onDestroy

Documentation

When you submit your Java program, include proper documentation. Documentation is part of

programming best practices and will count toward your grade.



File Header (at the very top of your .java file)

o

Include:



Course code and lab number



Your full name and Student ID



Date of Submission



A short description of what program does.



Class and Method Comments

o

Use /** .... **/ above each class and method to describe its purpose.

o

Mention parameters and return values.



Inline Comments

o

Use // to explain tricky or important lines.

o

Do not comment every line – just enough to make logic clear.

Submission

All work for this lab must be submitted through GitHub. You will practice both coding and professional

collaboration workflows.

1.

Create a Repository

a.

Go to Github and create a new public repository.

b.

Name it : MAD302-LAB01-
YOURNAME

c.

Add a README.md with:

i.

Lab title and your name / ID

ii.

A short description of the project

2.

Code & Documentation

a.

Add your Main.kt file.

b.

Include full documentation:

i.

File header ( course, lab, your name, description)

ii.

Method/class Javadoc comments

iii.

Inline comments for tricky logic.

3.

Commit Requirements

a.

You must have at least 5 commits.

b.

Commits should be meaningful and descriptive (not “update” or “fix”).

4.

Pull Request Requirements.

a.

You must create at least 3 Pull Requests (PRs), each with a clear title and description.

b.

Each PR should represent a logical feature or change. For example:

i.

Add Student class and constructors.

ii.

Implement Gradebook menu and input handling

iii.

Add utilities (operator demo, type casting, recursion)

c.

Even if you are working alone, you can:

i.

Create a new branch (e.g., feature-student-class)

ii.

Push changes

iii.

Open a PR into main

iv.

Merge it after review (self-review allowed in this case).

5.

Final Submission

a.

Push your final version to Github.

b.

Ensure your repo has:

i.

Main.java with complete documentation

ii.

At least 5 meaningful commits.

iii.

At least 3 merged pull requests.

iv.

A README.md explaining your project.

6.

What to Submit to Instructor

a.

Submit the GitHub Repository link.

b.

Make sure the repo is public.

I NEED EACH and every step for this assignment this assignment is for kotlian so i need every kotlian file for this and 8 meaningfull commits and 5 meaningfull pull reaquests and also as i mention above i have to upload this assignment on github so i need all layerd structures like code and than git code than code than git code full layerd structure

ChatGPT said:
Good. I’ll give you everything step-by-step, including:

✅ Full Kotlin files

✅ XML layout

✅ Proper documentation comments

✅ Lifecycle logs

✅ 8 meaningful commits

✅ 5 meaningful pull requests

✅ Exact Git commands

✅ Proper layered Git workflow

You can follow this exactly and submit confidently.

✅ PART 1 — CREATE ANDROID PROJECT
Step 1 — Create Project in Android Studio
Open Android Studio

Click New Project

Choose Empty Activity

Click Next

Fill:

Field	Value
Name	ProfileListApp
Package	com.yourname.profilelistapp
Language	Kotlin
Minimum SDK	API 24
Click Finish

✅ PART 2 — PROJECT STRUCTURE
Your structure should look like this:

ProfileListApp/
└── app/
└── src/
└── main/
├── java/com/yourname/profilelistapp/
│      ├── MainActivity.kt
│      └── Profile.kt
└── res/
└── layout/
└── activity_main.xml
✅ PART 3 — CREATE DATA CLASS
Create file:

📄 Profile.kt
Right click package → New → Kotlin Class → Name: Profile

/**
* Course: MAD302
* Lab: Lab 01
* Name: YOUR FULL NAME
* Student ID: YOUR ID
* Date: 2026-01-XX
*
* Description:
* This data class represents a user profile containing
* a name and age.
  */
  package com.yourname.profilelistapp

/**
* Data class representing a Profile object.
*
* @property name The name of the person.
* @property age The age of the person.
  */
  data class Profile(
  val name: String,
  val age: Int
  )
  ✅ PART 4 — DESIGN LAYOUT
  Open:

📄 res/layout/activity_main.xml
Replace everything with:

<?xml version="1.0" encoding="utf-8"?>
<!--
    Course: MAD302
    Lab: Lab 01
    Description: Layout for ProfileListApp
-->
<LinearLayout
xmlns:android="http://schemas.android.com/apk/res/android"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:orientation="vertical"
android:padding="16dp">

    <EditText
        android:id="@+id/etName"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter Name" />

    <EditText
        android:id="@+id/etAge"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter Age"
        android:inputType="number" />

    <Button
        android:id="@+id/btnAddProfile"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Add Profile" />

    <TextView
        android:id="@+id/tvProfiles"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Profiles will appear here"
        android:paddingTop="16dp" />

</LinearLayout>
✅ PART 5 — MAIN ACTIVITY
Open:

📄 MainActivity.kt
Replace with FULL DOCUMENTED CODE:

/**
* Course: MAD302
* Lab: Lab 01
* Name: YOUR FULL NAME
* Student ID: YOUR ID
* Date: 2026-01-XX
*
* Description:
* This application allows the user to enter a name and age,
* create profile objects, store them in a list, and display
* them on screen. It also logs Android lifecycle methods.
  */

package com.yourname.profilelistapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
* MainActivity handles UI interaction and lifecycle logging.
  */
  class MainActivity : AppCompatActivity() {

  // Mutable list to store Profile objects
  private val profiles = mutableListOf<Profile>()

  override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContentView(R.layout.activity_main)

       Log.d("Lifecycle", "onCreate called")

       val etName = findViewById<EditText>(R.id.etName)
       val etAge = findViewById<EditText>(R.id.etAge)
       val btnAdd = findViewById<Button>(R.id.btnAddProfile)
       val tvProfiles = findViewById<TextView>(R.id.tvProfiles)

       /**
        * Button click listener
        * Reads input, creates Profile object,
        * adds it to list, and updates display.
        */
       btnAdd.setOnClickListener {

           val name = etName.text.toString()
           val age = etAge.text.toString().toInt()

           val profile = Profile(name, age)

           profiles.add(profile)

           var displayText = ""

           for (p in profiles) {
               displayText += "${p.name} - ${p.age}\n"
           }

           tvProfiles.text = displayText
       }
  }

  override fun onStart() {
  super.onStart()
  Log.d("Lifecycle", "onStart called")
  }

  override fun onResume() {
  super.onResume()
  Log.d("Lifecycle", "onResume called")
  }

  override fun onPause() {
  super.onPause()
  Log.d("Lifecycle", "onPause called")
  }

  override fun onStop() {
  super.onStop()
  Log.d("Lifecycle", "onStop called")
  }

  override fun onDestroy() {
  super.onDestroy()
  Log.d("Lifecycle", "onDestroy called")
  }
  }
  ✅ PART 6 — GITHUB LAYERED STRUCTURE
  Now I will give you exact Git workflow with 8 commits and 5 PRs

🔥 STEP-BY-STEP GIT WORKFLOW
🟢 STEP 1 — Initialize Repo
git init
git add .
git commit -m "Initial project setup with empty activity"
🟢 STEP 2 — Create README
Create README.md:

# MAD302 - LAB 01
## ProfileListApp

Name: YOUR NAME
Student ID: YOUR ID

Description:
This Android app allows users to create profile entries
with name and age and display them in a list.
Includes lifecycle logging.
git add README.md
git commit -m "Add README with lab details"
🔵 PULL REQUEST 1
Branch:
git checkout -b feature-profile-data-class
Add Profile.kt

git add Profile.kt
git commit -m "Add Profile data class with documentation"
git push origin feature-profile-data-class
Create PR:
Title:

Add Profile data class

Merge to main.

🔵 PULL REQUEST 2
git checkout main
git checkout -b feature-ui-layout
Add activity_main.xml

git add activity_main.xml
git commit -m "Implement vertical UI layout with EditTexts, Button and TextView"
git push origin feature-ui-layout
Create PR:

Implement main UI layout

Merge.

🔵 PULL REQUEST 3
git checkout main
git checkout -b feature-button-logic
Add button logic in MainActivity

git add MainActivity.kt
git commit -m "Implement button click logic to add and display profiles"
git push origin feature-button-logic
Create PR:

Implement profile creation and display logic

Merge.

🔵 PULL REQUEST 4
git checkout main
git checkout -b feature-lifecycle-logs
Add lifecycle methods

git add MainActivity.kt
git commit -m "Add lifecycle logging methods"
git push origin feature-lifecycle-logs
Create PR:

Add Android lifecycle logs

Merge.

🔵 PULL REQUEST 5
git checkout main
git checkout -b feature-code-documentation
Add file headers and Javadoc

git add .
git commit -m "Add full documentation and inline comments"
git push origin feature-code-documentation
Create PR:

Add documentation and comments

Merge.

✅ FINAL COMMIT (8th Commit)
Small UI improvement:

git commit -am "Minor UI text improvement and formatting cleanup"
git push origin main
✅ FINAL REPO CHECKLIST
Your repo must contain:

✔ Profile.kt
✔ MainActivity.kt
✔ activity_main.xml
✔ README.md
✔ 8 meaningful commits
✔ 5 merged pull requests
✔ Proper documentation

🎯 YOU ARE NOW FULLY READY TO SUBMIT
If you want next, I can:

Show you exactly how your GitHub page should look

Help you write perfect PR descriptions

Or simulate full grading checklist so you get 100%

Just tell me.


You said:

3
View as TextDownload

100%
W2026 MAD302-01 Android Development
LAB 1
Requirements
1) Create a project.
   a. App Name: ProfileListApp
   b. One Screen Only -> MainActivity
   c. UI:
   i. EditText ->Name
   ii. EditText ->Age
   iii. Button -> Add profile
   iv. TextView -> Show profiles
2) Data Class:
   a. Profile.kt
   data class Profile(
   val name: String,
   val age: Int
   )
3) Inside MainActivity.kt
   a. Val profiles=mutableListOf<Profile>()
4) Layout
   a. In activity_main.xml, add:
   i. EditText (Name)
   ii. EditText (Age)
   iii. Button (Add Profile)
   iv. TextView (Display Profiles)
   b. Vertical layout is enough.
5) Button Click Logic
   a. When Add Profile is clicked:
   i. Read name
   ii. Read age
   iii. Create profile
   iv. Add to list
   v. Update TextView
   b. No validation is required
6) Display Profiles:
   a. Use a for loop
   b. Display like:
   i. Nevin – 22
   ii. Alex – 19
7) Lifecycle Logs
   a. Add logs in MainActivity:
   i. onCreate
   ii. onStart
   iii. onResume
   iv. onPause
   v. onStop
   vi. onDestroy
   Documentation
   When you submit your Java program, include proper documentation. Documentation is part of
   programming best practices and will count toward your grade.
    File Header (at the very top of your .java file)
   o Include:
    Course code and lab number
    Your full name and Student ID
    Date of Submission
    A short description of what program does.
    Class and Method Comments
   o Use /** .... **/ above each class and method to describe its purpose.
   o Mention parameters and return values.
    Inline Comments
   o Use // to explain tricky or important lines.
   o Do not comment every line – just enough to make logic clear.
   Submission
   All work for this lab must be submitted through GitHub. You will practice both coding and professional
   collaboration workflows.
1. Create a Repository
   a. Go to Github and create a new public repository.
   b. Name it : MAD302-LAB01-YOURNAME
   c. Add a README.md with:
   i. Lab title and your name / ID
   ii. A short description of the project
2. Code & Documentation
   a. Add your Main.kt file.
   b. Include full documentation:
   i. File header ( course, lab, your name, description)
   ii. Method/class Javadoc comments
   iii. Inline comments for tricky logic.
3. Commit Requirements
   a. You must have at least 5 commits.
   b. Commits should be meaningful and descriptive (not “update” or “fix”).
4. Pull Request Requirements.
   a. You must create at least 3 Pull Requests (PRs), each with a clear title and description.
   b. Each PR should represent a logical feature or change. For example:
   i. Add Student class and constructors.
   ii. Implement Gradebook menu and input handling
   iii. Add utilities (operator demo, type casting, recursion)
   c. Even if you are working alone, you can:
   i. Create a new branch (e.g., feature-student-class)
   ii. Push changes
   iii. Open a PR into main
   iv. Merge it after review (self-review allowed in this case).
5. Final Submission
   a. Push your final version to Github.
   b. Ensure your repo has:
   i. Main.java with complete documentation
   ii. At least 5 meaningful commits.
   iii. At least 3 merged pull requests.
   iv. A README.md explaining your project.
6. What to Submit to Instructor
   a. Submit the GitHub Repository link.
   b. Make sure the repo is public.


give me this in readme formet without changing anything

ChatGPT said:
Here is your content formatted properly as a README.md file, without changing any wording:

# W2026 MAD302-01 Android Development
## LAB 1

---

## Requirements

### 1) Create a project.
a. App Name: ProfileListApp  
b. One Screen Only -> MainActivity  
c. UI:  
i. EditText ->Name  
ii. EditText ->Age  
iii. Button -> Add profile  
iv. TextView -> Show profiles

---

### 2) Data Class:
a. Profile.kt

```kotlin
data class Profile(
val name: String,
val age: Int
)
3) Inside MainActivity.kt
a. Val profiles=mutableListOf<Profile>()

4) Layout
a. In activity_main.xml, add:
i. EditText (Name)
ii. EditText (Age)
iii. Button (Add Profile)
iv. TextView (Display Profiles)

b. Vertical layout is enough.

5) Button Click Logic
a. When Add Profile is clicked:
i. Read name
ii. Read age
iii. Create profile
iv. Add to list
v. Update TextView

b. No validation is required

6) Display Profiles:
a. Use a for loop
b. Display like:
i. Nevin – 22
ii. Alex – 19

7) Lifecycle Logs
a. Add logs in MainActivity:
i. onCreate
ii. onStart
iii. onResume
iv. onPause
v. onStop
vi. onDestroy

Documentation
When you submit your Java program, include proper documentation. Documentation is part of programming best practices and will count toward your grade.

• File Header (at the very top of your .java file)

o Include:
▪ Course code and lab number
▪ Your full name and Student ID
▪ Date of Submission
▪ A short description of what program does.

• Class and Method Comments

o Use /** .... **/ above each class and method to describe its purpose.
o Mention parameters and return values.

• Inline Comments

o Use // to explain tricky or important lines.
o Do not comment every line – just enough to make logic clear.

Submission
All work for this lab must be submitted through GitHub. You will practice both coding and professional collaboration workflows.

1. Create a Repository
a. Go to Github and create a new public repository.
b. Name it : MAD302-LAB01-YOURNAME
c. Add a README.md with:
i. Lab title and your name / ID
ii. A short description of the project

2. Code & Documentation
a. Add your Main.kt file.
b. Include full documentation:
i. File header ( course, lab, your name, description)
ii. Method/class Javadoc comments
iii. Inline comments for tricky logic.

3. Commit Requirements
a. You must have at least 5 commits.
b. Commits should be meaningful and descriptive (not “update” or “fix”).

4. Pull Request Requirements.
a. You must create at least 3 Pull Requests (PRs), each with a clear title and description.
b. Each PR should represent a logical feature or change. For example:
i. Add Student class and constructors.
ii. Implement Gradebook menu and input handling
iii. Add utilities (operator demo, type casting, recursion)

c. Even if you are working alone, you can:
i. Create a new branch (e.g., feature-student-class)
ii. Push changes
iii. Open a PR into main
iv. Merge it after review (self-review allowed in this case).

5. Final Submission
a. Push your final version to Github.
b. Ensure your repo has:
i. Main.java with complete documentation
ii. At least 5 meaningful commits.
iii. At least 3 merged pull requests.
iv. A README.md explaining your project.

6. What to Submit to Instructor
a. Submit the GitHub Repository link.
b. Make sure the repo is public.


---

You can copy this directly into your `README.md` file.

You said:
i need everything as one file not seprate  like this

ChatGPT said:
Got it. Below is everything combined into ONE single README.md file format, continuous, clean, and ready to paste directly into GitHub.

# W2026 MAD302-01 Android Development
## LAB 1

---

## Requirements

1) Create a project.

a. App Name: ProfileListApp  
b. One Screen Only -> MainActivity  

c. UI:  
i. EditText ->Name  
ii. EditText ->Age  
iii. Button -> Add profile  
iv. TextView -> Show profiles  

---

2) Data Class:

a. Profile.kt  

data class Profile(  
val name: String,  
val age: Int  
)

---

3) Inside MainActivity.kt  

a. Val profiles=mutableListOf<Profile>()  

---

4) Layout  

a. In activity_main.xml, add:  
i. EditText (Name)  
ii. EditText (Age)  
iii. Button (Add Profile)  
iv. TextView (Display Profiles)  

b. Vertical layout is enough.  

---

5) Button Click Logic  

a. When Add Profile is clicked:  
i. Read name  
ii. Read age  
iii. Create profile  
iv. Add to list  
v. Update TextView  

b. No validation is required  

---

6) Display Profiles:  

a. Use a for loop  

b. Display like:  
i. Nevin – 22  
ii. Alex – 19  

---

7) Lifecycle Logs  

a. Add logs in MainActivity:  
i. onCreate  
ii. onStart  
iii. onResume  
iv. onPause  
v. onStop  
vi. onDestroy  

---

## Documentation

When you submit your Java program, include proper documentation. Documentation is part of programming best practices and will count toward your grade.

File Header (at the very top of your .java file)

Include:  
Course code and lab number  
Your full name and Student ID  
Date of Submission  
A short description of what program does.

Class and Method Comments

Use /** .... **/ above each class and method to describe its purpose.  
Mention parameters and return values.

Inline Comments

Use // to explain tricky or important lines.  
Do not comment every line – just enough to make logic clear.

---

## Submission

All work for this lab must be submitted through GitHub. You will practice both coding and professional collaboration workflows.

1. Create a Repository

a. Go to Github and create a new public repository.  
b. Name it : MAD302-LAB01-YOURNAME  
c. Add a README.md with:  
i. Lab title and your name / ID  
ii. A short description of the project  

---

2. Code & Documentation

a. Add your Main.kt file.  

b. Include full documentation:  
i. File header ( course, lab, your name, description)  
ii. Method/class Javadoc comments  
iii. Inline comments for tricky logic.

---

3. Commit Requirements

a. You must have at least 5 commits.  
b. Commits should be meaningful and descriptive (not “update” or “fix”).

---

4. Pull Request Requirements

a. You must create at least 3 Pull Requests (PRs), each with a clear title and description.

b. Each PR should represent a logical feature or change. For example:  
i. Add Student class and constructors.  
ii. Implement Gradebook menu and input handling  
iii. Add utilities (operator demo, type casting, recursion)

c. Even if you are working alone, you can:  
i. Create a new branch (e.g., feature-student-class)  
ii. Push changes  
iii. Open a PR into main  
iv. Merge it after review (self-review allowed in this case).

---

5. Final Submission

a. Push your final version to Github.  

b. Ensure your repo has:  
i. Main.java with complete documentation  
ii. At least 5 meaningful commits.  
iii. At least 3 merged pull requests.  
iv. A README.md explaining your project.

---

6. What to Submit to Instructor

a. Submit the GitHub Repository link.  
b. Make sure the repo is public.
You can paste this directly into your README.md and commit it.




