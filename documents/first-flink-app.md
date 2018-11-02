#### Compile your first flink word-count application on mac 

* clone code to local && compile && execute 

``` 
git clone https://github.com/Kylin1027/flink-learning-repo.git 
cd flink-learning-repo && mvn clean install 
cd target/ 
flink run -c com.aimer.flink.demo.WordCountSQL learn-flink-1.0-SNAPSHOT-jar-with-dependencies.jar
```
* if everything goes right output 

```
Starting execution of program
WC(Aimer,2)
WC(Kokia,1)
WC(Taka,1)
WC(inuyasha,1)
Program execution finished
Job with JobID b3a215fdcad9532a809f4142efd4832c has finished.
Job Runtime: 2150 ms
Accumulator Results:
- ba3cee12a8d8104d60193d4e379e90da (java.util.ArrayList) [4 elements]
```
