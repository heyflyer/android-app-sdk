package com.heyflyer.heyflyersdk.handler_interface;

import android.util.Log;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.heyflyer.heyflyersdk.rest_api.ApiErrorUtils;


import org.json.JSONObject;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApiHandler {

    public void request(Call<ResponseBody> listCall, final OnResponse onResponse) {

        listCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    onResponse.getResponse(true, response, null, null);
                } else {
                    try {
                        JSONObject jObjError = new JSONObject(response.errorBody().string());
                        Log.d("ERROR", jObjError + "");
                        onResponse.getResponse(false, null, jObjError, "");
                    } catch (Exception e) {

                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                onResponse.getResponse(false, null, null, ApiErrorUtils.getErrorMsg(t));
            }
        });

    }


    public void requestJson(Call<JsonArray> listCall, final OnJsonResponse onResponse) {

        listCall.enqueue(new Callback<JsonArray>() {
            @Override
            public void onResponse(Call<JsonArray> call, Response<JsonArray> response) {
                JsonArray mJsonArray = response.body();
                onResponse.getJsonResponse(true, mJsonArray, null);
            }

            @Override
            public void onFailure(Call<JsonArray> call, Throwable t) {
                onResponse.getJsonResponse(false, null, ApiErrorUtils.getErrorMsg(t));
            }
        });

    }
    public void requestJsonObject(Call<JsonObject> listCall, final OnJsonObjectResponse onResponse) {

        listCall.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                JsonObject mJsonArray = response.body();
                onResponse.getJsonObjectResponse(true, mJsonArray, null);
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                onResponse.getJsonObjectResponse(false, null, ApiErrorUtils.getErrorMsg(t));
            }
        });

    }
}
