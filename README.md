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
