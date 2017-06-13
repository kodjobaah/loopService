
### Build Instructions ###
In order to build the application you will need to install gradle and java 8.

#### Running Test ####
**gradle test**
NOTE: You should have one test failure which is for endpoint which has not been implemented yet.

#### Start the service ####

Then in the application root directory type:

**gradle bootRepackage**


This will create a jar file.
Then to start the service type:

**java -jar build/libs/loop-service-0.1.0.jar**

### Testing the endpoints ###
Currently the only enpoint that has been implemented is the events end point:

**bin/get_events http://127.0.0.1:8080/events**

### Limitations ###
An assumption has been made that an external service determines whether an event
has been triggered and this services caches the event. 




