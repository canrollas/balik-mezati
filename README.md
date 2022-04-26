# Fish Auction Project Technology Electing Process
## Note that this project is demonstration for individuals full version.
### Abstract

Technology usage covers many critical areas like software design. Electing the best compatible technologies with
efficiency can make replaceable,manageable software development proc.This article covers the basic knowledge of
technology used in this project and Literature review of technologies.

##### Table of Contents

1. [Docker Container System](###example2)
2. [Java Spring Boot](#example2)
3. [MongoDB NoSQL structure](#third-example)
4. [HTML5 Markup Language](#example2)
5. [CSS Style Sheet Language](#example2)
6. [Javascript / frameworks](#example2)
7. [Bootstrap framework](#example2)
8. [SSH](#example2)
9. [Git VCS](#example2)

### 1) Docker Microservices-Container system

#### What is docker on [docks.docker.com](docks.docker.com):

```
Docker is an open platform for developing, shipping, and running applications. Docker enables you to separate your
applications from your infrastructure so you can deliver software quickly. With Docker, you can manage your
infrastructure in the same ways you manage your applications. By taking advantage of Docker’s methodologies for
shipping, testing, and deploying code quickly, you can significantly reduce the delay between writing code and running
it in production .
```

[Citation [1]](docks.docker.com)

#### Why Docker? :

<p>According to documentation of docker virtualization of software makes independent dependencies via machine and
  communicating between containers is quiet effortless.
Furthermore, docker includes many prepared packages like MongoDB,Python ... etc., which can be cloned from docker repository hub as
  docker image. However, developing a software is critical with independent computers.</p>
 <br>

#### How to implement Docker?:

- Generally linux based kernel system uses those commands.
- If Windows or MacOS operating system available on computer, [Docker install](https://docs.docker.com/get-docker/) page
  will be useful for executable installation file.

```shell
 $ sudo apt-get update
 $ sudo apt-get install docker-ce docker-ce-cli containerd.io
```

##### Docker Architecture

![](https://docs.docker.com/engine/images/architecture.svg)

### 2) Java Spring

#### What is Java Spring framework?

- Generally, web framework uses various libraries, and it implements many features for backend rendering, performs
  general behaviours and their responses.

- Spring is a web framework, it's a Python module that lets you develop web applications easily. It's has a small and
  easy-to-extend core: it's a microframework that doesn't include an ORM (Object Relational Manager) or such features.
  It does have many cool features like url routing, template engine.Moreover and finally, it includes jinja render
  language which makes dynamic data performing on html
  files..

#### Why Java-Spring framework?

- Java programming language is easy to implement.
- Java spring framework is understandable.
- Object-oriented manner can be implemented.
- Active communities and quick debugging.

#### How to implement Java Spring framework?

- go to spring initializer web page 




### 3) mongoDB NoSQL Database

#### What is mongoDB?

- MongoDB is json based free structure/Database system
- NoSQL structure provided from its engine.
- MongoDB stores data in flexible, JSON-like documents, meaning fields can vary from document to document and data
  structure can be changed over time [Citation [3]](www.mongodb.com)

#### Why mongoDB ?

- It can provide various benefits to the software developing team.
- mongoDB has become pioneer databases in many companies with document based structure.
- NoSQL included which is a powerful way because it includes document-oriented databases like MongoDB, columnar
  databases, in-memory databases, and more.
- It is free for every user.
- Based on json files which is important because many internet applications communicate with jsons (jsons are encyripted
  according to cybersecurity standards in this project and JWT also will be implemented.).

#### How to implement mongoDB ?

- Basically mongoDB can be downloaded from website via binary/executable files .
- [Download link](https://docs.mongodb.com/guides/server/install/)

### 4) HTML5 Markup Language

#### What is html ?

- HTML, or HyperText Markup Language, allows web users to create and structure sections, paragraphs, and links using
  elements, tags, and attributes. However, it’s worth noting that HTML is not considered a programming language as it
  can’t create dynamic functionality.
- It’s also worth noting that HTML is now considered an official web standard. The World Wide Web Consortium (W3C)
  maintains and develops HTML specifications, along with providing regular updates.

#### Why html ?

- Sir Timothy John Berners-Lee invented modern internet which is WWW as every individual know.
- Berners invented also markup language which is html, and it is standard for W3C organization.
- Great majority of web applications, pages (% 99.9) uses html for standards.

### 5) CSS Style Sheet

#### What is css?

- Cascading Style Sheets (CSS) is a style sheet language used for describing the presentation of a document written in a
  markup language such as HTML. CSS is a cornerstone technology of the World Wide Web, alongside HTML and
  JavaScript.[ Citation [4]](wikipedia.org)

#### Why css?

- CSS is used to define styles for web pages, including the design, layout and variations in display can be change.

### 6) Javascript / frameworks

#### What is javascript?

- JavaScript, often abbreviated JS, is a programming language that is one of the core technologies of the World Wide
  Web, alongside HTML and CSS. Over 97% of websites use JavaScript on the client side for web page behavior, often
  incorporating third-party libraries. All major web browsers have a dedicated JavaScript engine to execute the code on
  users' devices.[ citation [5]](wikipedia.org)

#### Why javascript?

- On many models with progress of technology, web applications required browser based dynamic models.
- Using javascript will bring new dynamic manner to application development.

### 7) Bootstrap framework

#### What is bootstrap?

- Bootstrap is a CSS Framework for developing responsive applications and mobile-first websites.
- It includes many embedded classes for developing an application.

#### Why bootstrap?

- Technology provide different sized device to individuals. That means it has to be responsive/compatible to every
  device.
- It is ready , packaged for uses and free.
- Bootstrap uses basic grid system for web development.
  <br>

#### How to implement?

- Those lines in your html ,make bootstrap live.

```html
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css"
      integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>
```

###### Bootstrap Grid System visualized:

![](https://www.bitdegree.org/learn/storage/media/images/bootstrap-grid-system.o.png)

### 8) SSH Technology

#### What is ssh?

- SSH, also known as Secure Shell , is a network protocol that gives users a secure way to access a computer over an
  unsecured network.

#### Why ssh?

- SSH technology generally for remote controlling and testing the server. In this web application , tests and deployment
  can be implemented in remote server.
- With ssh technology no one can access the remote machine who does not have the key.
- Cyber resilience of the system is the most important thing for any kind of bad situation.

#### How to generate ssh key in computer ?

```shell
$ ssh-keygen -t rsa -b 4096 -C "your_email@example.com" //it is for creation ssh
$ ssh canrollas@987.684.9.8 // Connection to the remote host
```

### 9) Git VCS

#### What is Git Version Control System?

- Git is a free and open source distributed version control system designed to handle everything from small to very
  large projects with speed and efficiency.

#### Why Git?

- Working with big devops team is exhaustive for collaboration and complicated when assignments collected in main project.
- It is the best way to use version control system for everyone in this project.

#### How to use git?
- Details of the git clone links will be give to every member.
