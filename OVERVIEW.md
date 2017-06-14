### Build Instructions ###
In order to build the application you will need to install [a gradle](https://gradle.org/) and java 8.

The file **doEverthing.sh** runs the test..builds the application..and starts the application..

Below are the steps itemized.

#### Running Test ####
**gradle test**
NOTE: You should have one test failure which is for endpoint which has not been implemented yet.
 
To view the test results: Type the following:

**open build/reports/tests/test/index.html**

#### Start the service ####

Then in the application root directory type:

**gradle bootRepackage**


This will create a jar file.
Then to start the service type:

**java -jar build/libs/loop-service-0.1.0.jar**

### Testing the endpoints ###
Currently the only enpoint that has been implemented is the events end point:

**bin/get_events http://127.0.0.1:8080/events**

**/bin/submit_lots_of_apps***

### Limitations ###
An assumption has been made that an external service determines whether an event
has been triggered and this services caches the event. 

### Assumptions ###
In order to determine an increase in high risk, the following attribute will be used:


| item  | Second Header |
| ------------- | ------------- |
| deling_2yr  | The number of 30+ days past-due incidences of delinquency in the borrower's credit file for the past 2 years  |

If 20% of the data received in the batch have a value greater than 10 the an **INCREASE_HIGH_RISK** event will be raised.

Please refer to the architecture document of how this will be deployed in production.

[a ArchitectureDocuemnt](https://github.com/kodjobaah/loopService/blob/master/LoopServiceArchitecture.pdf)
