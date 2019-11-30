![](Logo/PNG/header.png)


# HeyFlyer

[![](https://jitpack.io/v/heyflyer/android-app-sdk.svg)](https://jitpack.io/#heyflyer/android-app-sdk)

## Usage

To run the example project, clone the repo, and run  first.

## Initialization

### Gradle


```
In your project’s build.gradle add the following line
```
```
    maven { url ‘https://jitpack.io’ }
```
```
And in your app’s build.gradle add the dependency
```
```
     implementation 'com.github.heyflyer:android-app-sdk:1.0.0'
```




### Maven

```
In your app’s build.gradle add the dependency
```
```
   	<dependency>
	    <groupId>com.github.heyflyer</groupId>
	    <artifactId>android-app-sdk</artifactId>
	    <version>1.0.0</version>
	</dependency>
```

## Usage

### Quick Start


````
In library Fetch all the Data from AirPortInformation.class file 

In AirPortInformation.class Multiple Function Available for Getting Data of Airport Information

For Registration In Json form call Below Function and Pass parameter cBusinessName,cCpName,cCpMobile,cCpEmail,cEmail,cPassword and OnSuccessJsonObjectResponse interface


	AirPortInformation.insertUserJson(MainActivity.this,cBusinessName,cCpName,cCpMobile,cCpEmail,cEmail,cPassword, new OnSuccessJsonObjectResponse() {
            @Override
            public void getSuccessJsonObjectResponse(boolean isSuccess, JSONObject jsonObject, String errorMsgSystem) {
                if(isSuccess)
                {
                    airportInfoJson = jsonObject;
                    Log.e("airportInfoJson",airportInfoJson.toString());
                }
                else if (errorMsgSystem.equals(ApiErrorUtils.SOMETHING_WENT_WRONG) || errorMsgSystem.equals(ApiErrorUtils.ERROR_NETWORK)) {
                    showToast(MainActivity.this, errorMsgSystem, 0);
                }
            }
        });


For Get Airport Information Data In Json form call Below Function and Pass parameter user_id,apikey and Airport code and OnSuccessJsonObjectResponse interface

	AirPortInformation.getAirportInformationJson(CopllageviewActivity.this,nApiUserId,cApiKey,cAirportCode, new OnSuccessJsonObjectResponse() {
            @Override
            public void getSuccessJsonObjectResponse(boolean isSuccess, JSONObject jsonObject, String errorMsgSystem) {
                if(isSuccess)
                {
                    JSONObject airportInfoJson = jsonObject;
                    Log.e("airportInfoJson",airportInfoJson.toString());
                }
                else if (errorMsgSystem.equals(ApiErrorUtils.SOMETHING_WENT_WRONG) || errorMsgSystem.equals(ApiErrorUtils.ERROR_NETWORK)) {
                    showToast(CopllageviewActivity.this, errorMsgSystem, 0);
                }
            }
        });

	
For Get Airport Information Data In String form call Below Function and Pass parameter nApiUserId ,cApiKey and cAirportCode and OnSuccessStringResponse interface


	AirPortInformation.getAirportInformationString(MainActivity.this,nApiUserId,cApiKey,cAirportCode, new OnSuccessStringResponse() {
            @Override
            public void getSuccessStringResponse(boolean isSuccess, String stringJson, String errorMsgSystem) {
                if(isSuccess)
                {
                    String airportInfoStr = stringJson;
                    Log.e("airportInfoStr",airportInfoStr.toString());
                }
                else if (errorMsgSystem.equals(ApiErrorUtils.SOMETHING_WENT_WRONG) || errorMsgSystem.equals(ApiErrorUtils.ERROR_NETWORK)) {
                    showToast(MainActivity.this, errorMsgSystem, 0);
                }
            }
        });


For Get Departure Flight Information Data In Json form call Below Function and Pass parameter user_id,apikey and Airport code and OnSuccessJsonObjectResponse interface


  	AirPortInformation.getDepartureTimeTableAirportDataUsingCodeJson(MainActivity.this,nApiUserId,cApiKey,cAirportCode, new OnSuccessJsonObjectResponse() {
            @Override
            public void getSuccessJsonObjectResponse(boolean isSuccess, JSONObject jsonObject, String errorMsgSystem) {
                if(isSuccess)
                {
                    JSONObject airportInfoJson = jsonObject;
                    tvapiResponse.setText(airportInfoJson.toString());
                    Log.e("DeparturairportInfoJson",airportInfoJson.toString());
                }
                else if (errorMsgSystem.equals(ApiErrorUtils.SOMETHING_WENT_WRONG) || errorMsgSystem.equals(ApiErrorUtils.ERROR_NETWORK)) {
                    showToast(MainActivity.this, errorMsgSystem, 0);
                }
            }
        });



For Get Arrival Flight Information Data In Json form call Below Function and Pass parameter user_id,apikey and Airport code and OnSuccessJsonObjectResponse interface


	AirPortInformation.getArrivalTimeTableAirportDataUsingCodeJson(MainActivity.this,nApiUserId,cApiKey,cAirportCode, new OnSuccessJsonObjectResponse() {
            @Override
            public void getSuccessJsonObjectResponse(boolean isSuccess, JSONObject jsonObject, String errorMsgSystem) {
                if(isSuccess)
                {
                    JSONObject airportInfoJson = jsonObject;
                    Log.e("arrivalairportInfoJson",airportInfoJson.toString());
                }
                else if (errorMsgSystem.equals(ApiErrorUtils.SOMETHING_WENT_WRONG) || errorMsgSystem.equals(ApiErrorUtils.ERROR_NETWORK)) {
                    showToast(MainActivity.this, errorMsgSystem, 0);
                }
            }
        });
````

## Author

HeyFlyer, mandip.kanjiya@heyflyer.com

## License

HeyFlyerAirportData is available under the MIT license. See the LICENSE file for more info.
