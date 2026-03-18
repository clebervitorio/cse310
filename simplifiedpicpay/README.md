# PicPay Backend Challenge

First, I'd like to explain what this PicPay Backend Challenge is. PicPay is a payment platform. The interesting thing about this challenge isn't limited to a single programming language; the company uses the challenge process to understand how developers comprehend certain aspects of object-oriented programming at Junior, Mid-level, and Senior levels, in any language.

Since I'm learning Java, we'll be using Java with Spring. Below are some useful materials in Java, as well as other information. Some documentation was suggested by the challenge, and others I used to understand what I'll be doing.

# Simplified PicPay Project Requirements with important business rules for the operation of the Simplified PicPay:

1) For both types of users, we need the Full Name, Document, email, and Password. The Document and emails must be unique in the system. Therefore, the system should only allow one registration with the same document or email address;
2) Users can send money (make transfers) to merchants and to each other;
3) Merchants only receive transfers, they do not send money to anyone;
4) Validate that the user has sufficient funds before the transfer;
5) Before finalizing the transfer, an external authorization service must be consulted. Use this mock https://util.devi.tools/api/v2/authorize to simulate the service using the GET verb;
6) The transfer operation must be a transaction (i.e., rolled back in case of inconsistency) and the money must return to the sender's wallet;
7) Upon receiving the payment, the user or merchant needs to receive a notification (email, SMS) sent by a third-party service, and this service may be unavailable/unstable. Use this mock https://util.devi.tools/api/v1/notify to simulate sending the notification using the POST verb;
8) This service must be RESTful.

# Transfer Endpoint

You can implement whatever you find most convenient, but we will focus only on the transfer flow between two users. The implementation must follow the contract below.

POST /transfer
Content-Type: application/json

{"value": 100.0,
"sender": 4,
"receiver": 15
}

# Useful materials
### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/4.0.3/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/4.0.3/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/4.0.3/reference/web/servlet.html)
* [Spring Data JPA](https://docs.spring.io/spring-boot/4.0.3/reference/data/sql.html#data.sql.jpa-and-spring-data)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/4.0.3/reference/using/devtools.html)

### Guides
The following guides illustrate how to use some features concretely:

* [github.com](https://github.com/microsoft/vscode-java-dependency#manage-dependencies)
* [oracle.com](https://www.oracle.com/java/technologies/downloads/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

