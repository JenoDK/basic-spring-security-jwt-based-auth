# Basic Spring Security Authentication with stateless JWT tokens

This project creates a basic backend that authenticates using JWT tokens.  

## Config/Setup

The app runs on port `8081` by default.  
Every endpoint is protected except
```
/auth/**
/test/**
```
Users are kept in memory, you can use
```
user:user (with a USER role)
admin:admin (with a USER and ADMIN role)
```

## Run

Run as a spring boot project.
```
./gradlew bootRun
```