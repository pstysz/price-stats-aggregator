# Price stats aggregator for Allegro auctions (in development)

Simple demo app, written in Java / Spring / MongoDB / Hadoop, to collect data about car prices, aggregate them and show statistics:
- Min price
- Max price
- Avg price
- Median price

...in selected time interval.

---------------------------------------------------------------------------

# Api documentation (not deployed yet)
Documentation has been generated in swagger and is available on [api-doc](http://deployed-api-url.com/swagger-ui.html) page.

# Demo application (not deployed yet)
Demo app is avaiable under [demo-api](http://deployed-api-url.com/api) url. Credetials for test user:
name: test
pass: test

# Installation

(here goes intall notes)

# Example usage

Firstly user has to log in to get unique authorization-key. 
Example request content:
```sh
POST http://localhost:8889/api/account/login HTTP/1.1
Content-Type: text/json
User-Agent: Fiddler
Host: localhost:8889
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
GET http://localhost:8889/api/filter/categories HTTP/1.1
Content-Type: text/json
User-Agent: Fiddler
Host: localhost:8889
x-authorization-key: f03n0i4ufn304un
Accept: application/json
```

Every category has unique ID. Passing ID to */api/filter/categories/{categoryId}* generates all available filter for this category.
Base on recieved filters list, it is possible to compose query, to filter auctions. Let's assume, that we want to find all Fiat Punto's, with max price = 13000zl, year of production between 2005 and 2007, at least 1350ccm engine capacity, for petrol fuel, undamaged. To test filters, and get all filtered auctions, use */api/filter/* POST method:

```sh
POST http://localhost:8889/api/filter/ HTTP/1.1
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

# Calculating stats (not implemented yet)

Every hour scheduler will request data from Allegro, base on stored user-filters, and calculate statistic data.

# Getting stats (not implemented yet)

To get calculated stats, use */api/stats/* endpoint.

# License 

[MIT](https://opensource.org/licenses/MIT)
