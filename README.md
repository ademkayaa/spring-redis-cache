I used spring-boot, redis and docker. My aim in this project is to show the working logic of redis cache with a project.
Creating a redis docker image that is required first. To do this, you must have the docker desktop application installed on your computer.
If you have a docker desktop installed on your computer, run the following command via command prompt.

command: docker run -p 6379:6379 --name yourImageName -d redis

After running the command, a docker image with redis running will be created.
Then you will run the project. And open the chrome page. 

write to chrome bar "http://localhost:8090/test". 
and right click and click inspect. Then click on network in the window that open. 
Here you can see the response time for each get request. 
The first request takes 5 seconds, while other requests are answered in milliseconds. 
