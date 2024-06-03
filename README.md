# Challenge: Loans API

![Java](https://img.shields.io/badge/Java-8%2B-orange) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green) [![LinkedIn](https://img.shields.io/badge/Connect%20on-LinkedIn-blue)](https://www.linkedin.com/in/joão-santos-1115a5304/)
![GPL License](https://img.shields.io/badge/License-GPL-blue) [![LinkedIn](https://img.shields.io/badge/Type-Challenge-purple)](https://github.com/backend-br/desafios/blob/master/points-of-interest/PROBLEM.md)

This is my solution for the backend challenge **Loans API**. 

Please select your preferred language:

- [English](README.md)
- [Português (Brasil)](README.pt-br.md)

Check the [challenge](https://github.com/backend-br/desafios/blob/master/loans/PROBLEM.md) for more information about the problem.

## Table of Contents

- Introduction
- Features
- Technologies
- Getting Started
- Endpoints
- Contributions
- Contact

## Introduction

The challenge consists of implementing a service that determines which loan options a person has access to.

## Features

- POST method for person's information
- Viewing available loan options

## Technologies

- ![Java](https://img.shields.io/badge/Java-8%2B-orange): Programming language.
- ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green): Framework used for building production-ready applications.

## Getting Started

Follow these steps

to run the project on your machine:

1. Clone the repository: `git clone https://github.com/gabrieudev/loans.git`
2. Navigate to the project directory: `cd <path>`
3. Build the application: `./mvnw clean install` (for Windows: `mvnw.cmd clean install`)
4. Run the application: `./mvnw spring-boot:run` (for Windows: `mvnw.cmd spring-boot:run`)

## Endpoints

- `POST /customer-loans`: Registers the person's information and returns the available loan options in the response body.

Access the complete documentation at the `/swagger-ui.html` endpoint.

## Contributions

Contributions are very welcome! If you want to contribute, fork the repository and create a pull request.

## Contact

If you have any suggestions or questions, please contact me on [LinkedIn](https://www.linkedin.com/in/gabrieudev/).

---

**License:** This project is licensed under the terms of the [GNU General Public License (GPL)](LICENSE).