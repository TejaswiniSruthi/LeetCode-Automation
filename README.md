# LeetCode-Automation

## 🧪 LeetCode Automation Project

This project automates basic UI interactions on **LeetCode** using **Selenium WebDriver (Java)**.
The script opens LeetCode, navigates through pages, clicks elements, retrieves data, and performs basic validation checks—similar to what an SDET would automate in a real testing environment.

### 🔍 What the automation does

* Opens LeetCode homepage and verifies the URL
* Navigates to the **Problems** page
* Extracts and opens the first **5 problem titles**
* Opens the **Two Sum** problem page and verifies navigation
* Tries to access **submissions** and checks whether the *Login/Register* prompt appears (expected behavior for non-logged in users)

### 🛠️ Tech Used

| Component       | Value                                            |
| --------------- | ------------------------------------------------ |
| Language        | Java                                             |
| Automation Tool | Selenium WebDriver                               |
| Browser         | Chrome (managed by WebDriverManager)             |
| Testing Style   | Custom method-based execution (TestCase pattern) |

### 🚀 How to Run

1. Clone the repo
2. Install dependencies
3. Update Chrome version if needed
4. Run:

```bash
mvn clean test
```

(or run `App.java` directly if you're not using test frameworks yet)


