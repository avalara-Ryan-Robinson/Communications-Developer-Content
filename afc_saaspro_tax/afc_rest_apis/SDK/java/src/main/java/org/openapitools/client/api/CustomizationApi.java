/*
 * SaasPro
 * APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.SetTaxCalculationSettingRequest;
import org.openapitools.client.model.TaxCalculationSettingTypes;
import org.openapitools.client.model.TaxCalculationSettingsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomizationApi {
    private ApiClient localVarApiClient;

    public CustomizationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CustomizationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for apiV2ProfilesGetProfilesGet
     * @param requestedClientId Client id associated with profile(s) to be fetched  Null value will use client id submitting the request or default client id as applicable. (optional)
     * @param requestedProfileId Configuration profile id to be fetched  Use 0 to indicate all profiles  Null value will use profile id from request or 0 if not set. (optional)
     * @param itemType Item Type  Examples:    Configuration, Bundle, Exclusion, Override, All (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProfilesGetProfilesGetCall(Integer requestedClientId, Integer requestedProfileId, TaxCalculationSettingTypes itemType, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v2/profiles/GetProfiles";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (requestedClientId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("RequestedClientId", requestedClientId));
        }

        if (requestedProfileId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("RequestedProfileId", requestedProfileId));
        }

        if (itemType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ItemType", itemType));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Basic" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2ProfilesGetProfilesGetValidateBeforeCall(Integer requestedClientId, Integer requestedProfileId, TaxCalculationSettingTypes itemType, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = apiV2ProfilesGetProfilesGetCall(requestedClientId, requestedProfileId, itemType, _callback);
        return localVarCall;

    }

    /**
     * Retrieves one or more profiles with associated settings and configurable items
     * 
     * @param requestedClientId Client id associated with profile(s) to be fetched  Null value will use client id submitting the request or default client id as applicable. (optional)
     * @param requestedProfileId Configuration profile id to be fetched  Use 0 to indicate all profiles  Null value will use profile id from request or 0 if not set. (optional)
     * @param itemType Item Type  Examples:    Configuration, Bundle, Exclusion, Override, All (optional)
     * @return TaxCalculationSettingsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public TaxCalculationSettingsResponse apiV2ProfilesGetProfilesGet(Integer requestedClientId, Integer requestedProfileId, TaxCalculationSettingTypes itemType) throws ApiException {
        ApiResponse<TaxCalculationSettingsResponse> localVarResp = apiV2ProfilesGetProfilesGetWithHttpInfo(requestedClientId, requestedProfileId, itemType);
        return localVarResp.getData();
    }

    /**
     * Retrieves one or more profiles with associated settings and configurable items
     * 
     * @param requestedClientId Client id associated with profile(s) to be fetched  Null value will use client id submitting the request or default client id as applicable. (optional)
     * @param requestedProfileId Configuration profile id to be fetched  Use 0 to indicate all profiles  Null value will use profile id from request or 0 if not set. (optional)
     * @param itemType Item Type  Examples:    Configuration, Bundle, Exclusion, Override, All (optional)
     * @return ApiResponse&lt;TaxCalculationSettingsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TaxCalculationSettingsResponse> apiV2ProfilesGetProfilesGetWithHttpInfo(Integer requestedClientId, Integer requestedProfileId, TaxCalculationSettingTypes itemType) throws ApiException {
        okhttp3.Call localVarCall = apiV2ProfilesGetProfilesGetValidateBeforeCall(requestedClientId, requestedProfileId, itemType, null);
        Type localVarReturnType = new TypeToken<TaxCalculationSettingsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieves one or more profiles with associated settings and configurable items (asynchronously)
     * 
     * @param requestedClientId Client id associated with profile(s) to be fetched  Null value will use client id submitting the request or default client id as applicable. (optional)
     * @param requestedProfileId Configuration profile id to be fetched  Use 0 to indicate all profiles  Null value will use profile id from request or 0 if not set. (optional)
     * @param itemType Item Type  Examples:    Configuration, Bundle, Exclusion, Override, All (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProfilesGetProfilesGetAsync(Integer requestedClientId, Integer requestedProfileId, TaxCalculationSettingTypes itemType, final ApiCallback<TaxCalculationSettingsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2ProfilesGetProfilesGetValidateBeforeCall(requestedClientId, requestedProfileId, itemType, _callback);
        Type localVarReturnType = new TypeToken<TaxCalculationSettingsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2ProfilesSetBundlesPost
     * @param setTaxCalculationSettingRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProfilesSetBundlesPostCall(SetTaxCalculationSettingRequest setTaxCalculationSettingRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = setTaxCalculationSettingRequest;

        // create path and map variables
        String localVarPath = "/api/v2/profiles/SetBundles";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Basic" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2ProfilesSetBundlesPostValidateBeforeCall(SetTaxCalculationSettingRequest setTaxCalculationSettingRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = apiV2ProfilesSetBundlesPostCall(setTaxCalculationSettingRequest, _callback);
        return localVarCall;

    }

    /**
     * Creates or updates bundle packages and associated profile mappings.
     * 
     * @param setTaxCalculationSettingRequest  (optional)
     * @return TaxCalculationSettingsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public TaxCalculationSettingsResponse apiV2ProfilesSetBundlesPost(SetTaxCalculationSettingRequest setTaxCalculationSettingRequest) throws ApiException {
        ApiResponse<TaxCalculationSettingsResponse> localVarResp = apiV2ProfilesSetBundlesPostWithHttpInfo(setTaxCalculationSettingRequest);
        return localVarResp.getData();
    }

    /**
     * Creates or updates bundle packages and associated profile mappings.
     * 
     * @param setTaxCalculationSettingRequest  (optional)
     * @return ApiResponse&lt;TaxCalculationSettingsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TaxCalculationSettingsResponse> apiV2ProfilesSetBundlesPostWithHttpInfo(SetTaxCalculationSettingRequest setTaxCalculationSettingRequest) throws ApiException {
        okhttp3.Call localVarCall = apiV2ProfilesSetBundlesPostValidateBeforeCall(setTaxCalculationSettingRequest, null);
        Type localVarReturnType = new TypeToken<TaxCalculationSettingsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Creates or updates bundle packages and associated profile mappings. (asynchronously)
     * 
     * @param setTaxCalculationSettingRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProfilesSetBundlesPostAsync(SetTaxCalculationSettingRequest setTaxCalculationSettingRequest, final ApiCallback<TaxCalculationSettingsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2ProfilesSetBundlesPostValidateBeforeCall(setTaxCalculationSettingRequest, _callback);
        Type localVarReturnType = new TypeToken<TaxCalculationSettingsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2ProfilesSetConfigPost
     * @param setTaxCalculationSettingRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProfilesSetConfigPostCall(SetTaxCalculationSettingRequest setTaxCalculationSettingRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = setTaxCalculationSettingRequest;

        // create path and map variables
        String localVarPath = "/api/v2/profiles/SetConfig";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Basic" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2ProfilesSetConfigPostValidateBeforeCall(SetTaxCalculationSettingRequest setTaxCalculationSettingRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = apiV2ProfilesSetConfigPostCall(setTaxCalculationSettingRequest, _callback);
        return localVarCall;

    }

    /**
     * Creates or updates configuration settings and associated profile mappings.
     * 
     * @param setTaxCalculationSettingRequest  (optional)
     * @return TaxCalculationSettingsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public TaxCalculationSettingsResponse apiV2ProfilesSetConfigPost(SetTaxCalculationSettingRequest setTaxCalculationSettingRequest) throws ApiException {
        ApiResponse<TaxCalculationSettingsResponse> localVarResp = apiV2ProfilesSetConfigPostWithHttpInfo(setTaxCalculationSettingRequest);
        return localVarResp.getData();
    }

    /**
     * Creates or updates configuration settings and associated profile mappings.
     * 
     * @param setTaxCalculationSettingRequest  (optional)
     * @return ApiResponse&lt;TaxCalculationSettingsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TaxCalculationSettingsResponse> apiV2ProfilesSetConfigPostWithHttpInfo(SetTaxCalculationSettingRequest setTaxCalculationSettingRequest) throws ApiException {
        okhttp3.Call localVarCall = apiV2ProfilesSetConfigPostValidateBeforeCall(setTaxCalculationSettingRequest, null);
        Type localVarReturnType = new TypeToken<TaxCalculationSettingsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Creates or updates configuration settings and associated profile mappings. (asynchronously)
     * 
     * @param setTaxCalculationSettingRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProfilesSetConfigPostAsync(SetTaxCalculationSettingRequest setTaxCalculationSettingRequest, final ApiCallback<TaxCalculationSettingsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2ProfilesSetConfigPostValidateBeforeCall(setTaxCalculationSettingRequest, _callback);
        Type localVarReturnType = new TypeToken<TaxCalculationSettingsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2ProfilesSetExclusionsPost
     * @param setTaxCalculationSettingRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProfilesSetExclusionsPostCall(SetTaxCalculationSettingRequest setTaxCalculationSettingRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = setTaxCalculationSettingRequest;

        // create path and map variables
        String localVarPath = "/api/v2/profiles/SetExclusions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Basic" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2ProfilesSetExclusionsPostValidateBeforeCall(SetTaxCalculationSettingRequest setTaxCalculationSettingRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = apiV2ProfilesSetExclusionsPostCall(setTaxCalculationSettingRequest, _callback);
        return localVarCall;

    }

    /**
     * Creates or updates exclusions and associated profile mappings.
     * 
     * @param setTaxCalculationSettingRequest  (optional)
     * @return TaxCalculationSettingsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public TaxCalculationSettingsResponse apiV2ProfilesSetExclusionsPost(SetTaxCalculationSettingRequest setTaxCalculationSettingRequest) throws ApiException {
        ApiResponse<TaxCalculationSettingsResponse> localVarResp = apiV2ProfilesSetExclusionsPostWithHttpInfo(setTaxCalculationSettingRequest);
        return localVarResp.getData();
    }

    /**
     * Creates or updates exclusions and associated profile mappings.
     * 
     * @param setTaxCalculationSettingRequest  (optional)
     * @return ApiResponse&lt;TaxCalculationSettingsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TaxCalculationSettingsResponse> apiV2ProfilesSetExclusionsPostWithHttpInfo(SetTaxCalculationSettingRequest setTaxCalculationSettingRequest) throws ApiException {
        okhttp3.Call localVarCall = apiV2ProfilesSetExclusionsPostValidateBeforeCall(setTaxCalculationSettingRequest, null);
        Type localVarReturnType = new TypeToken<TaxCalculationSettingsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Creates or updates exclusions and associated profile mappings. (asynchronously)
     * 
     * @param setTaxCalculationSettingRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProfilesSetExclusionsPostAsync(SetTaxCalculationSettingRequest setTaxCalculationSettingRequest, final ApiCallback<TaxCalculationSettingsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2ProfilesSetExclusionsPostValidateBeforeCall(setTaxCalculationSettingRequest, _callback);
        Type localVarReturnType = new TypeToken<TaxCalculationSettingsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2ProfilesSetOverridesPost
     * @param setTaxCalculationSettingRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProfilesSetOverridesPostCall(SetTaxCalculationSettingRequest setTaxCalculationSettingRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = setTaxCalculationSettingRequest;

        // create path and map variables
        String localVarPath = "/api/v2/profiles/SetOverrides";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Basic" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2ProfilesSetOverridesPostValidateBeforeCall(SetTaxCalculationSettingRequest setTaxCalculationSettingRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = apiV2ProfilesSetOverridesPostCall(setTaxCalculationSettingRequest, _callback);
        return localVarCall;

    }

    /**
     * Creates or updates overrides and associated profile mappings.
     * 
     * @param setTaxCalculationSettingRequest  (optional)
     * @return TaxCalculationSettingsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public TaxCalculationSettingsResponse apiV2ProfilesSetOverridesPost(SetTaxCalculationSettingRequest setTaxCalculationSettingRequest) throws ApiException {
        ApiResponse<TaxCalculationSettingsResponse> localVarResp = apiV2ProfilesSetOverridesPostWithHttpInfo(setTaxCalculationSettingRequest);
        return localVarResp.getData();
    }

    /**
     * Creates or updates overrides and associated profile mappings.
     * 
     * @param setTaxCalculationSettingRequest  (optional)
     * @return ApiResponse&lt;TaxCalculationSettingsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TaxCalculationSettingsResponse> apiV2ProfilesSetOverridesPostWithHttpInfo(SetTaxCalculationSettingRequest setTaxCalculationSettingRequest) throws ApiException {
        okhttp3.Call localVarCall = apiV2ProfilesSetOverridesPostValidateBeforeCall(setTaxCalculationSettingRequest, null);
        Type localVarReturnType = new TypeToken<TaxCalculationSettingsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Creates or updates overrides and associated profile mappings. (asynchronously)
     * 
     * @param setTaxCalculationSettingRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProfilesSetOverridesPostAsync(SetTaxCalculationSettingRequest setTaxCalculationSettingRequest, final ApiCallback<TaxCalculationSettingsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2ProfilesSetOverridesPostValidateBeforeCall(setTaxCalculationSettingRequest, _callback);
        Type localVarReturnType = new TypeToken<TaxCalculationSettingsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}