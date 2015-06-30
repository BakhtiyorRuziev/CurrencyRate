# CurrencyRate
WebService for Tajikistan somoni exchange rate.

To run the program you need to pass some steps

* Exchange rate can get with this application [NbtDownloadRate](https://github.com/BakhtiyorRuziev/NbtDownloadRate)
* Configure mongoDb:
    Change this string in *src/main/resources/context.xml*:
    
    ```xml
        
        <mongo:mongo host="127.0.0.1" port="27017"/>
        <mongo:db-factory dbname="rates2"/>

    ```
* gradlew install
* gradlew run

Application run in localhost:8080 address.
Date format: **YYYMMDD**


* Query for one date in JSON: http://127.0.0.1:8080/date/20121212.json
```json
    {
      "date": 20121211,
      "currencies":[{"code": "036", "charCode": "AUD", "rate": 5.0345,}...]
    }
```
* Query for one date in XML: http://127.0.0.1:8080/date/20121212.xml
```xml
  <rate>
    <currency>
        <charCode>AUD</charCode>
        <code>036</code>
        <rate>5.0345</rate>
    </currency>
  ...
  </rate>
```
