# Shipment Tracker
A sample Shipment Tracking application demonstrating the usage of Generative AI in Java based applications.

It consist of 3 modules

* shipment-tracker-ui
* shipment-tracker-app
* shipment-status-app

# shipment-tracker-ui

A basic react SPA with a chatbox window. This application provides interfaces for users to ask queries regarding their shipment.

### How to run?
**This will require node installed on your machine**
```
npm start
```
# shipment-tracker-app

A spring boot REST api, which exposes a single endpoint which is called from the UI application. This application will take the user queries and will call the LLM. This will also interact with external Shipment Status API.

### How to run?
**This will require a docker runtime on your machine.**
1. go to project root directory on the command line and run the following command
    ```
    docker build -t shipment-tracker-app .
    ```
2. Run the folowing command. 
    ```
    docker run -p 8080:8080 shipment-tracker-app
    ```

# shipment-status-app

A spring boot REST api, which exposes a single endpoint. This api will act as a external api which will provides dummy shipment information. This api will be used by chatbot in the function calling use-case.

### How to run?
**This will require a docker runtime on your machine.**
1. go to project root directory on the command line and run the following command
    ```
    docker build -t shipment-status-app .
    ```
2. Run the folowing command. 
    ```
    docker run -p 8081:8081 shipment-status-app
    ```
