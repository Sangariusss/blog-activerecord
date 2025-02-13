# Blog Active Record

## Table of Contents

- [Overview](#overview)
- [Technologies](#technologies)
- [Features](#features)
- [File Structure](#file-structure)
- [Setup](#setup)
- [Usage](#usage)
- [Contributions](#contributions)
- [License](#license)

## Overview

This project is a blog management system where users can create, view, and comment on articles. The system demonstrates the use of Active Record, a design pattern for working with databases, and includes a simple web interface to manage articles and comments.

## Technologies

- **Java 21**: Core programming language for the system.
- **Spring Boot**: Web framework for building the application.
- **Lombok**: Java library for simplifying code by generating boilerplate methods automatically.
- **H2 Database**: In-memory database for storing articles and comments.
- **Active Record Pattern**: Used for database interactions.

## Features

- **Create Articles**: Users can create new articles by providing a title and content.
- **View Articles**: Users can view a list of articles and their details.
- **Add Comments**: Users can post comments on articles.
- **View Comments**: Comments are displayed below the article.
- **Article Details**: Each article has a page displaying its title, content, and associated comments.

## File Structure

```
src/main/java/com/sangarius/blogactiverecord/
├── controller/                                              # Controllers for handling web requests
│   └── ArticleController.java
│   └── CommentController.java
├── model/                                                   # Domain models for articles and comments
│   └── Article.java
│   └── Comment.java
├── repository/                                              # Repository layer (Active Record pattern)
│   └── ArticleRepository.java
│   └── CommentRepository.java
├── service/                                                 # Business logic services
│   └── ArticleService.java
│   └── CommentService.java
├── dto/                                                     # Data Transfer Objects for Article and Comment
│   └── ArticleDTO.java
│   └── CommentDTO.java
├── BlogApplication.java                                     # Main application class
├── resources/
│   ├── static/                                              # Static resources (HTML, CSS, JS)
│   │   ├── templates/                                       # HTML pages
│   │   │   └── index.html
│   │   │   └── article.html
│   │   ├── css/                                             # Stylesheets
│   │   │   └── styles.css
│   │   ├── js/                                              # JavaScript files
│   │   │   └── script.js
│   └── application.properties                               # Application configuration file
pom.xml                                                      # Maven configuration file
README.md                                                    # Project overview and setup instructions
.gitignore                                                   # Git ignore file
LICENSE                                                      # Project license file
```

## Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/sangariusss/blog-activerecord.git
   cd blog-activerecord
   ```

2. **Build the project:**
   ```bash
   mvn clean install
   ```

3. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

   The application will be accessible at `http://localhost:8080`.

## Usage

1. **Create an Article:**
    - Go to `http://localhost:8080` and click on the "Add New Article" button.
    - Enter a title and content for the article and click "Submit".
    - The article will be added to the list of articles on the home page.

2. **View an Article:**
    - Click on an article's title on the home page to view its details, including the full content.

3. **Add a Comment:**
    - On the article detail page, enter a comment in the "Add a Comment" section.
    - Click "Add Comment" to post your comment. The comment will appear below the article content.

4. **View Comments:**
    - After posting a comment, it will be displayed below the article.

## Contributions

Contributions are welcome! If you'd like to add features, fix bugs, or improve the system, please feel free to fork the repository and submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.