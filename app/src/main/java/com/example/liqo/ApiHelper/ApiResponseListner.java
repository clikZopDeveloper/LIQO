package com.example.liqo.ApiHelper;

import com.google.gson.JsonElement;

public interface ApiResponseListner {

    public void success(String tag, JsonElement jsonElement);
    public void failure(String tag, String errorMessage);
}
