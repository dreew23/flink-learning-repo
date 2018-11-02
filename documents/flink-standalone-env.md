#### How to install standalone on your mac 
* install brew (default install the latest version)

* execute brew install command 
```
brew install apache-flink
```
* checkout your flink version 
```
flink --version  
```
* setup your standalone flink 
``` 
cd /usr/local/Cellar/apache-flink/1.6.2/libexec
sh start-cluster.sh
```
* visit your flink web-ui by [link](http://localhost:8081/#/overview)
