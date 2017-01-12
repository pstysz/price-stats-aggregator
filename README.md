# Price stats aggregator for Allegro auctions

Simple demo app, written in Java / Scala / Spring / MongoDB, to collect data about car prices, aggregate them and show statistics:
- Min price
- Max price
- Avg price
- Median price

...in selected time intervals.

---------------------------------------------------------------------------

# Api documentation
Documentation has been generated in swagger and is available on [api-doc](http://89.78.63.141/swagger-ui.html) page.

# Demo application
Demo app is avaiable under [demo-api](http://89.78.63.141/api) url. Credetials for test user:
name: test
pass: test

# Installation

Requirements:
+ Java SDK 1.8+
+ Scala 2.11.7+
+ MongoDb 3.4.0+

Local application runs on port 5000 (rest-api) and 6000 (scheduler). Mongo database uses standard 27017 port. To change db settings go to common project -> resources.
There is also sensitive.properties file, which isn’t pushed to repository. You need to create it in common/resources and fill with your values:

```sh
-#sensitive data NOT stored on git
allegro.user=(your allegro user)
allegro.password=(your allegro password)
db.testuser.name=(test user name)
db.testuser.pass=(test user pass)
db.swagger.name=(swagger user name)
db.swagger.pass=(swagger user pass)
db.scheduler.name=(scheduler user name)
db.scheduler.pass=(scheduler user pass)
```

# Example usage

Firstly user has to log in to get unique authorization-key. 
Example request content:
```sh
POST http://89.78.63.141/api/account/login HTTP/1.1
Content-Type: text/json
User-Agent: Fiddler
Host: localhost:5000
Content-Length: 57

{
"userName":"test name",
"password":"test_password"
}
```

Every request except login, has to contain authorization key in header:
```sh
x-authorization-key: fwe4f34qfqfq34fqf
```

Next step should be selection of category to filter by. Currently api handle only car categories. To get list of all avaiable categories, with their id, call */api/filter/categories*

```sh
GET http://89.78.63.141/api/filter/categories HTTP/1.1
Content-Type: text/json
User-Agent: Fiddler
Host: localhost:8889
x-authorization-key: f03n0i4ufn304un
Accept: application/json
```

Every category has unique ID. Passing ID to */api/filter/categories/{categoryId}* generates all available filter for this category.
Base on recieved filters list, it is possible to compose query, to filter auctions. Let's assume, that we want to find all Fiat Punto's, with max price = 13000zl, year of production between 2005 and 2007, at least 1350ccm engine capacity, for petrol fuel, undamaged. To test filters, and get all filtered auctions, use */api/filter/* POST method:

```sh
POST http://89.78.63.141/api/filter/ HTTP/1.1
Content-Type: application/json
User-Agent: Fiddler
Host: localhost:8889
x-authorization-key: f03n0i4ufn304un
Accept: application/json
Content-Length: 362

[
  {
    "id": "category"
    ,"values": ["83726"]
  }
  ,{
    "id": "price"
    ,"rangeMaxValue": "13000"
  }
  ,{
    "id": "1"
    ,"rangeMinValue": "2005"
    ,"rangeMaxValue": "2007"
  }
  ,{
    "id": "5"
    ,"rangeMinValue": "1350"
  }
   ,{
    "id": "16" //petrol fuel
    ,"values": ["1"]
  }
   ,{
    "id": "178" //undamaged
    ,"values": ["1"]
  }
]
```

To save tested query on db use request body in */api/query/* POST method. 

# Calculating stats

Every hour, day, month and year scheduler will request data from Allegro, base on stored user-filters, and calculate statistic data. To calculate values, applicatione uses mongo map reduce and aggregation framework.

# Getting stats

To get calculated stats, use */api/stats/* endpoint. All requests descriptions are available on [api-doc](http://89.78.63.141/swagger-ui.html) page.

# License 

[MIT](https://opensource.org/licenses/MIT)
