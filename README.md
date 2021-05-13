<div align="center">

<!-- HEADER SECTION -->

<img src="assets/pokino_header.png" width="800px">

**Software project for Advanced Software Engineering :hammer: :construction_worker: course at 
<a href="https://uzh.ch/"><img src="assets/uzh_logo_no_text.png" width="15px"></a>**

---

<!-- LINKS SECTION -->
<p align="center">
  <a href="https://stevenschuerstedt.github.io/">Play it here</a> •
  <a href="#how-to-use">How To Use</a> •
  <a href="#how-to-use">Install Guide</a> •
  <a href="https://github.com/matthaeusheer/pokino/wiki">Docs</a> •
  <a href="#license">License</a>
</p>

<!-- BATCHES SECTION -->
[![travis](https://img.shields.io/travis/matthaeusheer/pokino?style=flat-square)](https://travis-ci.com/github/matthaeusheer/pokino)
[![codecov](https://img.shields.io/codecov/c/github/matthaeusheer/pokino?label=test%20coverage&style=flat-square&token=444585811d48493abd0d6c7efe228d2a)](https://app.codecov.io/gh/matthaeusheer/pokino/)
[![dockerhub](https://img.shields.io/badge/docker%20hub-registry-blue?style=flat-square)](https://hub.docker.com/repository/docker/matthaeusheer/pokino-game)

</div> <!-- centering -->

<p align="center">
  <img width="700" src="assets/game_play.gif">
</p>

# :video_game: How To Use
Go to https://stevenschuerstedt.github.io/ and start playing. The application is hosted for you with :heart: on
<a href="https://cloud.google.com/"><img src="assets/gcp.png" width="16px"></a>.

# :clipboard: Install Guide
This guide describes how to install the application for development purposes.

## Variant 1 :hugs: - Pull pre-built docker images and run locally
0) Make sure the [docker](https://docs.docker.com/) :whale: engine incl. docker-compose is installed on your system.
1) Pull the images from our public docker hub registry
   ```
   ...coming soon
   ```
2) Run the services
   ```
   docker-compose up
   ```

## Variant 2 :roll_eyes: - Build & run docker containers locally
0) Make sure the [docker](https://docs.docker.com/) :whale: engine incl. docker-compose is installed on your system.
1) Clone this repo:  
   ```
    git clone https://github.com/matthaeusheer/pokino.git
   ```
2) Build and run the services  
   ```
   docker-compose build  
   docker-compose up
   ```

## Variant 3 :dizzy_face: - Run everything locally outside of docker
**Not recommended!**  
_Disclaimer_: This requires manual setup and installation of numerous dependencies!  
0) Make sure to install all dependencies (java 11 sdk, angular, npm, ...)
1) Backend: Run services in your IDE or build the maven projects and run with the maven wrapper.
2) Frontend: Start the angular application.

# :cop: License
This project is distributed under the [MIT License](https://en.wikipedia.org/wiki/MIT_License). 
Please refer to our [license page](https://github.com/matthaeusheer/pokino/blob/main/LICENSE).

# :nerd_face: Contributors
:sunglasses: Matthäus Heer  
:stuck_out_tongue_winking_eye: Steven Schürstedt  
:innocent: Leo Rutschmann  