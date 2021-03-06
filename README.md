<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Thanks again! Now go create something AMAZING! :D
-->

<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/Number0000/Best-README-Template">
    <img src="images/logo.png" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">LibraryManagement_1.0.1</h3>
  <p align="center">
    An awesome README template to jumpstart your projects!
    <br />
    <a href="https://github.com/Number0000/Best-README-Template"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/Number0000/Best-README-Template">View Demo</a>
    ·
    <a href="https://github.com/Number0000/Best-README-Template/issues">Report Bug</a>
    ·
    <a href="https://github.com/Number0000/Best-README-Template/issues">Request Feature</a>
  </p>
</p>

<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Pre-prerequisites</a></li>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgements">Acknowledgements</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->

## About The Project

<br>
  <p align="center">
    <a href="https://github.com/Number0000/Best-README-Template">
      <img src="images/mvn-run.gif" alt="Logo" width="640" height="640">
    </a>
  </p>
<br>

This is a demostration for me to know if I understand monolithics services, Spring, Maven, MySql, and some other dependency that I used here.:smile:

Of course, there are going to be similar project out there in the world, however, I just want to make sure I truely understand Java as a microservices. This is not a restful API attempt as I did them in a seperate repo with a different flavor. Feel free to check them out here.

- [LMSApiGateway](https://github.com/Number0000/LMSApiGateway)
  - This project is about using API, however this is the first vers of library management system that I had.
- [EurekaWithRestGateway](https://github.com/Number0000/EurekaWithRestGateway)
  - This project is using Eureka as a host for microservices for Java. And this is much closer to a real world application.

I have use an extensive amount of resources that I can find online alongside with them, including stackOverflow and couple other website. Jus want to acknowledge them and their effort.

### Built With

This section should list any major frameworks that you built your project using. Leave any add-ons/plugins for the acknowledgements section. Here are a few examples.

- [Spring](https://start.spring.io/)
- [Maven](https://mvnrepository.com/)
- [Java 1.8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
- [MySql](https://www.mysql.com/)

<!-- GETTING STARTED -->

## Getting Started

This is an example of how you may want to do to on setting up your project locally.
To get a local copy up and running follow these simple example steps.

### Pre-prerequisites

Here is an example of simple Maven project build on a website as a starter. Please do not jump ahead if you don't know where to start or run the project, as you may confused yourself. :fire:

### Prerequisites if you want to customize them, if not proceed to Installation

This is an example of how to list things you need to use the software and how to install them.

- run the [spring initilizer](https://start.spring.io/) and go ahead with downloading the project

### Installation

1. Start with MySql community ver [https://dev.mysql.com/downloads/](https://dev.mysql.com/downloads/)
2. Build the following ER Diagram
<br>
  <p align="center">
    <a href="https://github.com/Number0000/Best-README-Template">
      <img src="images/ER-Diagram.png" alt="Logo" width="540" height="540">
    </a>
  </p>
<br>
<br>
  <p align="center">
    <a href="https://github.com/Number0000/Best-README-Template">
      <img src="images/Database-screenshot.png" alt="Logo" width="540" height="540">
    </a>
  </p>
<br>

- Please bear in mind that the mysql is build on older mysql. It might not have work.

3. Clone the repo
   ```sh
   git clone https://github.com/your_username_/Project-Name.git
   ```
4. Start building the MySQL based on the information provided in the project
5. Open cmd, and `cd` to your project directory, I
6. Install a clean version of maven project
   ```sh
   mvn clean build
   ```
7. Run the server on port 3306 or whatever port you host your mySql
   ```sh
   mvn spring-boot:run
   ```
8. You should eventually turn to port 3306 on chrome to see what was hosted, and that's it. Remember this is not a rest API, is a monolithic version of the library.

<!-- USAGE EXAMPLES -->

## Usage

Use this space to show useful examples of how a project can be used. Additional screenshots, code examples and demos work well in this space. You may also link to more resources.

_For more examples, please refer to the [Documentation](https://example.com)_

<!-- ROADMAP -->

## Roadmap

See the [open issues](https://github.com/Number0000/LibraryManagement_1.0.1/issues) for a list of proposed features (and known issues).

<!-- CONTRIBUTING -->

## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<!-- LICENSE -->

## License

Distributed under the MIT License. See [`LICENSE`](https://github.com/Number0000/LibraryManagement_1.0.1/blob/master/LICENSE.txt) for more information.

<!-- CONTACT -->

## Contact

Your Name - harryhaw94@gmail.com

Project Link: [https://github.com/Number0000/LibraryManagement_1.0.1](https://github.com/Number0000/LibraryManagement_1.0.1)

<!-- ACKNOWLEDGEMENTS -->

## Acknowledgements

- [GitHub Emoji Cheat Sheet](https://www.webpagefx.com/tools/emoji-cheat-sheet)
- [Dependency on running exec java](https://mvnrepository.com/artifact/org.codehaus.mojo/exec-maven-plugin/3.0.0)
- [Choose an Open Source License](https://choosealicense.com)
- [GitHub Pages](https://pages.github.com)
- [Original Template for ReadMe](https://github.com/othneildrew/Best-README-Template)
- many many others that I completely used and forgot over the past couple years. Thank you, geeks. Because of your pioneer contribution, the world is more open.

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->

[contributors-shield]: https://img.shields.io/github/contributors/Number0000/LibraryManagement_1.0.1.svg?style=for-the-badge
[contributors-url]: https://github.com/Number0000/LibraryManagement_1.0.1/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/Number0000/LibraryManagement_1.0.1.svg?style=for-the-badge
[forks-url]: https://github.com/Number0000/LibraryManagement_1.0.1/network/members
[stars-shield]: https://img.shields.io/github/stars/Number0000/LibraryManagement_1.0.1.svg?style=for-the-badge
[stars-url]: https://github.com/Number0000/LibraryManagement_1.0.1/stargazers
[issues-shield]: https://img.shields.io/github/issues/Number0000/LibraryManagement_1.0.1.svg?style=for-the-badge
[issues-url]: https://github.com/Number0000/LibraryManagement_1.0.1/issues
[license-shield]: https://img.shields.io/github/license/Number0000/LibraryManagement_1.0.1.svg?style=for-the-badge
[license-url]: https://github.com/Number0000/LibraryManagement_1.0.1/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/harry-chang-bb8b94aa/
[product-screenshot]: images/screenshot.png
