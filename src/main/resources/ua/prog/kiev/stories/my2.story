
Scenario: A scenario with some pending steps

Given chrome started
And proceed to http://www.weather-forecast.com
When type the <city>
Then open the first element in the list
And ensure the <city> is correct
Then click centigrade button
And print temperatures
Then click farenheit button
And print temperatures
Then quit driver

Examples:
|city|
|Toronto|
|Odessa|
|Washington D.C.|
|London|
