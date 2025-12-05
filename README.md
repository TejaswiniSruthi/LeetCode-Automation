# 🚀 LeetCode UI Automation (Selenium + Java)

This project automates basic interactions on **LeetCode** using **Selenium WebDriver**.
It visits LeetCode, navigates to problem listings, opens questions, verifies URLs, and checks expected behaviors—just like an SDET would automate a real web workflow.

---

## 📌 What This Automation Does

✔ Opens the LeetCode homepage
✔ Navigates to the **Problems/Questions** page
✔ Opens and verifies the first **5 problem titles**
✔ Opens the **Two Sum** problem and checks if the URL is correct
✔ Tries accessing **Submissions** and validates whether the system asks the user to **Login or Register**

This helps simulate a basic testing flow to confirm UI behavior, navigation, and expected user restrictions when not logged in.

---

## 🧰 Tech Stack

| Component               | Used               |
| ----------------------- | ------------------ |
| Language                | Java               |
| Automation Tool         | Selenium WebDriver |
| Browser Driver Handling | WebDriverManager   |
| Browser Used            | Chrome             |
| Build Tool              | Gradle             |

---

## 🛠 How to Run the Project

Make sure you have **Java installed**.

Then run these commands inside the project:

```
./gradlew clean build
./gradlew run
```

(Windows PowerShell):

```
.\gradlew.bat clean build
.\gradlew.bat run
```

Selenium and dependencies will install automatically the first time you run it.

---

## 🧪 Test Flow (Methods Implemented)

| Method         | Purpose                                            |
| -------------- | -------------------------------------------------- |
| `testCase01()` | Check if the homepage loads successfully           |
| `testCase02()` | Navigate to problem page and verify listing        |
| `testCase03()` | Open the **Two Sum** problem                       |
| `testCase04()` | Check login enforcement when accessing submissions |

---

## 🔮 Future Improvements

* Add assertions instead of `System.out.println()`
* Convert test execution to **JUnit/TestNG**
* Add reporting (Extent Reports / Allure)
* Add multi-browser support
* Run tests through CI pipelines (GitHub Actions)

---

## 🤝 Contributions

Not open for contributions yet, but ideas, improvements, and suggestions are welcome.

---

## 📎 Author

**Tejaswini Thambabathula**
Learning automation, testing, and SDET workflow building.
