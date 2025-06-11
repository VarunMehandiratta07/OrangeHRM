# 🟠 OrangeHRM Automation Test Suite

---

## 📖 Description

This project contains automated test cases for the [OrangeHRM demo site](https://opensource-demo.orangehrmlive.com/).  
It uses Selenium WebDriver and TestNG to validate core functionalities such as login (valid and invalid), and logout.  
The tests are designed following the Page Object Model pattern to ensure maintainability and scalability.

---

## 💡 Benefits of this Automation Suite

- **Reliable Verification:** Ensures login and logout workflows work as expected.  
- **Reusability:** Page Object Model allows easy extension and updates.  
- **Integration Ready:** Can be integrated with CI/CD pipelines for continuous testing.  
- **Clear Test Reports:** TestNG generates detailed reports for easy analysis.

---

## 🛠 Scope of Functionalities

- Login with valid credentials  
- Login with invalid credentials and validation of error message  
- Logout after successful login  
- Verification of dashboard visibility after login  
- Verification of homepage visibility after logout  

---

## 🛠 Setup Instructions

1. **Clone the repository**

   ```bash
   git clone https://github.com/YourUsername/YourRepoName.git
   cd YourRepoName

2. **Install Java and Maven**
- Ensure Java JDK (version 8 or higher) and Maven are installed.

3. **Configure test data**
- Update config.properties with your credentials:

4. Build the project

- Run:
- mvn clean install

**📋 Test Cases Overview**

**Test Case ID & Description**
- loginWithValidCredentials
  Verify user can login successfully with valid username/password.
  
- loginWithInvalidCredentials
  Verify error alert on login attempt with invalid password.
  
- logoutAfterSuccessfullyLogin
Verify user can logout successfully after login.

