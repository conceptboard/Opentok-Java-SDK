
/*!
* OpenTok Java Library
* http://www.tokbox.com/
*
* Copyright 2010, TokBox, Inc.
*
*/
package com.opentok.api;

public class API_Config {
    public static final String STAGING_URL = "http://staging.tokbox.com/hl";
    public static final String PRODUCTION_URL = "https://api.opentok.com/hl";

    final int api_key;
    final String api_secret;
    final String api_url;

    API_Config(int api_key, String api_secret, String api_url){
        this.api_key = api_key;
        this.api_secret = api_secret.trim();
        this.api_url = api_url;
    }
}

