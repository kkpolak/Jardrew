How to start using this app:
     1. connect your mysql: mysql -u root -p (usually)
     2. run script: jardrew/dbScripts/jardrewSQLscript_start_example.sql
     3. run spring-boot app: JardrewApplication
     4. examples of endpoints: 
          • localhost:8080/front/fronts
          • localhost:8080/front/addFront
          • localhost:8080/front/addFronts
          • localhost:8080/front/frontById/{id}
          • localhost:8080/front/{material}
          • localhost:8080/front/update
          • localhost:8080/front/delete/{id}

Application description:
The application is the initial prototype of a resource controlling website in a manufacturing company.

Application support:
The application is supported by using the appropriate endpoint. Endpoints will be supported from the frontend side in the future. For using the application at the moment, you have to manually use individual endpoints.


Main and general functionalities of the application:
     • handling of the warehouse database
     • element database support
     • handling of sales documentation - invoice generation system

Design patterns:

1. Facade – REST controller supporting endpoints used to handle data from the database uses the frontService interface methods. It unifies access to service methods.
2. Dependency injection.
3. MVC – structure creating three levels which support product elements: model - models of product elements, view - checking various elements in the browser (so far only in the form of json display), controller - checking elements in the database.
4. Builder – building individual elements of the product.
5. Singleton – database connection instance.
6. Observer – after updating the database of materials, their quantity, demand and other data, it determines the stock level, depending on the shortages or excesses of individual elements or ready-made bed elements, it determines the stock level/feature.
7. Template method – Facture saver: sgenerating and saving invoices depending on the required extension/feature.
8. Decorator – creating invoices, composing them depending on the demand for given details, such as: data, logo and other additions.
9. Strategy – state status changing, based on the analysis of recent database operations.
10. Factory – a bed factory, uses builders of individual elements and finally produces a whole bed with cross-sectional data of each element.
