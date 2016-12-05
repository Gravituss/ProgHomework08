
Scenario: A scenario with some pending steps

Given chrome started
And proceed to http://www.weather-forecast.com
When type the <city>
Then open the first element in the list

Then quit driver

Examples:
|city|
|Toronto|
|Odessa|
|Washington D.C.|
|London|


