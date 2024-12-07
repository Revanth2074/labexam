<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Update Book</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        h2 {
            color: #333;
        }
        form {
            margin: 20px 0;
        }
        label {
            display: block;
            margin: 10px 0 5px;
        }
        input[type="text"], input[type="number"] {
            width: 100%;
            padding: 8px;
            margin: 5px 0 10px;
            border: 1px solid #ddd;
        }
        button {
            padding: 10px 15px;
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
    </style>
</head>
<body>
<h2>Update Book</h2>
<form action="/books/update/${book.id}" method="post">
    <label for="title">Title:</label>
    <input type="text" id="title" name="title" value="${book.title}" required>

    <label for="author">Author:</label>
    <input type="text" id="author" name="author" value="${book.author}" required>

    <label for="genre">Genre:</label>
    <input type="text" id="genre" name="genre" value="${book.genre}" required>

    <label for="price">Price:</label>
    <input type="number" id="price" name="price" value="${book.price}" required>

    <label for="publishedYear">Published Year:</label>
    <input type="number" id="publishedYear" name="publishedYear" value="${book.publishedYear}" required>

    <button type="submit">Update Book</button>
</form>
</body>
</html>