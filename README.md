# 🍔 QuickBite - Full Stack Food Delivery App

**QuickBite** is an end-to-end Java Full Stack Food Delivery Application. It enables users to browse restaurants, view food images, place orders, manage deliveries, and more. The project is modularized into three core components for easier management and scaling.

---

## 📦 Modules

### 🔹 `adminpanel`
Admin dashboard for managing restaurants, menus, and customer orders.

### 🔹 `foodies`
The user-facing food ordering app built with modern frontend technologies. Includes rich UI, image gallery of food items, and real-time ordering.

### 🔹 `foodiesapi`
Spring Boot backend that powers APIs for restaurant search, user registration, order tracking, and more.

### 🔹 `food images`
Contains the image assets used in the app including food thumbnails, banners, and menus.

---

## ⚙️ Tech Stack

- Frontend: React, Vite, JavaScript, HTML/CSS
- Backend: Java 17, Spring Boot, Maven
- Mobile: Android (Java/Kotlin)
- Database: MySQL
- Auth: Firebase
- API Testing: Postman
- Dev Tools: IntelliJ IDEA, VS Code

---

## 📁 Project Structure

```plaintext
QuickBite online-food-delivery-project/
│
├── adminpanel/
├── foodies/                 # Frontend app (React)
├── foodiesapi/              # Backend (Spring Boot)
├── food images/             # Static food images
├── Postman API collection.pdf
├── Steps to follow.pdf
└── README.md
```

---

## 📄 Documentation

- [📥 Postman API Collection](./Postman%20API%20collection.pdf)
- [📘 Setup Guide](./Steps%20to%20follow.pdf)

---

## 🚀 How to Run the Project

### Backend (Spring Boot):
```bash
cd foodiesapi
./mvnw spring-boot:run
```

### Frontend (React):
```bash
cd foodies
npm install
npm run dev
```

---

## 👨‍💻 Author

**Sai Teja**  
📧 Email: saite@example.com  
🗓️ Date: May 2025

---

## 📢 License

This project is for educational and demonstration purposes only.
