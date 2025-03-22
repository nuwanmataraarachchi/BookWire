# BookWire CRUD Application

## Description
BookWire is a simple CRUD application to manage books. It allows users to create, read, update, and delete books from the system.

## Features
- Create new books
- Read book details
- Update existing books
- Delete books

## Technologies Used
- **Java** (Backend)
- **Spring Boot** (Framework)
- **MySQL** (Database)
- **Thymeleaf** (Frontend, optional if using for rendering)

## Getting Started

To get a local copy of the project up and running, follow these steps.

### Prerequisites
- Java 8 or above
- Maven
- MySQL database (or use an embedded database for testing)

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/bookwire.git
    ```

2. Navigate to the project directory:

    ```bash
    cd bookwire
    ```

3. Update your database configuration in `application.properties`.

4. Build and run the project:

    ```bash
    mvn spring-boot:run
    ```

The application should now be running on `http://localhost:8080`.

## API Endpoints

Here are the available API endpoints:

- `GET /books` - Retrieve all books
- `GET /book/{id}` - Retrieve a specific book by ID
- `POST /book` - Create a new book
- `PUT /book/{id}` - Update an existing book
- `DELETE /book/{id}` - Delete a book

## Example Requests

### Create a new book:

```bash
POST /book
Content-Type: application/json

{
    "title": "Book Title",
    "author": "Author Name",
    "genre": "Genre"
}
