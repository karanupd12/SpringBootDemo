# Spring Boot Demo Application

## Overview
This is a simple Spring Boot application demonstrating dependency injection and component scanning. The application consists of two main components: `Human` and `Gorillas`.

## Project Structure
- `SpringBootDemoApplication.java`: The main entry point of the application.
- `Human.java`: A Spring component that depends on the `Gorillas` component.
- `Gorillas.java`: A Spring component with a method that outputs a message.

## How It Works
1. The `Gorillas` class is marked with `@Component`, making it a Spring-managed bean.
2. The `Human` class is also marked with `@Component` and has a dependency on `Gorillas`, which is injected using `@Autowired`.
3. In the `SpringBootDemoApplication` class, the `Human` bean is retrieved from the Spring context, and its `canWin` method is called. This method invokes the `compile` method of the `Gorillas` class.
- In short,  The Human class is marked as a Spring component, and the Gorillas dependency is injected using @Autowired. When the application runs, the Human bean retrieves the Gorillas bean and calls its compile method.

## Code Example
### Main Application
```java
@SpringBootApplication
public class SpringBootDemoApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
        Human human = context.getBean(Human.class);
        human.canWin();
    }
}


@Component
public class Human {
    @Autowired
    private Gorillas gorillas;

    public void canWin() {
        gorillas.compile();
    }
}


@Component
public class Gorillas {
    public void compile() {
        System.out.println("100 human ain't no match for 1 gorilla");
    }
}
