Got it ✅ I see your **NetBeans Hibernate project structure** (with Servlets, Hibernate config, entity, utility, and required libraries).
Here’s a **README.md** file written to match exactly what’s in your screenshot/project.

---

# Hibernate\_01 — Contact Management (Java EE + Hibernate)

This project demonstrates how to integrate **Hibernate ORM** with a **Java EE Servlet application** in **NetBeans**.
It uses **MySQL** as the database and provides a simple example of saving contact information.

---

## 📂 Project Structure

```
Hibernate_01/
 ├── Web Pages/
 │   └── index.html
 │
 ├── Source Packages/
 │   ├── (default package)
 │   │    └── hibernate.cfg.xml          # Hibernate configuration
 │   │
 │   ├── controller/
 │   │    └── SaveContact.java           # Servlet to save contact
 │   │
 │   └── hibernate/
 │        ├── Contacts.java              # Entity mapped to 'contact' table
 │        └── HibernateUtil.java         # Hibernate utility (SessionFactory)
 │
 ├── Libraries/                          # Required JAR files
 │   ├── mysql-connector-j-8.4.0.jar
 │   ├── hibernate-core-4.3.1.Final.jar
 │   ├── hibernate-entitymanager-4.3.1.Final.jar
 │   ├── hibernate-commons-annotations-4.0.4.Final.jar
 │   ├── hibernate-ehcache-4.3.1.Final.jar
 │   ├── hibernate-c3p0-4.3.1.Final.jar
 │   ├── antlr-2.7.7.jar
 │   ├── c3p0-0.9.2.1.jar
 │   ├── dom4j-1.6.1.jar
 │   ├── ehcache-core-2.4.3.jar
 │   ├── jboss-logging-3.1.3.GA.jar
 │   ├── jboss-transaction-api_1.2_spec-1.0.0.Final.jar
 │   ├── slf4j-api-1.6.1.jar
 │   ├── slf4j-simple-1.6.1.jar
 │   ├── javassist-3.18.1-GA.jar
 │   ├── mchange-commons-java-0.2.3.4.jar
 │   └── ...
 │
 └── Configuration Files/
      └── GlassFish Server (deployment)
```

---

## ⚙️ Technologies Used

* **Java EE (Servlets)**
* **Hibernate ORM 4.3.1**
* **MySQL Connector/J 8.4.0**
* **GlassFish Server**
* **NetBeans IDE**
* **JDK 21**

---

## 🛠 Database Setup

1. Create the database:

```sql
CREATE DATABASE day05;
```

2. Create the `contact` table:

```sql
CREATE TABLE contact (
  id INT AUTO_INCREMENT PRIMARY KEY,
  mobile VARCHAR(10) NOT NULL,
  first_name VARCHAR(45) NOT NULL,
  last_name VARCHAR(45) NOT NULL,
  company VARCHAR(45) NOT NULL,
  created_on DATETIME NOT NULL
);
```

---

## 📌 How It Works

* `hibernate.cfg.xml` → Configures database connection and Hibernate properties.
* `Contacts.java` → Entity class mapped to the `contact` table.
* `HibernateUtil.java` → Provides a singleton `SessionFactory`.
* `SaveContact.java` → Servlet that saves a new contact to the database.

---

## ▶️ Running the Project

1. Open the project in **NetBeans**.
2. Make sure **MySQL** is running and update DB credentials in `hibernate.cfg.xml`.
3. Deploy the project on **GlassFish Server** (or Tomcat if configured).
4. Visit the servlet in your browser:

```
http://localhost:8080/Hibernate_01/SaveContact
```

5. If successful, you will see:

```
Contact saved successfully!
```

---

## ✅ Features

* Hibernate + Servlet integration
* MySQL persistence with entity mapping
* Transaction handling via Hibernate
* Simple, modular project structure

---

## 📜 License

This project is licensed under the MIT License.

---

Do you want me to also add a **quick installation guide with JAR setup steps** (for someone cloning your repo), or keep it like this (self-explanatory with NetBeans)?
