# Automation-Challenge
> This is a  Selenium Java TestNG Maven framework that automates a UI Test and API Test on a single framework. This project uses page object model design principle for easy readability and code maintenance.






## Built With
- Selenium Webdriver  
- Java  
- TestNG  

## Automated BASEURL
- https://www.amazon.in/
- https://reqres.in/api/users



## Getting Started

** The test automates the  selection of an item(Samsung) on the  Amazon website and prints information details about the second highest samsung appliance selected item on the console
2.To run a rest assured post call to create user while the following assertions were made
- i. Response code
- ii. Response schema
- iii. Response time is within 2 seconds
- iv. Response header has “Content-Type” with value containing “application/json”
- v. Response can be deserialised to POJO**


### Prerequisites
- Get JDK version 8 and above installed on your local 
- Set JAVA_HOME in environment variables
- Have an IDE installed on your computer to be able to setup framwork and run tests.


### Setup
- Open a command line terminal (Git bash preferrably) and navigate to a directory where you would like to save the work folder using cd.
- Clone the repository with git clone https://github.com/Nikkydee/Automation-Challenge.git
- To get the cuurent working tree, git fetch --all, then checkout to Amazon-homepage branch.
- Later, Navigate to File menu on Intellij  and open the project from your local.
- Go to the the testng.xml file on the project menu pane
- Right-click on the testng.xmlfile and select run sa testng.xml

### Install
- IDE preferrably Intellij
- Have a stable internet connection

### Docker Usage
>Prequisite
-Install JDK and Install Maven and set MAVEN_HOME in environmental variable
-Install docker on your local machine
-Go to Command Prompt Window on your local
 
- Change Directory to project directory e.g C:\Users\adenike.olapetan\IdeaProjects\Automation-Challenge\Amazon>
-Run this command docker build -t amazon:latest .



## Author

👤 **Adenike Olapetan**

- GitHub: [@Nikkydee](https://github.com/Nikkydee)
- LinkedIn:[@adenike-olapetan](https://www.linkedin.com/in/adenike-olapetan-05a2607a/)




## 🤝 Contributing
Contributions, issues, and feature requests are welcome!



## Show your support

Give a ⭐️ if you like this project!



## 📝 License


This project is [MIT](./MIT.md) licensed.