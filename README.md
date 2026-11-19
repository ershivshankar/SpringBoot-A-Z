<div align="center">

<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
<img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" />
<img src="https://img.shields.io/badge/Apache%20Tomcat-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=black" />
<img src="https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" />

<br/><br/>

# ☕ SpringBoot A–Z

**A collection of Java & Spring Boot projects covering core Java concepts,  
JDBC, MySQL, Multithreading, Servlets, JSP, and Spring Boot development.  
This repository documents my learning journey with practical, hands-on coding.**

<br/>

![Total Commits](https://img.shields.io/github/commit-activity/t/ershivshankar/SpringBoot-A-Z?style=flat-square&label=Total%20Commits&color=22c55e)
![Repo Size](https://img.shields.io/github/repo-size/ershivshankar/SpringBoot-A-Z?style=flat-square&color=6366f1)
![Last Commit](https://img.shields.io/github/last-commit/ershivshankar/SpringBoot-A-Z?style=flat-square&color=f59e0b)
![License](https://img.shields.io/badge/License-MIT-yellow?style=flat-square)

</div>

---

## 📊 Overall Progress

> ✅ Checked box = file committed to `main` &nbsp;|&nbsp; ⬜ Unchecked = planned, not pushed yet

```
█████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░  34%
10 / 29 topics committed  ·  3 Active Modules
```

| Module | Topics Done | Progress |
|--------|-------------|----------|
| 🗃️ JDBC | 1 / 10 | `█░░░░░░░░░` 10% |
| 🧵 Multithreading | 4 / 9 | `████░░░░░` 44% |
| 🌐 Servlet & JSP | 5 / 10 | `█████░░░░░` 50% |

---

## 🗃️ Module 1 — JDBC

> 📂 `JDBC/src/main/java/org/example/`

```
█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░  10%
1 / 10 topics committed
```

- [x] JDBC Practice Queries — `JDBCpraticequery.java`
- [ ] JDBC Setup — DriverManager · Connection · Statement
- [ ] PreparedStatement — Parameterized Queries
- [ ] CallableStatement — Stored Procedures
- [ ] ResultSet — Iterating & Mapping to Objects
- [ ] Batch Processing
- [ ] Transaction Management — `commit()` · `rollback()`
- [ ] Connection Pooling — HikariCP / c3p0
- [ ] JDBC with MySQL — Full CRUD
- [ ] DAO Pattern with JDBC

---

## 🧵 Module 2 — Multithreading

> 📂 `MultiThreading/`

```
████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░  44%
4 / 9 topics committed
```

- [x] Basic Thread Concepts — `BasicThreadConcept.java`
- [x] Synchronization — Movie Ticket Booking · `MovieTicketUsingSynchronization.java`
- [x] Timer Project using Thread Concept — `TimerProjectUsingThreadConcept.java`
- [x] Watch Project using Sleep Method — `WatchProjectUsingSleepMethod.java`
- [ ] Thread Lifecycle — States & Transitions
- [ ] `wait()` · `notify()` · `notifyAll()`
- [ ] ExecutorService & Thread Pools
- [ ] `Future` & `CompletableFuture`
- [ ] Deadlock Detection & Prevention

---

## 🌐 Module 3 — Servlet & JSP

> 📂 `ServletandJsp/ServletA-Z/src/main/`

```
█████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░  50%
5 / 10 topics committed
```

- [x] Register Servlet — `Register.java`
- [x] Login Servlet — `Login.java`
- [x] Logout Servlet — `Logout.java`
- [x] Landing Page — `index.html`
- [x] Dashboard Page — `dashboard.html`
- [ ] Session Management — `HttpSession` · Cookies
- [ ] Servlet Filters & Listeners
- [ ] `RequestDispatcher` — `forward()` vs `redirect()`
- [ ] JSP Integration — EL & JSTL
- [ ] Full Auth Flow — Register → Login → Dashboard → Logout

---

## 📁 Repository Structure

```
SpringBoot-A-Z/
│
├── 📂 JDBC/
│   ├── pom.xml
│   └── src/main/java/org/example/
│       └── JDBCpraticequery.java          ✅
│
├── 📂 MultiThreading/
│   ├── BasicThreadConcept.java             ✅
│   ├── MovieTicketUsingSynchronization.java ✅
│   ├── TimerProjectUsingThreadConcept.java  ✅
│   └── WatchProjectUsingSleepMethod.java    ✅
│
├── 📂 ServletandJsp/
│   └── ServletA-Z/src/main/
│       ├── java/Servletbasic/
│       │   ├── Login.java                  ✅
│       │   ├── Logout.java                 ✅
│       │   └── Register.java               ✅
│       └── webapp/
│           ├── index.html                  ✅
│           └── dashboard.html              ✅
│
└── README.md
```

---

## 🚀 How to Run

**JDBC**
```bash
cd JDBC
mvn compile exec:java
```

**Multithreading**
```bash
cd MultiThreading
javac BasicThreadConcept.java
java BasicThreadConcept
```

**Servlet & JSP**
```bash
# Build the WAR and deploy to Apache Tomcat
# Copy ServletA-Z project into $TOMCAT_HOME/webapps/
# Start Tomcat and visit: http://localhost:8080/ServletA-Z/
```

---

## 🛠️ Tech Stack

| Area | Technology |
|------|------------|
| Language | Java 17 / 21 |
| Database | MySQL via JDBC |
| Build Tool | Maven |
| Web Layer | Servlets · JSP · HTML |
| Web Server | Apache Tomcat |
| IDE | Eclipse / IntelliJ IDEA |

---

## 📌 Commit Convention

```
feat(jdbc): add prepared statement examples
feat(multithreading): add executor service demo
fix(servlet): fix session handling in LoginServlet
docs(readme): update progress — Module 2 complete
```

---

<div align="center">
  <sub>
    Built commit by commit &nbsp;·&nbsp;
    New modules appear here as new folders are pushed to <code>main</code>
  </sub>
</div>
