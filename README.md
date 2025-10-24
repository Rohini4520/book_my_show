# 🎬 Book My Show – Backend (Spring Boot)

This is a backend implementation of a movie ticket booking platform inspired by BookMyShow. It manages users, movies, theatres, shows, seats, and ticket booking with seat availability logic.

## 🚀 Tech Stack
- Java 
- Spring Boot
- Hibernate / JPA
- MySQL
- Maven
- Postman

## ✅ Key Features
- 👤 User Registration & Management
- 🎬 Add & Manage Movies
- 🏛️ Add Theatres & Seat Layouts
- 🕒 Schedule Shows
- 🪑 Manage Show Seat Availability
- 🎟️ Book Multiple Seats
- 💰 Automatic Total Ticket Cost Calculation
- 🔁 Update Seat Status on Booking
- 📜 Ticket History for Users

## 🧩 Architecture (3-Layered)
Controller → Service → Repository

- Controller: Exposes REST APIs
- Service: Business logic
- Repository: Database operations using JPA

## 📦 Entities (Models)
- User
- Movie
- Theater
- TheaterSeat
- Show
- ShowSeat
- Ticket

## 🔗 Relationships
- One Theater → Many Shows
- One Show → Many ShowSeats
- One User → Many Tickets
- One Show → Many Tickets

## 🧾 Sample Ticket Booking JSON
```json
{
  "userId": 101,
  "showId": 15,
  "requestedSeats": ["A1", "A2", "A3"]
}

🛠️ Tools Used

IntelliJ 

MySQL Workbench

Postman

Git / GitHub

🧪 Validations & Constraints

Prevents double booking of seats

Checks show timing availability

Marks booked seats as unavailable

💡 Highlights

Uses Lombok @Builder for cleaner object creation

Uses bidirectional mappings

Modular folder structure

Realistic booking logic

🔮 Future Enhancements

Email ticket confirmation

Seat cancellation flow

OTP based booking

Admin panel for movie/show management

📂 Project Structure
src/main/java/com/acciojob/book_my_show_august
  controller
 ┣ service
 ┣ repository
 ┣ models
 ┣ requestDtos
 ┣ enums


👨‍💻 Author

Rohini Patil
GitHub: https://github.com/Rohini4520
