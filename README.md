Spring MVC Basic App
====================
This is an example for a very basic Spring MVC application, it is a working project for a 
typical MVC application. Its purpose is to be used as a base for new projects.

To use it run the SQL scripts in your database, the scripts provided run in postgresql, adapt them
to suit your needs. You have to setup the database connection in the file jdbc.properties.

After these steps, just run maven: mvn -DskipTests clean install and deploy the application. I've
tested it with Tomcat 8.

Things in my TODO list:
Fix and finish the tests.
Add log configuration.
Add security.
Add a simple form.

This project has been heavily based upon this tutorial:
http://www.uv.es/grimo/teaching/SpringMVCv3PasoAPaso/part1.html
