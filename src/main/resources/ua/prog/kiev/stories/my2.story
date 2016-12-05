
Scenario: A scenario with some pending steps

Given firefox started
And proceed to http://amazon.com
!--When search for <request>
!--Then search results size more than 1
Then quit driver

Examples:
|request|
|MacBook|
|Sony|


